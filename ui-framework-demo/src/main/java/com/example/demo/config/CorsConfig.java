package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override  
    public void addCorsMappings(CorsRegistry registry) {
		//配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径
        registry.addMapping("/**")
        		//允许所有的请求域名访问我们的跨域资源，可以固定单条或者多条内容，如：”http://www.aaa.com“，只有该域名可以访问我们的跨域资源
                .allowedOrigins("*")
                .allowCredentials(true)
                //允许所有的请求方法访问该跨域资源服务器，如：POST、GET、PUT、DELETE等
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }
	
}
