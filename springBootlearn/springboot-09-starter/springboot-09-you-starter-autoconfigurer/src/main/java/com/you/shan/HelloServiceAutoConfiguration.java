package com.you.shan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication //web应用才生效
@EnableConfigurationProperties({HelloProperties.class,PersonProperties.class})
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Autowired
    PersonProperties personProperties;

    @Bean
    public HelloService helloService() {

        System.out.println(personProperties);
        HelloService service = new HelloService();
        service.setHelloProperties(helloProperties);
        return service;
    }
}
