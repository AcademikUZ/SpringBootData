package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Measurement;
import fan.company.springbootdatarest.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}
