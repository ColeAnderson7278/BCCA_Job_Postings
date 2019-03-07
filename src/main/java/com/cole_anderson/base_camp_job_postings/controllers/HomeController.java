package com.cole_anderson.base_camp_job_postings.controllers;

import java.util.List;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.repositories.Repository;
import com.cole_anderson.base_camp_job_postings.repositories.PostgresPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    Repository<JobPost> postRepository;

    @Autowired
    public HomeController(PostgresPostRepository repository) {
        postRepository = repository;
    }

    @GetMapping("/")
    public String getHome(Model model) {
        List<JobPost> posts = postRepository.findAllPosts();
        model.addAttribute("posts", posts);
        return "home";
    }
}
