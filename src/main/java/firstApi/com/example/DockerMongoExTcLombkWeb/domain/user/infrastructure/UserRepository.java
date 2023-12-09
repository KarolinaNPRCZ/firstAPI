package firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.infrastructure;


import firstApi.com.example.DockerMongoExTcLombkWeb.domain.user.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> getUserSessionById(Long id);
}