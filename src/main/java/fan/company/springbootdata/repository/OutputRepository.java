package fan.company.springbootdata.repository;


import fan.company.springbootdata.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputRepository extends JpaRepository<Output, Long> {
    Output findTopByOrderByIdDesc();
}
