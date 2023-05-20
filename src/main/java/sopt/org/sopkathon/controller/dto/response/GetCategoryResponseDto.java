package sopt.org.sopkathon.controller.dto.response;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sopt.org.sopkathon.controller.dto.CategoryDto;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetCategoryResponseDto {

    private List<CategoryDto> categories;

    public static GetCategoryResponseDto of(List<CategoryDto> categories) {
        return new GetCategoryResponseDto(categories);
    }

}
