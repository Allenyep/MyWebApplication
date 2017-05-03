package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.Users;
import service.UsersDao;
import service.impl.UsersDaoImpl;

/**
 * Created by allen on 2017/5/2.
 */
public class UsersAction extends SuperAction implements ModelDriven<Users> {

    private static final long serialVersion=1L;

    private Users user=new Users();

    //用户登录
    public String login(){
        UsersDao usersDao=new UsersDaoImpl();
        if(usersDao.userslogin(user)){
            session.setAttribute("username",user.getUsername());
            return "login_success";
        }else {
            return "login_failure";
        }
    }

    //用户注销
    public String logout(){
        if(session.getAttribute("username")!=null){
            session.removeAttribute("username");
        }
        return "logout_success";
    }

    @Override
    public Users getModel() {
        return this.user;
    }
}
