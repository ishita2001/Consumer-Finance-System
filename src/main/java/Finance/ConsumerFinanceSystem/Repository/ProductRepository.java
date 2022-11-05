package Finance.ConsumerFinanceSystem.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Finance.ConsumerFinanceSystem.Models.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {	
	public List<Product> findByProdName(String prodname);
}