package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Input;
import fan.company.springbootdatarest.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}
