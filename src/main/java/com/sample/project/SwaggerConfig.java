/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author abhinavg
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.sample.project"))
                .paths(PathSelectors.regex("*"))
                .build()
                .apiInfo(sampleApiInfo());
    }

    private ApiInfo sampleApiInfo() {
        return new ApiInfoBuilder()
                .title("Sample Project")
                .description("Flourence Assignment")
                .contact(new Contact("Abhinav", "", "garg.abhinav14@gmail.com"))
                .license("MIT")
                .licenseUrl("https://opensource.org/licenses/MIT")
                .version("0.0.1")
                .build();
    }
}
