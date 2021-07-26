package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ioc.LgTV;
import ioc.SamsungTV;
import ioc.TV;

@Configuration
public class TVConfig {
	@Bean
    public TV lgCreate() {
        LgTV tv = new LgTV();
        
        return tv;
        //메서드 이름이 빈의 이름으로 등록
    }
    
    @Bean(name="samsung")
    public TV SamsungCreate() {
 
         return new SamsungTV();
    }
}
