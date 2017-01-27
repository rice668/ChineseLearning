package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangminglei on 2017/1/27.
 */
@Controller
public class HelloWorldController {

  @RequestMapping("/helloworld")
  public ModelAndView hello() {
    String helloWorldMessage = "Hello world from rice!";
    return new ModelAndView("/hellos", "messaget", helloWorldMessage);
  }
}
