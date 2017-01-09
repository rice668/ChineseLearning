import com.west.dao.UserDao;
import com.west.entity.User;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by zhangminglei on 2017/1/9.
 */
public class SaveUser {
  private UserDao userDao;

  @Test
  public void test() {
    User user = new User();
    user.setUsername("Garian");
    user.setPassword("123456");
    user.setCreatedDate(new Date());
    user.setId(1l);
    userDao.save(user);
    if (true) {
      throw new RuntimeException();
    }
  }
}
