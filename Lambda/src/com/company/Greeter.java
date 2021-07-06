package com.company;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        //an instance of greeting interface which is a custom class
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        //is a lambda expression, a type of a lambda expression is basically an interface
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        helloWorldGreeting.perform();
        lambdaGreeting.perform();
//        greeter.greet(helloWorldGreeting);

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        innerClassGreeting.perform();

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }
}

