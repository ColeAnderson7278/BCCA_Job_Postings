package com.cole_anderson.base_camp_job_postings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {
    @GetMapping("/")
    public String getLanding() {
        return "landing";
    }
}
