package com.ds4ouj.board.springboot.web.dto;


import com.ds4ouj.board.springboot.domain.Posts;

public class PostsUpdateRequestDto {
    private String title;
    private String content;

    PostsUpdateRequestDto() {}
    PostsUpdateRequestDto(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
    }

    public String getTitle() { return this.title; }
    public String getContent() { return this.content; }

    public static class Builder {
        private String title;
        private String content;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public PostsUpdateRequestDto build() {
            return new PostsUpdateRequestDto(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
