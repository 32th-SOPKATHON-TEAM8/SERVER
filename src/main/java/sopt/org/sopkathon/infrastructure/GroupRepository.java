package sopt.org.sopkathon.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.Group;

import java.util.Optional;

public interface GroupRepository extends Repository<Group, Long> {

    public Optional<Group> findById(Long groupId);
}
