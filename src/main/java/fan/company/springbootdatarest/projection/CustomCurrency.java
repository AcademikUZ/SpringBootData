package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {

    public Long getId();

    public String getName();

    public boolean isActive();

    public Currency getParentCategory();
}
