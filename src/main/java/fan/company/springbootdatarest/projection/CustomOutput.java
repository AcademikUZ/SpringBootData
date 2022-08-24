package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Client;
import fan.company.springbootdatarest.entity.Currency;
import fan.company.springbootdatarest.entity.Output;
import fan.company.springbootdatarest.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {

    public Long getId();

    public Date getDate();

    public WareHouse getWarehouse();

    public Client getClient();

    public Currency getCurrency();

    public String getFactureNumber();

    public String getCode();

}
