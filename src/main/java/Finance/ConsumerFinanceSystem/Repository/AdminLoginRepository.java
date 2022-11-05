package Finance.ConsumerFinanceSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Finance.ConsumerFinanceSystem.Models.AdminLogin;


@Repository
public interface AdminLoginRepository extends JpaRepository< AdminLogin , Long> {
	public AdminLogin findUserByAdminName(String admin_name);
}
