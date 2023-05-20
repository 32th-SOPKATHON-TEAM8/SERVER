package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathon.domain.Group;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetGroupResponseDto {

    private List<UserResponseDto> user;

    private String penalty;

    public static GetGroupResponseDto of(Group group) {
        return GetGroupResponseDto.builder()
                .user(group.getUserList().stream().map(UserResponseDto::of).collect(Collectors.toList()))
                .penalty(group.getPenalty())
                .build();
    }

}
