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
				  "took": 76,
				  "responses": [
				    {
				      "took": 75,
				      "timed_out": false,
				      "_shards": {
				        "total": 1,
				        "successful": 1,
				        "skipped": 0,
				        "failed": 0
				      },
				      "hits": {
				        "total": {
				          "value": 0,
				          "relation": "eq"
				        },
				        "max_score": null,
				        "hits": []
				      },
				      "aggregations": {
				        "3": {
				          "buckets": [
				            {
				              "key_as_string": "1720606680000",
				              "key": 1720606680000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720606740000",
				              "key": 1720606740000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720606800000",
				              "key": 1720606800000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720606860000",
				              "key": 1720606860000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720606920000",
				              "key": 1720606920000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720606980000",
				              "key": 1720606980000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607040000",
				              "key": 1720607040000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607100000",
				              "key": 1720607100000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607160000",
				              "key": 1720607160000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607220000",
				              "key": 1720607220000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607280000",
				              "key": 1720607280000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607340000",
				              "key": 1720607340000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607400000",
				              "key": 1720607400000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607460000",
				              "key": 1720607460000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607520000",
				              "key": 1720607520000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607580000",
				              "key": 1720607580000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607640000",
				              "key": 1720607640000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607700000",
				              "key": 1720607700000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607760000",
				              "key": 1720607760000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607820000",
				              "key": 1720607820000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607880000",
				              "key": 1720607880000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720607940000",
				              "key": 1720607940000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608000000",
				              "key": 1720608000000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608060000",
				              "key": 1720608060000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608120000",
				              "key": 1720608120000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608180000",
				              "key": 1720608180000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608240000",
				              "key": 1720608240000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608300000",
				              "key": 1720608300000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608360000",
				              "key": 1720608360000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608420000",
				              "key": 1720608420000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608480000",
				              "key": 1720608480000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608540000",
				              "key": 1720608540000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608600000",
				              "key": 1720608600000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608660000",
				              "key": 1720608660000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608720000",
				              "key": 1720608720000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608780000",
				              "key": 1720608780000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608840000",
				              "key": 1720608840000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608900000",
				              "key": 1720608900000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720608960000",
				              "key": 1720608960000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609020000",
				              "key": 1720609020000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609080000",
				              "key": 1720609080000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609140000",
				              "key": 1720609140000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609200000",
				              "key": 1720609200000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609260000",
				              "key": 1720609260000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609320000",
				              "key": 1720609320000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609380000",
				              "key": 1720609380000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609440000",
				              "key": 1720609440000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609500000",
				              "key": 1720609500000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609560000",
				              "key": 1720609560000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609620000",
				              "key": 1720609620000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609680000",
				              "key": 1720609680000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609740000",
				              "key": 1720609740000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609800000",
				              "key": 1720609800000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609860000",
				              "key": 1720609860000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609920000",
				              "key": 1720609920000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720609980000",
				              "key": 1720609980000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720610040000",
				              "key": 1720610040000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720610100000",
				              "key": 1720610100000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720610160000",
				              "key": 1720610160000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720610220000",
				              "key": 1720610220000,
				              "doc_count": 0
				            },
				            {
				              "key_as_string": "1720610280000",
				              "key": 1720610280000,
				              "doc_count": 0
				            }
				          ]
				        }
				      },
				      "status": 200
				    }
				  ]
				}
				""";
	}

}
