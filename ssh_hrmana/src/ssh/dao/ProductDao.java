package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import ssh.domain.Product;

/**
 * Created by allen on 2017/5/5.
 */

public class ProductDao{
    private Session session;
    private SessionFactory sessionFactory;


    public void save(Product product) {
        System.out.println("Dao save...............");
        System.out.println(product);
//        this.getHibernateTemplate().save(product);
        this.session=sessionFactory.getCurrentSession();
        Transaction tx=session.beginTransaction();
        session.save(product);
        tx.commit();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
