package com.kyee;

import com.kyee.framework.config.MyApplicationStartedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = "com.kyee.mapper")
public class HcrmwebserviceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application
//				.listeners(new MyApplicationStartedEventListener())
				.sources(HcrmwebserviceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HcrmwebserviceApplication.class, args);
	}
}
