import com.chinasofti.dao.AdminDao;
import com.chinasofti.po.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by allen on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class AdminInsertTest {
    @Autowired
    AdminDao adminDao;

    @Test
    public void adminInsertTest()throws Exception{
        Admin admin=new Admin();
        admin.setAdminId("2");
        admin.setAdminAccount("admin");
        admin.setAdminName("admin");
        admin.setAdminPassword("admin");
        try {
            adminDao.insert(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
