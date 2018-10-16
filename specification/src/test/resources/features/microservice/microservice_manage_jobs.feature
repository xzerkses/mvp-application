Feature: Manage jobs specs
  In order keep an index of jobs
  As a microservice
  I want to import jobs from external sources

  Scenario: Import jobs from sources
  Given I am up and running
  When I am triggered by a job scheduler
  Then I will make a call, and I will import the received jobs

  Scenario: Expose jobs to searchers
  Given I am a user of the microservice
  And the microservice is up and running
  When I am searching for jobs
  And I enter my search criteria
  Then I will receive the corresponding list of jobs