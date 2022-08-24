package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}
