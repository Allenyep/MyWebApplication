import com.chinasofti.dao.userDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by allen on 2017/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class UserSelectTest {

    @Autowired
    userDao userDao;
    @Test
    public void UserSeclet() throws Exception {
        System.out.println(this.userDao.select("allen").getAccount());
    }
}
