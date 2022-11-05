package Finance.ConsumerFinanceSystem.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Finance.ConsumerFinanceSystem.Models.TransactionHistory;



@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long>{
	public List<TransactionHistory> findByRegid(Long regid);
	
}
