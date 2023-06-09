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
    GET_GROUP_INFO_SUCCESS(HttpStatus.OK, "그룹 정보 조회 성공"),
    GET_CATEGORY_SUCCESS(HttpStatus.OK, "카테고리 조회 성공"),
    PATCH_REPORT_SUCCESS(HttpStatus.OK, "고발 성공")
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
