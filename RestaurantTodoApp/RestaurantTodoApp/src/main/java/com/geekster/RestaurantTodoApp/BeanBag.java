package com.geekster.RestaurantTodoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBag {
    @Bean
    public List<ResTodo> getDataSource(){
        return new ArrayList<>();
    }
}
