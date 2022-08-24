package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputRepository extends JpaRepository<Input, Long> {
   Input findTopByOrderByIdDesc();
}
