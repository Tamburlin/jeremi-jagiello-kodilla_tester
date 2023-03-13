package com.kodilla.spring.basic.dependency_injection;

public class FacebookMessageService implements MessageService {

    @Override
    public void send(String message, String receiver) {
        System.out.println("Sendind [" + message + "] to: " + receiver + " using facebook.");
    }
}
