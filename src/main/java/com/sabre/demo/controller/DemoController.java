package com.sabre.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lau on 17/03/30.
 */
@Controller
public class DemoController {
    @GetMapping(name = "/hello")
    public ModelAndView get() {
        return new ModelAndView("/jqadmin/index.html");
    }

}
