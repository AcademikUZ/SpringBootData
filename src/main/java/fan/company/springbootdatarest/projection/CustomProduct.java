package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Attachment;
import fan.company.springbootdatarest.entity.Category;
import fan.company.springbootdatarest.entity.Measurement;
import fan.company.springbootdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {

    public Long getId();

    public String getName();

    public Category getCategory();

    public Attachment getPhoto();

    public String getCode();

    public Measurement getMeasurement();

    public boolean isActive();
}
