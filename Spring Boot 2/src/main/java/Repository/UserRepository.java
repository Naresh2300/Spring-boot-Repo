package Repository;
import com.Springboot.Entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> 
/* First name is Entity name & second is Primary Key Name*/ {
}
