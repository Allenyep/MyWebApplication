package ssh.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import ssh.dao.EmployeeDao;
import ssh.domain.Employee;

import java.util.List;

/**
 * Created by allen on 2017/5/7.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    private Session session;
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Employee findByNameAndPass(Employee employee) {
        String hql="from Employee where username=:username and password=:password ";
        session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Query query=session.createQuery(hql);
        query.setParameter("username",employee.getUsername());
        query.setParameter("password",employee.getPassword());
        List<Employee> list=query.list();
        tx.commit();
        session.close();
        if(list.size()>0){
//            System.out.println("DAO:\n"+list.get(0));
            return list.get(0);
        }
        return null;
    }
}
