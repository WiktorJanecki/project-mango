package pl.slowacki.projectmango.controllers;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.projectmango.model.Tag;

import java.util.HashMap;
import java.util.Map;

public class TagController {
    private Map<Integer, Tag> tags = new HashMap<>();

    @GetMapping("/api/v1/tags")
    public Map<Integer, Tag> getTags(){
        return tags;
    }
    @GetMapping("/api/v1/tags/{id}")
    public Tag getTag(@PathVariable int id){
        return tags.get(id);
    }
    @PostMapping("/api/v1/tags") //TODO: Generate id server side
    public String createTag(@RequestBody Tag tag){
        tags.put(tag.getId(),tag);
        return "ok"; // TODO: return status:ok in json
    }
    @DeleteMapping("api/v1/tags/{id}")
    public String deleteTag(@PathVariable int id){
        tags.remove(id);
        return "ok"; // TODO: Same as above
    }
}
