package com.lou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author loufeng
 * @date 2018/9/10 下午4:10
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "Kiki");
        return "index";
    }
}
