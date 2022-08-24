package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
}
