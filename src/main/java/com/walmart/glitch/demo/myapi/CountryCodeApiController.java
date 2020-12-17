package com.walmart.glitch.demo.myapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.locationService.base-path:}")
public class CountryCodeApiController implements CountryCodeApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CountryCodeApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }



}
