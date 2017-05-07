package ssh.service;

import org.springframework.transaction.annotation.Transactional;
import ssh.dao.ProductDao;
import ssh.domain.Product;

/**
 * Created by allen on 2017/5/5.
 */
@Transactional
public class ProductService {
    //业务层注入Dao
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save(Product product){
        System.out.println("Serveice save...............");
        productDao.save(product);
    }

}
