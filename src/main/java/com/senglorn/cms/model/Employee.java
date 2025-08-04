package com.senglorn.cms.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
