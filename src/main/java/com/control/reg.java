package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("reg")
public class reg {
    @RequestMapping(value = "lg", method = RequestMethod.GET,params = {"name","pass=123","!bbb"})
    public String login(String name){
        System.out.println("reg的login"+name);
        return "/index.jsp";
    }

    @RequestMapping(value = "a/{uid}/lg2")
    public String login2(@RequestParam("name") String na, @PathVariable("uid") String uuid){
        System.out.println("reg的login"+na);
        System.out.println("reg的login"+uuid);
        return "/index.jsp";
    }
    @RequestMapping("ts")
    public String login3(HttpServletRequest req, Model model){
        req.setAttribute("","");
        model.addAttribute("ss","22");
        return "/index.jsp";
    }
}
