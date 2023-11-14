package Repository;

import com.Springboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User, Long> /* First name is Entity name & second is Primary Key Name*/ {
}
