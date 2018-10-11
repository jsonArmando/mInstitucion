package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.testng.annotations.ITestOrConfiguration;

import javax.naming.spi.Resolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class SpringWeb implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver GetInternalResourceViewResolver()
    {
        InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
        ViewResolver.setViewClass(JstlView.class);
        ViewResolver.setPrefix("/WEB-INF/views/");
        ViewResolver.setSuffix(".jsp");
        return  ViewResolver;
    }
    @Bean
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver Resolver = new CommonsMultipartResolver();
        Resolver.setDefaultEncoding("utf-8");
        return Resolver;
    }
}
