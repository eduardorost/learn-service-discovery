package br.com.demo.api;


import com.netflix.hystrix.exception.HystrixRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DemoOneApi {

    @RequestMapping(value = "/v1/demo", method = RequestMethod.GET)
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("DEMO 1 application.");
    }

}
