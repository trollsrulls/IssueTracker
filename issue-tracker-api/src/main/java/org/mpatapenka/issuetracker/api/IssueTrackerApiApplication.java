package org.mpatapenka.issuetracker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class IssueTrackerApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(IssueTrackerApiApplication.class, args);
  }
}