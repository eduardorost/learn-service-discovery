package br.com.demo.config;

import feign.Request;
import feign.RetryableException;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Value("${ribbon.ReadTimeout}")
    private int ribbonReadTimeout;

    @Value("${ribbon.ConnectTimeout}")
    private int ribbonConnectionTimeout;

    @Bean
    Request.Options requestOptions(){
        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }

    @Bean
    public Retryer retryer() {
        return new Retryer() {

            @Override
            public void continueOrPropagate(RetryableException e) {
                throw e;
            }

            @Override
            public Retryer clone() {
                return this;
            }
        };
    }
}
