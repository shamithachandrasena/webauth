package com.samsl.webauth.controllers;

import com.samsl.onemarketsl.characters.User;
import com.samsl.security.sevices.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi/security")
public class AuthenticationController extends com.samsl.security.controllers.AuthenticationController{

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String authenticateUser(User user) {
        return authenticate(user);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User registerUser(User user) {
        return register(user);
    }

}
