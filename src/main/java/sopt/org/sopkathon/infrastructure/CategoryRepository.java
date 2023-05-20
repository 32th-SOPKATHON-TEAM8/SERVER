package sopt.org.sopkathon.infrastructure;

import java.util.List;
import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.Category;

public interface CategoryRepository extends Repository<Category, Long> {
    List<Category> findAll();
}
