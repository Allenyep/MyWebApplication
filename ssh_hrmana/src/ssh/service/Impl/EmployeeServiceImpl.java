package ssh.service.Impl;

import org.springframework.transaction.annotation.Transactional;
import ssh.dao.EmployeeDao;
import ssh.dao.Impl.EmployeeDaoImpl;
import ssh.domain.Employee;
import ssh.service.EmployeeService;

/**
 * Created by allen on 2017/5/7.
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    //登录
    @Override
    public Employee login(Employee employee) {
        Employee esistemployee=employeeDao.findByNameAndPass(employee);
//        System.out.println("Service\n"+esistemployee.toString());
        return esistemployee;
    }
}
