package com.example.shoppingback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userEmail;//유저 이메일
    private String phoneNum;//전화번호
    private String address;//주소
    private String token;//간편 로그인 토큰
    private String img;//프로필
    private String diet;//유저 식단 정보
    private String nickName;//유저 닉네임

}
