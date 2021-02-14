# projectBike
As a biker I would like to know the exact location of city bikes around the world in a given application.
- Endpoint: http://api.citybik.es/v2/networks
- Auth: No
- HTTPS: No
- Understands how the API works.
- Create some BDD scenarios and automate them using Java to test the API
- Test this particular scenario: “As a user I want to verify that the city Frankfurt is in Germany and return their corresponded latitude and longitude”

My Framework details.

- I investigate APIs and generate POJO classes to map responses as an object.
- I create a CityBikeService to use in step definitions.
- I used String format to test APIs for different environment. Now we can run tests for test environment just setting env as a test.
- My framework is Cucumber (BDD). 
- I built my framework using Java Programming Language.
- I used maven as a build automation tool for my java project.
- I used cucumber-junit and Cucumber runner to orchestrate tests.
- Inside the Cucumber runner, I used glues in order to connect feature files to step definitions.
- I added report plugin to Cucumber Runner to generate Json and html report.
- I have utilities package, which contains utility classes such as ConfigUtils and DBUtils.
- I am using Cucumber and Gherkin language in order non-technical people to understand what is going on in testing.
- I used Cucumber Datatable feature to verify Location object. 
- I have created my test cases in the feature files as is.
- In Feature folder I store my feature files separately, it helps in usability of the codes.
- I use Initialize as pre- and post-test implementations.
- Step Definitions folder is the place where my actual test scripts are.
- For assertions / verifications, to compare expected and actual results I utilize Hamcrest Matcher.
- I also use tags for tests that I want to run in bulk.
- My framework is completely easy to maintain.
