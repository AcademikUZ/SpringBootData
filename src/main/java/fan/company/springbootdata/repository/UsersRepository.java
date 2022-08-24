package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Users;
import fan.company.springbootdata.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findTopByOrderByIdDesc();
}
