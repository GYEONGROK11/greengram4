package com.greengram.greengram4.user.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class UserSigninVo {
    private int result;
    private int iuser;
    private String nm;
    private String pic;
    private String firebaseToken;
    private String accessToken;


}
