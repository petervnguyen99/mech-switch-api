package com.switches.mechswitchapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin
@RestController
public class DefaultController {

    @GetMapping("/")
    public void redirectToSwaggerUi(final HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

}
