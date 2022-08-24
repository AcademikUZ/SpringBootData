package fan.company.springbootdatarest.projection;

import org.springframework.data.rest.core.config.Projection;


@Projection(types = fan.company.springbootdatarest.entity.Attachment.class)
public interface CustomAttachment {

    public Long getId();

    public String getName();

    public double getSize();

    public String getContentType();

}
