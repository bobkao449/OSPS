package com.example.OSPS;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/OSPS")
public class MyController {
    @GetMapping("/login")
    public ModelAndView getAll(){
        ModelAndView modelAndView = new ModelAndView("login");

            return modelAndView;
    }
    @GetMapping("/map1")
    public ModelAndView map1() {
        ModelAndView modelAndView = new ModelAndView("map1");
        // 可以添加需要的模型屬性
        return modelAndView;
    }

    @GetMapping("/map2")
    public ModelAndView map2() {
        ModelAndView modelAndView = new ModelAndView("map2");
        // 可以添加需要的模型屬性
        return modelAndView;
    }

    @GetMapping("/homepage")
    public ModelAndView homepage() {
        ModelAndView modelAndView = new ModelAndView("homepage");
        // 可以添加需要的模型屬性
        return modelAndView;
    }

}
