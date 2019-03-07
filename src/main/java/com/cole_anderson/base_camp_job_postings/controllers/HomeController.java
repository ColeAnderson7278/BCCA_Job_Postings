package com.cole_anderson.base_camp_job_postings.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Model model) {
        List<JobPost> jobPosts = appRepostitory.findAll();
        model.addAttribute("posts", jobPosts)
        return "home";
    }
}
