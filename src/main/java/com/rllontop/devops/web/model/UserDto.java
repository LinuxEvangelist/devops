package com.rllontop.devops.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    @Builder
    public UserDto(String user, String pwd, String token) {
        this.user = user;
        this.pwd = pwd;
        this.token = token;
    }
        private String user;
        private String pwd;
        private String token;
}
