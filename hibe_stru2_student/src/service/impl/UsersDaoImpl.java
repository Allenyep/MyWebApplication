package service.impl;

import db.MyHibernateSessionFactory;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import service.UsersDao;

import java.util.List;

/**
 * Created by allen on 2017/5/2.
 */
public class UsersDaoImpl implements UsersDao {
    @Override
    public boolean userslogin(Users u) {
        //事务对象
        Transaction tx=null;
        String hql="";
        String sql="";
        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().openSession();
            tx=session.beginTransaction();
            hql="from Users where username=? and password=? ";

            Query query=session.createQuery(hql);
//          Query<Users> query = session.createQuery(hql, Users.class);
            query.setParameter(0,u.getUsername());
            query.setParameter(1,u.getPassword());
//            List<Users> list = query.getResultList();
            List list=query.list();
            tx.commit();//提交事务
            if(list.size()>0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if(tx!=null){
//                tx.commit();
                tx=null;
            }
        }
    }
}
