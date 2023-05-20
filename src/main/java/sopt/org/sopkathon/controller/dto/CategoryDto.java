package sopt.org.sopkathon.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sopt.org.sopkathon.domain.Category;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryDto {

    private Long id;
    private String name;

    public static CategoryDto of(Category category) {
        return new CategoryDto(category.getId(), category.getName());
    }

}
