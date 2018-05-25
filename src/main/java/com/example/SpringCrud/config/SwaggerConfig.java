package com.example.SpringCrud.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
// TODO: Auto-generated Javadoc

/**
 * The Class SwaggerConfig.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    /**
     * Product api.
     *
     * @return the docket
     */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.SpringCrud"))
                .paths(regex("/api/v1/.*"))
                .build()
                .apiInfo(metaData());
    }
    
    /**
     * Meta data.
     *
     * @return the api info
     */
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot Crud With Swagger 2",
                "Spring Boot REST API",
                "1.0",
                "Terms of service",
                new Contact("Sudhir Ojha", "https://www.oodlestechnologies.com/team/about", "sudhir.kumar@oodlestechnologies.com"),
                "Copyright OodlesTechnologies.",
                "https://www.oodlestechnologies.com/");
        return apiInfo;
    }
}

