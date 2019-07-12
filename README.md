# Lambda-with-Api-Gateway
Let’s use Lambda to expose our repeated-word-in-sentence functionality to the world!

## Features
- A user should be able to find the first repeated word in a sentence by visiting a URL.
  - That URL should use API Gateway to call a Lambda function that finds the first repeated word in a sentence.
  - You should use a query string parameter to pass in the sentence data.

# Lambda Warmer
Write a lambda warmer for an existing Lambda function.

## Features
- Your Lambda to create thumbnail versions of images should never be cold. You should accomplish this in two ways:
  - First, create a CloudWatch timer to help keep it alive. Take a screenshot of this for submission.
  - Second, pick one of your existing EC2 instances and set up a cron job to ping the API Gateway version of your Lambda. Commit your cron-linux.config file to a repo to show that this is working.

  - ![The Trigger](https://github.com/mattburger/Lambda-with-Api-Gateway/blob/master/src/main/resources/trigger.png)
  - ![Metrics](https://github.com/mattburger/Lambda-with-Api-Gateway/blob/master/src/main/resources/metrics.png)