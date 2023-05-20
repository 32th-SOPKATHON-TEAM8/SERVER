package sopt.org.sopkathon.infrastructure;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.User;

public interface UserRepository extends Repository<User, Long> {

    Optional<User> findById(Long id);

    void save(User user);

    List<User> findByGroupIdOrderByLife(Long groupId);
}
