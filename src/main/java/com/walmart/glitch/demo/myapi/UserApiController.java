package com.walmart.glitch.demo.myapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-16T10:44:51.122+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.reflectoring.base-path:}")
public class UserApiController implements UserApi {

    private final UserApiDelegate delegate;

    public UserApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UserApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserApiDelegate() {});
    }

    @Override
    public UserApiDelegate getDelegate() {
        return delegate;
    }

}
