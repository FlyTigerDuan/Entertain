package com.dfh.enter.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class JMSProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String message) {
        this.jmsTemplate.convertAndSend(destination,message);
    }
}
