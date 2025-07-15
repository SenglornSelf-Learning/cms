package com.senglorn.cms.model;

import lombok.*;

import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class User {
    private Integer id;
    private String uuid;
    private String userName;
    private String password;
    private String displayName;
    private Boolean isDeleted;
    private LocalTime createAt;
    private List<Role> roles;
}
