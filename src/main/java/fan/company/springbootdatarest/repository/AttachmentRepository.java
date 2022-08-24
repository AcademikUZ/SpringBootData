package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Attachment;
import fan.company.springbootdatarest.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
