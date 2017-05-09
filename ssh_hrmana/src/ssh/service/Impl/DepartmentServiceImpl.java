package ssh.service.Impl;

import ssh.dao.DepartmentDao;
import ssh.domain.Department;
import ssh.domain.PageBean;
import ssh.service.DepartmentService;

import java.util.List;

/**
 * Created by allen on 2017/5/9.
 */
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public PageBean<Department> findByPage(int currPage) {
        PageBean<Department> pageBean = new PageBean<Department>();
        pageBean.setCurrPage(currPage);
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        int totalCount = departmentDao.findCount();
        pageBean.setTotalCount(totalCount);
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);
        pageBean.setTotalPage(num.intValue());
        int begin = (currPage - 1) * pageSize;
        List<Department> list=departmentDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }
}
