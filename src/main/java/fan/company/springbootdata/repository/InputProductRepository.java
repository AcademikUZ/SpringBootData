package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
