/**
 * @ClassName UserAction
 * @Authror zhouzhiqiang
 * @Date 2020/3/13 13:24
 * @description
 * @version 1.0
 */
package erp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import erp.model.User;
import erp.service.UserService;

import javax.annotation.Resource;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    //对user必须有get set方法
    private User user=new User();
    //注入 userService
    @Resource(name = "userServiceImple")
    private UserService userService;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public User getModel() {
        return user;
    }

    public String test() {
        userService.saveUser(user);
        return SUCCESS;
    }
}
