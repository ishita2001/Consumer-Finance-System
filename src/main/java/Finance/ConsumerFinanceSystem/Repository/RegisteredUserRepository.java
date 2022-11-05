package Finance.ConsumerFinanceSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Finance.ConsumerFinanceSystem.Models.RegisteredUser;



@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Long>{
	public RegisteredUser findUserByUserName(String user_name);
	
}
