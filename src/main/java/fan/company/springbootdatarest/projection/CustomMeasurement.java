package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    public Long getId();

    public String getName();

    public boolean isActive();
}
