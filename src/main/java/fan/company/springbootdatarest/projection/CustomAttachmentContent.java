package fan.company.springbootdatarest.projection;

import fan.company.springbootdatarest.entity.Attachment;
import fan.company.springbootdatarest.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    public Long getId();

    public byte[] getBytes();

    public Attachment getAttachment();

}
