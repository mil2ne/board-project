package com.example.boardproject.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private Article article; // 게시글 (id) - FK
    private String content; // 본문

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
