package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.Test;

import java.util.Date;
import java.util.EnumSet;

/**
 * Created by allen on 2017/5/2.
 */
public class TestStudents {

    @Test
    public void testSchemaExport(){
        /*//创建配置对象
        Configuration config=new Configuration().configure();
        //创建注册服务对象
//        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        //创建会话工厂对象
        SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
        //会话对象
        Session session=sessionFactory.getCurrentSession();
        //Schema对象
        MetadataImplementor metadataImplementor = (MetadataImplementor)
                new MetadataSources(serviceRegistry).buildMetadata();
        SchemaExport export = new SchemaExport();
        export.create(EnumSet.of(TargetType.DATABASE),metadataImplementor);*/


        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        //创建sessionFactory
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建session对象
         Session session = sessionFactory.getCurrentSession();
        //创建Metadata对象
        //MetadataImplementor metadataImplementor = (MetadataImplementor) new MetadataSources(serviceRegistry).buildMetadata();
        Metadata metadata =new MetadataSources(serviceRegistry).buildMetadata();

        //创建SchemaExport对象
        SchemaExport export = new SchemaExport();
        export.create(EnumSet.of(TargetType.DATABASE),metadata);

    }


    //添加学生类
    @Test
    public void testSaveStudents(){
        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        //创建sessionFactory
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建session对象
        Session session = sessionFactory.getCurrentSession();
        //创建事务对象
        Transaction tx=session.beginTransaction();

        Students stu1=new Students("s0001","Allen","male",new Date(),"Airland");
        Students stu2=new Students("s0002","Jack","male",new Date(),"China");
        Students stu3=new Students("s0003","Jane","female",new Date(),"Japan");

        session.save(stu1);
        session.save(stu2);
        session.save(stu3);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
