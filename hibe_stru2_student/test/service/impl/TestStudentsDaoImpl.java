package service.impl;

import entity.Students;
import org.junit.Assert;
import org.junit.Test;
import service.StudentsDao;

import java.util.Date;
import java.util.List;

/**
 * Created by allen on 2017/5/3.
 */
public class TestStudentsDaoImpl {

    @Test
    public void testQueryAllStudents(){
        StudentsDao sDao=new StudentsDaoImpl();
        List<Students> list=sDao.queryAllStudents();

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testGetNewSid(){
        StudentsDaoImpl sDao=new StudentsDaoImpl();
//        System.out.println(sDao.getNewSid());
    }

    @Test
    public void testAddStudents(){
        Students s=new Students();
        s.setSname("Jack");
        s.setGender("male");
        s.setBirthday(new Date());
        s.setAddress("England");
        StudentsDao sDao=new StudentsDaoImpl();
        Assert.assertEquals(true,sDao.addStudents(s));
    }
}
