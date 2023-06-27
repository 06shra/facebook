package com.spring.social.controller;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FacebookController {
	private Facebook facebook;

    private ConnectionRepository connectionRepository;
    
    @Override
    public String toString() {

        return "FacebookController [facebook=" + facebook + ", connectionRepository=" + connectionRepository + "]";
    }

}
