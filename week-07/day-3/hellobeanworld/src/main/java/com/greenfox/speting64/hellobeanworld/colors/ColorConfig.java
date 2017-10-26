package com.greenfox.speting64.hellobeanworld.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public GreenColor greenColor(){
        return new GreenColor();
    }

    @Bean
    public YellowColor yellowColor(){
        return new YellowColor();
    }
}
