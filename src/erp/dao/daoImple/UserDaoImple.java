/**
 * @ClassName UserDaoImple
 * @Authror zhouzhiqiang
 * @Date 2020/3/13 13:09
 * @description
 * @version 1.0
 */
package erp.dao.daoImple;

import erp.dao.UserDao;
import erp.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImple implements UserDao {
    //注入sessionFactory
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
    @Override
    public void saveUser(User user) {
        //调用session进行保存
        sessionFactory.getCurrentSession().save(user);
    }
}
