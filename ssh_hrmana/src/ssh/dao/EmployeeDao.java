package ssh.dao;

import ssh.domain.Employee;

/**
 * Created by allen on 2017/5/7.
 */
public interface EmployeeDao {
    Employee findByNameAndPass(Employee employee);

}
