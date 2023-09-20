package com.goit.Module13.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public ModelAndView testMethod(){
        ModelAndView res = new ModelAndView();
        res.addObject("hwText", "Hello World");
        return res;
    }
}
