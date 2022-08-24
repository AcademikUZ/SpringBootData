package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {

    public Long getId();

    public String getName();

    public boolean isActive();
}
