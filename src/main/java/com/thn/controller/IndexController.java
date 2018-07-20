package com.thn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: 田浩楠
 * @create: 2018-07-12 12:48
 **/
@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
