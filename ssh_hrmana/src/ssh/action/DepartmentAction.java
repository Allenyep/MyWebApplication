package ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ssh.domain.Department;
import ssh.domain.PageBean;
import ssh.service.DepartmentService;

/**
 * Created by allen on 2017/5/9.
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
    //模型驱动对象
    private Department department = new Department();

    private DepartmentService departmentService;

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public Department getModel() {
        return this.department;
    }

    private int currPage = 1;

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public String findAll() {
        PageBean<Department> pageBean=departmentService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }
}
