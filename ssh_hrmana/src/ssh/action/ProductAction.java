package ssh.action;

/**
 * Created by allen on 2017/5/5.
 */

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ssh.domain.Product;
import ssh.service.ProductService;

/**
 * 商品管理Aciton
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
    //驱动类
    private Product product=new Product();
    //通过插件注入
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @Override
    public Product getModel() {
        return this.product;
    }

    public String save(){
        System.out.println("action save.................");
        System.out.println(product);
        try{
            productService.save(product);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "NONE";
    }
}
