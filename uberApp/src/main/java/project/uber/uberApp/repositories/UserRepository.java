package project.uber.uberApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.uber.uberApp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
