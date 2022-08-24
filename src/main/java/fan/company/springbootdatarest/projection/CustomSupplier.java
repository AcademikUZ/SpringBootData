package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    public Long getId();

    public String getName();

    public String getPhoneNumber();

    public boolean isActive();
}
