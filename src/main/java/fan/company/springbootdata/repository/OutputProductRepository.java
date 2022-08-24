package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}
