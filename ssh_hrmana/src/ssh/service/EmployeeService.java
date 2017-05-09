package ssh.service;

import ssh.domain.Employee;

/**
 * Created by allen on 2017/5/7.
 */
public interface EmployeeService {
    //登录
    public Employee login(Employee employee);
}
