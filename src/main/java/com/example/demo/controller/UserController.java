package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

////Basic One
//@Controller
//public class UserController {
//    @RequestMapping(path = "/")
//    @ResponseBody
//    public String index() {
//        return "<h1> Hello</h1>";
//    }
//}

//
////Return static HTML
//@Controller
//public class UserController {
//    @RequestMapping(path = "/")
//    public String index() {
//        return "idx";
//    }
//}


//Return HTMP Template with parameter filled
@Controller
public class UserController {

    @RequestMapping(path = "/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("idx");
        mav.getModel().put("user","My name");
        return mav;
    }
}