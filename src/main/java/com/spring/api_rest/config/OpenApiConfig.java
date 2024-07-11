package com.spring.api_rest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTFUL API with Java 17 and Spring Boot 3")
                        .version("v1")
                        .description("Esta API permite gerenciar informações de pessoas, oferecendo operações de criação, leitura, atualização e exclusão (CRUD).")
                        .license(new License().name("Apache 2.0")));
    }
}
