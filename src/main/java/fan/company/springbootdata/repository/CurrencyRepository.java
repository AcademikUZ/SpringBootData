package fan.company.springbootdata.repository;

import fan.company.springbootdata.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
