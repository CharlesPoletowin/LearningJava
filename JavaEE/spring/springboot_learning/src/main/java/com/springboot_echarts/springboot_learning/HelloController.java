package com.springboot_echarts.springboot_learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/echartsdemo")
    public String  MyDemo(){
        return "echartsdemo";
    }

    @RequestMapping("/echarts")
    public String myECharts(Model model){
        String skirt = "裙子";
        int nums = 30;

        model.addAttribute("skirt", skirt);
        model.addAttribute("nums", nums);

        return "echarts";
    }
}
