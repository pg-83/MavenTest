package com.jai;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;

import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.client.*;
import org.eclipse.egit.github.core.service.IssueService;

@RestController
public class CountryController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/api/javainuse2", produces="application/json", consumes="application/json")
	public String sayHello2() throws IOException {
		GitHubClient client = new GitHubClient("api.github.com");
		client.setCredentials("pg-83", "Sadhana-11");
		IssueService issueService = new IssueService(client);
		/*try {
		Issue issue = new Issue();
        issue.setTitle("1221");
        issue.setBody("body-body");
		issueService.createIssue("pg-83", "test1", issue);
		
		} catch (RequestException e) {
		    e.printStackTrace();
		  }*/
		  return IssueService.STATE_OPEN;
	}
	}
	

