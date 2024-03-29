package com.ds4ouj.board.springboot.web;


import com.ds4ouj.board.springboot.service.PostsService;
import com.ds4ouj.board.springboot.web.dto.PostsResponseDto;
import com.ds4ouj.board.springboot.web.dto.PostsSaveRequestDto;
import com.ds4ouj.board.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostsApiController {
    private final PostsService postsService;

    public PostsApiController(PostsService postsService) {
        this.postsService = postsService;
    }

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
