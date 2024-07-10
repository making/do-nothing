package com.example.opinionated.elasticsearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElasticsearchApiController {
	@GetMapping(path = "/_mapping")
	public String mapping() {
		return """
				{
				  "mappings": {
				    "log": {
				      "properties": {
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
				""";
	}
}
