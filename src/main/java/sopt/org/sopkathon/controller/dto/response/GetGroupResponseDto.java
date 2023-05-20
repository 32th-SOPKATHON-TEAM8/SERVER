package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathon.domain.Group;

import java.util.List;

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
