package com.example.opinionated.elasticsearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElasticsearchApiController {

	@GetMapping(path = "/_mapping")
	public String mapping() {
		return this.mappingForIndex("logs");
	}

	@GetMapping(path = "/{index}/_mapping")
	public String mappingForIndex(@PathVariable String index) {
		return """
				{
				  "%s":{
				    "mappings": {
				      "properties": {
				        "@timestamp": { "type": "date" },
				        "log_id": { "type": "integer" },
				        "timestamp": { "type": "date" },
				        "observed_timestamp": { "type": "date" },
				        "severity_text": { "type": "text" },
				        "severity_number": { "type": "integer" },
				        "service_name": { "type": "text" },
				        "scope": { "type": "text" },
				        "body": { "type": "text" },
				        "trace_id": { "type": "text" },
				        "span_id": { "type": "text" },
				        "trace_flags": { "type": "integer" },
				        "attributes": { "type": "object" },
				        "resource_attributes": { "type": "object" }
				      }
				    }
				  }
				}
				""".formatted(index);
	}

	@PostMapping(path = "/_msearch")
	public String msearch(@RequestBody String body) {
		System.out.println("body=" + body);
		return """
				{
				  "took": 46,
				  "responses": [
				    {
				      "took": 45,
				      "timed_out": false,
				      "_shards": {
				        "total": 1,
				        "successful": 1,
				        "skipped": 0,
				        "failed": 0
				      },
				      "hits": {
				        "total": {
				          "value": 1,
				          "relation": "eq"
				        },
				        "max_score": 1.0,
				        "hits": [
				          {
				            "_index": "logs",
				            "_id": "UYRpm5AB3a7xj_r-FDPT",
				            "_score": 1.0,
				            "_source": {
				              "@timestamp": "2099-11-15T13:12:00",
				              "message": "GET /search HTTP/1.1 200 1070000",
				              "user": {
				                "id": "kimchy"
				              }
				            }
				          }
				        ]
				      },
				      "status": 200
				    }
				  ]
				}
				""";
	}

}
