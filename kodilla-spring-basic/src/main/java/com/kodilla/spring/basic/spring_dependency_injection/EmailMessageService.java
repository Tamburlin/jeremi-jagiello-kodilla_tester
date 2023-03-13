package com.kodilla.spring.basic.spring_dependency_injection;

//@Component
public class EmailMessageService implements MessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " via Email";
    }
}
