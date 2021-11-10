package com.ds4ouj.board.springboot.web.dto;


import com.ds4ouj.board.springboot.domain.Posts;

public class PostsListResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
