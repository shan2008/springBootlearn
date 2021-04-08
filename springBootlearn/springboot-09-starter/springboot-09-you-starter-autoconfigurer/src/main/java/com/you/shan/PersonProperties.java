package com.you.shan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: syou
 * @Date: 2021/4/8 10:31
 */


@Component
@PropertySource("classpath:person.properties")
@ConfigurationProperties
public class PersonProperties {
    private String name;
    private Integer id;
    private List<String> readBooks;
}
