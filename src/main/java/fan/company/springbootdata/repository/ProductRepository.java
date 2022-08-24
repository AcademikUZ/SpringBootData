package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findTopByOrderByIdDesc();

}
