package com.ds4ouj.board.springboot.web.dto;

import com.ds4ouj.board.springboot.domain.Posts;

public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public Long GetId() { return this.id; }
    public String GetTitle() { return this.title; }
    public String GetContent() { return this.content; }
    public String GetAuthor() { return this.author; }

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
