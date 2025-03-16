package splitWise.src.main.java.com.backendlld.splitwise.repositories;

import com.backendlld.splitwise.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRespository  extends JpaRepository<Group, Long> {
}
