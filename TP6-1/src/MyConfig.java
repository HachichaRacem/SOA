package org.example.HachichaRacem_LSI3_SOA_TP6;

import org.example.HachichaRacem_LSI3_SOA_TP6.web.jaxrs;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig1 = new ResourceConfig();
        resourceConfig1.register(jaxrs.class);
        return resourceConfig1;
    }
}
