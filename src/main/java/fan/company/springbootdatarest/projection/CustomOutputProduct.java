package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Output;
import fan.company.springbootdatarest.entity.OutputProduct;
import fan.company.springbootdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    public Long getId();

    public Product getProduct();

    public double getAmount();

    public double getPrice();

    public Output getOutput();

}
