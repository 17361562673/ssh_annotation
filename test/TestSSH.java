import erp.model.User;
import erp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class TestSSH {
    //注入userService
    @Resource(name = "userServiceImple")
   private UserService userService;
    @Test
    public void test() {
        User user = new User();
        user.setUserName("dasgas");
        user.setPassword("2313213");
        userService.saveUser(user);
    }
}
