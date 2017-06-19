package com.prototype.wsdl.facturas.suministro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by aitor on 06/06/2017.
 */
@Configuration
public class FacturasConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.prototype.wsdl.facturas.suministro"); // hello.wsdl
        return marshaller;
    }



}