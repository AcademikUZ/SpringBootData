package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
