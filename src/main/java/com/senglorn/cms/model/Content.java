package com.senglorn.cms.model;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Content {
    private Integer id;
    private String uuid;
    private String slug;
    private String title;
    private String description;
    private String thumbnail;
    private String keyword;
    private String editor;
    private Boolean isDeleted;
    private LocalDateTime createdAt;

    /* category_id int, foreign key (category_id) references tb_categories (id) */
    private Content content;
}