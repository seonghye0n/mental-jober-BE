package com.fastcampus.jober.global.constant;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ErrorCode {

    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다"),
    INVALID_ID(HttpStatus.BAD_REQUEST, "유효하지 않은 id값입니다"),
    INVALID_AUTHENTICATION(HttpStatus.UNAUTHORIZED, "인증되지 않았습니다"),
    INVALID_ACCESS(HttpStatus.METHOD_NOT_ALLOWED, "잘못된 접근입니다"),
    INVALID_USER(HttpStatus.FORBIDDEN, "권한이 없습니다"),
    EMPTY_ID(HttpStatus.BAD_REQUEST, "아이디를 입력해주세요"),
    EMPTY_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호를 입력해주세요"),
    EXISTING_EMAIL(HttpStatus.BAD_REQUEST, "이미 존재하는 이메일입니다"),
    CHECK_ID_PASSWORD(HttpStatus.BAD_REQUEST, "아이디와 비밀번호를 확인해주세요"),
    CHECK_ID(HttpStatus.BAD_REQUEST, "아이디를 확인해주세요"),
    CHECK_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호를 확인해주세요"),
    TEMPLATE_NOT_FOUND(HttpStatus.BAD_REQUEST, "템플릿 정보를 찾을 수 없습니다."),
    TEMPLATE_TYPE_NOT_FOUND(HttpStatus.BAD_REQUEST, "템플릿 분류를 확인해주세요."),
    PAGE_BAD_REQUEST(HttpStatus.BAD_REQUEST, "페이지 번호는 0보다 작을 수 없습니다."),
    MY_TEMPLATE_NOT_FOUND(HttpStatus.BAD_REQUEST, "내 템플릿 정보를 찾을 수 없습니다."),
    MY_TEMPLATE_MEMBER_NOT_MATCHED(HttpStatus.BAD_REQUEST, "본인의 템플릿만 해제가 가능합니다."),
    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "사용자 정보를 찾을 수 없습니다."),
    EXPIRED_JWT_TOKEN(HttpStatus.UNAUTHORIZED, "토큰이 만료 되었습니다."),
    ILLEGAL_ARGUMENT(HttpStatus.UNAUTHORIZED, "잘못된 토큰입니다."),
    UNSUPPORTED_JWT(HttpStatus.UNAUTHORIZED, "지원되지 않는 토큰입니다."),
    DUPLICATED_EMAIL(HttpStatus.UNAUTHORIZED, "중복된 이메일입니다."),
    INVALID_SIGNATURE(HttpStatus.UNAUTHORIZED, "잘못된 서명입니다."),
    MALFORMED_TOKEN(HttpStatus.UNAUTHORIZED, "잘못된 토큰입니다."),
    UNKNOWN_TOKEN_ERROR(HttpStatus.UNAUTHORIZED, "알 수 없는 토큰 에러가 발생했습니다."),
    SPACEWALL_NOT_FOUND(HttpStatus.BAD_REQUEST, "공유페이지를 찾을 수 없습니다."),
    SPACEWALLTEMP_NOT_FOUND(HttpStatus.BAD_REQUEST, "임시 공유페이지를 찾을 수 없습니다."),
    INVALID_COMPONENT_TYPE(HttpStatus.BAD_REQUEST, "유효하지 않은 type입니다")

    ;

    private final HttpStatus httpStatus;
    private final String message;

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return httpStatus.value();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
