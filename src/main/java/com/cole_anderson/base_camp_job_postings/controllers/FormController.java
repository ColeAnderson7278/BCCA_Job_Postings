package com.cole_anderson.base_camp_job_postings.controllers;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.models.JobPostForm;
import com.cole_anderson.base_camp_job_postings.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    Repository<JobPost> postRepostitory;

    @Autowired
    public FormController(PostgresPostRepository repository) {
        postRepostitory = repository;
    }

    @GetMapping("/post_job")
    public String getForm() {
        return "position_form";
    }

    @PostMapping("/post_job")
    public String postForm(JobPostForm form) {
        JobPost post = new JobPost(form.getCompanyName(), form.getCompanyPhone(), form.getCompanyEmail(),
                form.getCompanyAddress(), form.getPosition(), form.getPositionDetails(), form.getPositionBenefits());
        postRepostitory.saveJobPost(post);
        return "redirect:/home";
    }
}
