package com.cole_anderson.base_camp_job_postings.controllers;

import java.util.List;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.repositories.Repository;
import com.cole_anderson.base_camp_job_postings.repositories.PostgresPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    Repository<JobPost> postRepository;

    @Autowired
    public HomeController(PostgresPostRepository repository) {
        postRepository = repository;
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        List<JobPost> posts = postRepository.findAllPosts();
        model.addAttribute("posts", posts);
        return "home";
    }

    @GetMapping("/posts/{id}")
    public String index(Model model, @PathVariable(value = "id") String id) {
        var post = postRepository.findPostById(Integer.parseInt(id));
        if (post.isPresent()) {
            model.addAttribute("post", post.get());
            return "post_detail_page";
        } else {
            return "404";
        }
    }

    @GetMapping("/posts/{id}/comments")
    public String getPostComments(Model model, @PathVariable(value = "id") String id) {
        var comments = postRepository.findCommentsById(Integer.parseInt(id));
        model.addAttribute("comments", comments);
        return "post_comments_page";
    }
}
