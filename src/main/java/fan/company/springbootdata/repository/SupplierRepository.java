package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
