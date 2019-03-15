package com.cole_anderson.base_camp_job_postings.controllers;

import java.util.List;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.repositories.Repository;
import com.cole_anderson.base_camp_job_postings.repositories.PostgresPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminFormController {
    Repository<JobPost> postRepository;

    @Autowired
    public AdminFormController(PostgresPostRepository repository) {
        postRepository = repository;
    }

    @PostMapping("/admin/posts/{id}/delete")
    public String postComment(@PathVariable(value = "id") String id) {
        postRepository.deletePostById(Integer.parseInt(id));
        return "redirect:/admin/home";
    }

    @PostMapping("/admin/posts/{post_id}/comments/{id}/delete")
    public String postComment(@PathVariable(value = "id") String id, @PathVariable(value = "post_id") String post_id) {
        postRepository.deleteCommentById(Integer.parseInt(id));
        return "redirect:/admin/posts/" + post_id + "/comments";
    }
}
