package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.InputProduct;
import fan.company.springbootdatarest.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputproduct", collectionResourceRel = "list", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
