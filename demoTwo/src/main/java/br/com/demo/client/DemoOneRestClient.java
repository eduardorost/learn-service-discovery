package br.com.demo.client;

import br.com.demo.config.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "demoOne-service", configuration = FeignConfiguration.class)
public interface DemoOneRestClient {

    @RequestMapping(value = "/v1/demo", method = RequestMethod.GET)
    ResponseEntity<String> demo();
	    
}
