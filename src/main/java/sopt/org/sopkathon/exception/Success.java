package sopt.org.sopkathon.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Success {

    /**
     * 200 OK
     */
    GET_USER_INFO_SUCCESS(HttpStatus.OK, "유저 정보 조회 성공"),
    GET_GROUP_INFO_SUCCESS(HttpStatus.OK, "그룹 정보 조회 성공"),
    /**
     * 201 CREATED
     */
    CREATE_COMMENT_SUCCESS(HttpStatus.CREATED, "댓글 작성 완료"),
    FOLLOW_USER_SUCCESS(HttpStatus.CREATED, "팔로우 완료"),
    POST_PIN_SAVE_SUCCESS(HttpStatus.CREATED, "핀 저장 성공"),
    CREATE_PIN_SUCCESS(HttpStatus.CREATED, "핀 생성 성공")
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
