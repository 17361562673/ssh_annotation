/**
 * @ClassName UserServiceImple
 * @Authror zhouzhiqiang
 * @Date 2020/3/13 13:13
 * @description
 * @version 1.0
 */
package erp.service.serviceImple;

import erp.dao.UserDao;
import erp.model.User;
import erp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
public class UserServiceImple implements UserService {
    //注入userDao
    @Resource(name = "userDaoImple")
    private UserDao userDao;
    //设置事务注解
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
