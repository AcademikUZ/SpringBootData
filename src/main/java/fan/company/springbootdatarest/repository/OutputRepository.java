package fan.company.springbootdatarest.repository;


import fan.company.springbootdatarest.entity.Output;
import fan.company.springbootdatarest.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "list", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
    Output findTopByOrderByIdDesc();
}
