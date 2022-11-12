package pl.slowacki.projectmango.controllers;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.projectmango.model.Post;

import java.util.HashMap;
import java.util.Map;


@RestController
public class PostController {
    private Map<Integer, Post> posts = new HashMap<>();

    @GetMapping("/api/v1/posts")
    public Map<Integer, Post> getPosts(){
        return posts;
    }
    @GetMapping("/api/v1/posts/{id}")
    public Post getPost(@PathVariable int id){
        return posts.get(id);
    }
    @PostMapping("/api/v1/posts") // Generate id server side
    public String createPost(@RequestBody Post post){
        posts.put(post.getId(),post);
        return "ok"; // TODO: return status:ok in json
    }
    @DeleteMapping("api/v1/posts/{id}")
    public String deletePost(@PathVariable int id){
        posts.remove(id);
        return "ok"; // TODO: Same as above
    }
}
