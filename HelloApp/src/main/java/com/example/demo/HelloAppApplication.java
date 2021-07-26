package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ioc.SamsungTV;
import ioc.TV;

@SpringBootApplication
public class HelloAppApplication {

	public static void main(String[] args) {
		//아래 run이 자동으로 Bean을 찾아서 생성해 준다 그래서 두번 생성되므로 아래 주석처리 해 줌!
		
		//SpringApplication.run(HelloAppApplication.class, args);
		
		 // 추가적인 입력 부분
        // 1.IoC 컨테이너 생성
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TVConfig.class);
        
       // 2.LgTV Bean 가져오기
        TV lg = (TV)context.getBean("lgCreate");
        lg.powerOn();
        lg.volumeUp();
        lg.volumeDown();
        lg.powerOff();
    
        // 3.Member Bean 가져오기 , SamsungTV.class 이거 안 써도 작동함!
        TV samsung = (TV)context.getBean("samsung", SamsungTV.class);
        samsung.powerOn();
        samsung.volumeUp();
        samsung.volumeDown();
        samsung.powerOff();
	}

}
