package ssh.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import ssh.dao.DepartmentDao;
import ssh.domain.Department;

import java.util.List;

/**
 * Created by allen on 2017/5/9.
 */
public class DepartmentDaoImpl implements DepartmentDao {

    private Session session;
    private SessionFactory sessionFactory;
    public void setSessionFactory(org.hibernate.SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }


    @Override
    public int findCount() {
        String hql="select count(*) from Department ";
        session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Query query=session.createQuery(hql);
        List<Long> list=query.list();
        tx.commit();
        session.close();
//        List<Long> list= (List<Long>) this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Department> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);
//        List<Department> list= (List<Department>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
//        return list;
        return null;
    }
}
