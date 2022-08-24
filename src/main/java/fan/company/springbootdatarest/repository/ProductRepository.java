package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Product;
import fan.company.springbootdatarest.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findTopByOrderByIdDesc();

}
