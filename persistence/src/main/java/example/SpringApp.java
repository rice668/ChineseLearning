package example;

import com.west.entity.User;
import com.west.pojo.DataResult;
import com.west.pojo.Result;
import com.west.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangminglei on 2017/1/11.
 */
public class SpringApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
    UserService userService = (UserService)context.getBean("userServiceImpl");
    Result result = userService.login("test", "test");
    System.out.println(result.isSuccess());
    System.out.println(((DataResult<User>) result).getData().getCreatedDate());
  }
}
