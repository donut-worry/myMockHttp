# myRestTests
Sample project to implement test classes that make REST requests and process response.

## How to run
* Install Maven (mvn) in your computer if necessary. 
* Download, install and initialize MarkLogic Server.
* Clone this repo : git clone <repo-url>
* Update your MarkLogic instance details in this file : PROJECT_DIR/src/test/resources/serverInfo.json
* Run tests using this command : mvn tests 
  * Note: you can also import this project into IntelliJ and run form there

## Project Status
#### Logstical work
- [x] Install IntelliJ
- [x] Add Maven plugin to IntelliJ
- [x] Add Maven dependencies - Apache HTTP client, Jackson
- [x] Create Maven project and create repo with it on Git Hub (this repo)
- [x] Install TestNG plugin (or add it as Maven dependency?)

#### Develop Java Classes / Methods to be able to do these
- [x] HTTP GET using Apache HTTP Client
- [x] Parse JSON response -- using Jackson
- [x] Add Basic Authentication to the requests
- [x] Construct JSON payload (for POST) -- using Jackson
- [ ] ~~Parse multipart Response from the server~~
- [x] Add support for POST
- [x] Add Support for PUT
- [x] Add Support for Delete
- [x] Add SSL support (HTTPS)
- [ ] Add Concurrency (min, max users)
- [x] Write tests that can be executed via TestNG
 
## APIS used for testing are from this list
* Management APIs : [http://docs.marklogic.com/REST/management]
* Document Management APIS : [http://docs.marklogic.com/REST/client/management]

