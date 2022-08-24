package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.WareHouse;
import fan.company.springbootdatarest.projection.CustomWareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
}
