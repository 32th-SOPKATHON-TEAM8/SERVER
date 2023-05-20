package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathon.domain.Group;
import sopt.org.sopkathon.domain.User;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetGroupResponseDto {

    private List<UserResponseDto> user;

    private String penalty;

    public static GetGroupResponseDto of(Group group, List<UserResponseDto> userList) {

        return GetGroupResponseDto.builder()
                .user(userList)
                .penalty(group.getPenalty())
                .build();
    }

}
