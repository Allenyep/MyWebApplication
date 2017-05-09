package ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ssh.domain.Employee;
import ssh.service.EmployeeService;
import ssh.service.Impl.EmployeeServiceImpl;

/**
 * Created by allen on 2017/5/7.
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
    //模型驱动
    private Employee employee=new Employee();

    public String login(){
        System.out.println("====================employee_login ====================");
        Employee existEmployee=employeeService.login(employee);
        if(existEmployee!=null){
            //登录成功
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }else {
            //登录失败
            this.addActionError("用户名或密码错误");
            return INPUT;
        }
    }
    //注入业务层类
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee getModel() {
        return this.employee;
    }
}
