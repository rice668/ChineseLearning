package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by zhangminglei on 2017/1/27.
 */
@Controller
public class HelloWorldController {

  @RequestMapping("/helloworlds")
  public ModelAndView hello() {
    String helloWorldMessage = "一年之计在于春，一天之计在于晨 from " + new Date();
    return new ModelAndView("/hellos", "messaget", helloWorldMessage);
  }
}
