package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Client;
import fan.company.springbootdatarest.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
}
