package com.qx.wechat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This configuration class is used to enable Swagger in project
 * @author macky
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qx.wechat.rest"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("IBM SOS Auth Rest API")
                .description("IBM SOS Auth Rest API")
                .termsOfServiceUrl("http://w3.ibm.com")
                .contact("liuyunsh@cn.ibm.com")
                .version("3.0")
                .license("Copyright IBM Corporation 2017, 2019")
                .licenseUrl("https://www.ibm.com")
                .build();
    }


}
