package com.cole_anderson.base_camp_job_postings.controllers;

import java.util.List;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.models.Comment;
import com.cole_anderson.base_camp_job_postings.repositories.Repository;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.cole_anderson.base_camp_job_postings.repositories.PostgresPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class AdminHomeController {
    Repository<JobPost> postRepository;

    @Autowired
    public AdminHomeController(PostgresPostRepository repository) {
        postRepository = repository;
    }

    @GetMapping("/admin/home")
    public String getHome(Model model) {
        List<JobPost> posts = postRepository.findAllPosts();
        model.addAttribute("posts", posts);
        return "admin_home";
    }

    @GetMapping("/admin/posts/{id}")
    public String index(Model model, @PathVariable(value = "id") String id) {
        var post = postRepository.findById(Integer.parseInt(id));
        if (post.isPresent()) {
            model.addAttribute("post", post.get());
            return "admin_post_detail_page";
        } else {
            return "404";
        }
    }

    @PostMapping("/admin/posts/{id}")
    public String postComment(Comment comment, @PathVariable(value = "id") String id) {
        comment.setPostId(Integer.parseInt(id));
        postRepository.saveComment(comment);
        return "redirect:/admin/home";
    }
}
