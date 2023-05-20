package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import sopt.org.sopkathon.domain.User;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {

    private Long id;

    private String nickname;

    private int life;

    private boolean isHost;

    public static UserResponseDto of(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .nickname(user.getNickname())
                .life(user.getLife())
                .isHost(user.isHost())
                .build();
    }
}
