package ssh.service;

import ssh.domain.Department;
import ssh.domain.PageBean;

/**
 * Created by allen on 2017/5/9.
 */
public interface DepartmentService {
    PageBean<Department> findByPage(int currPage);
}
