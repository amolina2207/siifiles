package com.ak.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by amolina on 22/05/17.
 */
public class MvcConfig extends WebMvcConfigurerAdapter {

    public MvcConfig(){
        super();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
