package sopt.org.sopkathon.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.CategoryDto;
import sopt.org.sopkathon.controller.dto.response.GetCategoryResponseDto;
import sopt.org.sopkathon.infrastructure.CategoryRepository;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryrepository;

    public GetCategoryResponseDto getAllCategories() {
        List<CategoryDto> categories = categoryrepository.findAll().stream().map(CategoryDto::of)
            .collect(Collectors.toList());

        return GetCategoryResponseDto.of(categories);
    }
}
