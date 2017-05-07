package ssh.service.Impl;

import ssh.dao.EmployeeDao;
import ssh.service.EmployeeService;

/**
 * Created by allen on 2017/5/7.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
