package pl.slowacki.projectmango.controllers;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.projectmango.model.Comment;

import java.util.HashMap;
import java.util.Map;

public class CommentController {
    private Map<Integer,Map<Integer, Comment>> comments = new HashMap<>();

    @GetMapping("/api/v1/posts/{id}/comments")
    public Map<Integer, Comment> getComments(@PathVariable int id){
        return comments.get(id);
    }
    @GetMapping("/api/v1/posts/{id}/comments/{cid}")
    public Comment getComment(@PathVariable int id, @PathVariable int cid){
        return comments.get(id).get(cid);
    }
    @PostMapping("/api/v1/posts/{id}/comments") // TODO: generate some things server side
    public String createComment(@PathVariable int id, @RequestBody Comment comment){
        if(!comments.containsKey(id)) {
            comments.put(id,new HashMap<Integer,Comment>());
        }
        comments.get(id).put(comment.getId(), comment);
        return "ok"; // TODO: return status:ok in json
    }
    @DeleteMapping("api/v1/posts/{id}/comments/{cid}")
    public String deleteComment(@PathVariable int id, @PathVariable int cid){
        comments.get(id).remove(cid);
        return "ok"; // TODO: Same as above
    }
}
