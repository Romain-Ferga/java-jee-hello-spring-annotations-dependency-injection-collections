package com.spring.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.annotations.beans.SampleBean;

@Configuration
@ComponentScan("com.spring.annotations.beans")
public class ConfigBean {

	public static void main(String args[]) {

		try {

			AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(ConfigBean.class);

			SampleBean sampleBean = ctxt.getBean("SampleBean", SampleBean.class);

			System.out.println(sampleBean.getList());

			ctxt.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
