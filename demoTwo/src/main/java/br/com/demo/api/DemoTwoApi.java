package br.com.demo.api;


import com.netflix.hystrix.exception.HystrixRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.demo.client.DemoOneRestClient;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DemoTwoApi {

	@Autowired
	private DemoOneRestClient demoOneRestClient;

    @RequestMapping(value = "/v2/demo", method = RequestMethod.GET)
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("DEMO 2 application that depends on " + demoOneRestClient.demo().getBody());
    }

}
