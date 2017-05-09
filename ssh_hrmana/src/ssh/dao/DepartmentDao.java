package ssh.dao;

import ssh.domain.Department;

import java.util.List;

/**
 * Created by allen on 2017/5/9.
 */
public interface DepartmentDao {
    int findCount();

    List<Department> findByPage(int begin, int pageSize);
}
