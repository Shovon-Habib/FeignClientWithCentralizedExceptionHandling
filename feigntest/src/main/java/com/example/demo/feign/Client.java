package com.example.demo.feign;

import com.example.demo.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface Client {

    @GetMapping("/posts")
    List<Post> getPost();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable("postId") Long postId);
}
