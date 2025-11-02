package com.telcomate.TelcoMate.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/index")
    public String getProductById(Model model, Authentication user){
        if(user.getPrincipal() instanceof OidcUser oidcUser){
            model.addAttribute("user",oidcUser.getAttributes());
        }

      //  System.out.println(user.getPrincipal().);
        return "index";
    }
}
