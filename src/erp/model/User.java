/**
 * @ClassName User
 * @Authror zhouzhiqiang
 * @Date 2020/3/13 13:08
 * @description
 * @version 1.0
 */
package erp.model;

public class User {
    private Integer userId;
    private String userName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
