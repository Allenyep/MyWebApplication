package ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ssh.domain.Employee;
import ssh.service.EmployeeService;

/**
 * Created by allen on 2017/5/7.
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
    //模型驱动
    private Employee employee=new Employee();

    public String login(){
        System.out.println("====================employee_login ====================");
        return "login_success";
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
