//package web.controller;
//
//import com.west.pojo.Result;
//import com.west.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import javax.annotation.Resource;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by zhangminglei on 2017/1/9.
// */
//@Controller
//@RequestMapping("/user")
//public class UserController {
//  private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
//
//  @Resource
//  private UserService userService;
//
//  @RequestMapping(method = RequestMethod.POST)
//  public String login(HttpServletRequest request) {
//    Result result = userService.login(request.getParameter("password"), request.getParameter("username"));
//    if (result.isSuccess()) {
//      return "index";
//    } else {
//      return "error";
//    }
//  }
//
//}
