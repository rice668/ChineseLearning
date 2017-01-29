package web.controller;

import com.west.entity.User;
import com.west.pojo.Result;
import com.west.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangminglei on 2017/1/29.
 */
@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
  public Result addUser(@RequestBody String data) {
    return new Result(true);
  }

}
