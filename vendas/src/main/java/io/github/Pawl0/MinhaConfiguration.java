package io.github.Pawl0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String ApplicationName(){
        return "Sistema de Vendas";
    }
}
