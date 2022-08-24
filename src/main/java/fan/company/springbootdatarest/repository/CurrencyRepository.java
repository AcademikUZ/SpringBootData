package fan.company.springbootdatarest.repository;

import fan.company.springbootdatarest.entity.Currency;
import fan.company.springbootdatarest.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
