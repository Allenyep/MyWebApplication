package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by allen on 2017/5/2.
 */
public class MyHibernateSessionFactory {
    private static SessionFactory sessionFactory;//会话工厂属性

    //私有构造方法 保障单例模式
    private MyHibernateSessionFactory(){
    }

    //公有静态方法 获得工厂对象
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration config=new Configuration().configure();
            //方法有差异
            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
//            sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
            sessionFactory=config.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }else {
            return sessionFactory;
        }
    }
}
