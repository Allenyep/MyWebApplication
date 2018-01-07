package entity;

/**
 * 管理员 管理员ID 账号 密码
 * Created by allen on 2017/12/26.
 */
public class Admin {
    private String userid;
    private String username;
    private String password;

    public Admin(String userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
