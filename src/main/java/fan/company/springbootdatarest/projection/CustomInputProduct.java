package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Input;
import fan.company.springbootdatarest.entity.InputProduct;
import fan.company.springbootdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    public Long getId();

    public Product getProduct();

    public double getAmount();

    public double getPrice();

    public Date getExpireDate();

    public Input getInput();

}
