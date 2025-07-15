package com.senglorn.cms.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Category {
    private Integer id;
    private String name;
    private Boolean isDeleted;
}
