# java-junit-random-sample

This project is meant to show the usage of JUnit, Mockito and Powermock for unit testing in Java.
To be able to show some "real" examples a kind of dummy application is provided here to have some
usecases for the different tests. The dummy application does really nothing, but it has some of the
patterns we might encounter in testing like usage of a repository and some static methods from some
tool-like classes. Not that this might not be the best design, but I think we often see this in real life.
If not, even better and probably easier for unit testing.

Ther eis also a corresponding blog article to this repository that can be found from here and explains in 
more detail the approaches shown here: https://blog.codecentric.de/en/2016/03/junit-testing-using-mockito-powermock/

# Random Results

Added one additonal accert for 

File: /src/test/java/com/codecentric/sample/store/service/CustomerServiceTest.java 

Test: testPLZAddressCombination 

The relevant rows marked by comments with string //random ...

# Tests result report (for Jenkins Usage in RCC context)
Source Code Management: Git: https://github.com/Pavel-Vovk/java-junit-random-sample.git 

Build Triggers: Build periodically: H Н/4 * * * 

Build: Invoke top-level Maven targets: Goals: test 

Post-build Actions: Publish JUnit test result report: target/surefire-reports/*.xml 

