package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.Session;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by allen on 2017/5/2.
 */

//所有Aciton父类
public class SuperAction extends ActionSupport implements ServletContextAware,ServletRequestAware,ServletResponseAware{


    private static final long serialVersion=1L;
    protected HttpServletResponse response;//相应对象
    protected HttpSession session;//会话对象
    protected HttpServletRequest request;//请求对象
    protected ServletContext application;//全局对象

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;
        this.session=request.getSession();
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response=response;
    }

    @Override
    public void setServletContext(ServletContext application) {
        this.application=application;
    }
}
