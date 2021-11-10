package com.ds4ouj.board.springboot.web.dto;


import com.ds4ouj.board.springboot.domain.Posts;

public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public PostsSaveRequestDto() {}
    public PostsSaveRequestDto(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }

    public String getTitle() { return this.title; }
    public String getContent() { return this.content; }
    public String getAuthor() { return this.author; }

    public static class Builder {
        private String title;
        private String content;
        private String author;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public PostsSaveRequestDto build() {
            return new PostsSaveRequestDto(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}

