# Spring AOP example

The idea of this app is to show AOP in use.

1. General concepts:
    - Interface `TaskChecker` describes a general approach on how to validate the `TaskRequest` objects
    - As a result `check` method will return `TaskResult`
    - After each call of `check`, we need to send data to a third party server 
    that collects user attempts statistic data.
    
1. There are three controllers. Consider we can't have one general controller, 
so for each course (Java, JS, SQL, Python, etc.), we will have a separate controller.
1. Adding the logic of sending task check result to a 3-rd party server is not an action for controllers 
or `TaskChecker` interface implementations. 
1. See `StatisticsAspect.java` class as an example of an aspect that performs sending of statistic to a third-party server
