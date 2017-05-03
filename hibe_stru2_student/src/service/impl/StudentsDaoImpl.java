package service.impl;

import db.MyHibernateSessionFactory;
import entity.Students;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import service.StudentsDao;

import java.util.List;

/**
 * Created by allen on 2017/5/3.
 */

//学生业务逻辑实现
public class StudentsDaoImpl implements StudentsDao {


    @Override
    public List<Students> queryAllStudents() {
        Transaction tx=null;
        List<Students> list=null;
        String hql="";

        try{
            Session session= MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            hql="from Students ";
            Query query=session.createQuery(hql);
            list=query.list();
            tx.commit();
            return list;
        }catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return null;
        }finally {
            if(tx!=null){
//                tx.commit();
                tx=null;
            }
        }
    }

    @Override
    public Students queryStudentById(String sid) {
        Transaction tx=null;
        Students stu=null;

        try{
            Session session= MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            stu=session.get(Students.class,sid);
            tx.commit();
            return stu;
        }catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return null;
        }finally {
            if(tx!=null){
//                tx.commit();
                tx=null;
            }
        }
    }

    @Override
    public boolean addStudents(Students s) {
        s.setSid(getNewSid());
        Transaction tx=null;
        try {
            Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            session.save(s);
            tx.commit();
            return true;
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

    @Override
    public boolean updateStudents(Students s) {
        Transaction tx=null;
        try {
            Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            session.update(s);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
            return false;
        }finally {
            if(tx!=null){
//                tx.commit();
                tx=null;
            }
        }
        return false;
    }

    @Override
    public boolean deleteStudents(String sid) {
        Transaction tx=null;
        String hql="";

        try {
            Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            Students stu=session.get(Students.class,sid);
            session.delete(stu);
            tx.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return false;
        }finally {
            if(tx!=null){
                tx=null;
            }
        }
    }


    //生成学生学号
    private String getNewSid(){
        Transaction tx=null;
        String hql="";
        String sid=null;
        try {
            Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx=session.beginTransaction();
            hql="select max(sid) from Students ";
            Query query=session.createQuery(hql);
            sid= (String) query.uniqueResult();
            if(sid==null||sid.equals("")){
                sid="s0001";
            }else {
                String temp=sid.substring(1);
                int i=Integer.parseInt(temp);
                i++;
                temp=String.valueOf(i);
                int len=temp.length();
                for(int j=0;j<4-len;j++){
                    temp="0"+temp;
                }
                sid="s"+temp;
            }
            tx.commit();
            return sid;
        }catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return null;
        }finally {
            if(tx!=null){
                tx=null;
            }
        }
    }
}
