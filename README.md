# CS320-Software-Testing-Portfolio

CS320 Software Testing, Automation, and Quality Assurance Portfolio

This repository contains selected artifacts from my CS320 Software Testing course. The projects demonstrate my experience with unit testing, requirements-based testing, software quality assurance, and using testing to identify problems and verify that software behaves as expected. 

## Portfolio Artifacts

### Project One — Contact Service

The Project One artifacts demonstrate the development and testing of a Contact Service. The repository includes the Contact and ContactService classes along with their JUnit test classes. The tests verify required functionality as well as invalid inputs and expected exceptions.

### Project Two — Summary and Reflections

The Project Two report summarizes my testing approach and reflects on different software testing techniques, testing mindset, software quality, bias, and technical debt. The project included 50 passing JUnit tests and achieved 95.1% overall code coverage.

## Reflection

### How can I ensure that my code, program, or software is functional and secure?

I can verify that my software is functional by testing it against the requirements rather than assuming the code works because it runs. In CS320, I used JUnit tests to verify that the Contact and ContactService classes behaved as expected. Testing helped me find problems that were not always obvious from the code itself. I learned that tests should cover different situations, including valid data, invalid data, boundary conditions, and expected errors. Following requirements carefully and testing different conditions gives me more confidence that the software is working correctly. Security also starts with this process because software needs to properly validate and handle input rather than assuming that users will always provide valid information.

### How do I interpret user needs and incorporate them into a program?

I interpret user needs by taking the requirements and turning them into specific functionality that the program needs to provide. The Contact Service project helped me understand how detailed requirements affect both the code and the tests. Requirements such as specific field lengths, required methods, and the ability to add, update, retrieve, and delete contacts all had to be reflected in the program. I also learned that requirements should guide the tests I create. Instead of testing randomly, I can use the requirements to determine what should happen and then verify that the program produces the expected result. This makes it more likely that the finished software actually meets the user's needs.

### How do I approach designing software?

I approach software design by starting with the requirements and breaking the problem into smaller, manageable parts. I try to give classes and methods clear responsibilities so that the code is easier to understand, maintain, and test. My experience in CS320 showed me that testing should be considered during the design process rather than being something added only at the end. If software is difficult to test, that can be a sign that the design could be improved. Overall, I approach software design by understanding what is required, planning how the different parts should work together, implementing the solution, and using testing to identify areas that need improvement.
