package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Currency;
import fan.company.springbootdatarest.entity.Input;
import fan.company.springbootdatarest.entity.Supplier;
import fan.company.springbootdatarest.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {

    public Long getId();

    public Date getDate();

    public WareHouse getWarehouse();

    public Supplier getSupplier();

    public Currency getCurrency();

    public String getFactureNumber();

    public String getCode();
}
