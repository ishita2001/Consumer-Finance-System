package Finance.ConsumerFinanceSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Finance.ConsumerFinanceSystem.Models.CardDetails;


@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Long> {
	 public CardDetails findCardByRegId(Long reg_id);
}
