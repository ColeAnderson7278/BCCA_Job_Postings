package com.cole_anderson.base_camp_job_postings.repositories;

import com.cole_anderson.base_camp_job_postings.models.JobPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PostgresPostRepository
        implements com.cole_anderson.base_camp_job_postings.repositories.Repository<JobPost> {
    private JdbcTemplate jdbc;

    @Autowired
    public PostgresPostRepository(JdbcTemplate jdbcTemplate) {
        jdbc = jdbcTemplate;
    }

    public void saveJobPost(JobPost post) {
        String columns = "company_name, company_phone, company_email, company_address, position, position_details, position_benefits, posted_date";
        jdbc.update("INSERT INTO job_posts (" + columns + ") VALUES (?,?,?,?,?,?,?,?);", post.getCompanyName(),
                post.getCompanyPhone(), post.getCompanyEmail(), post.getCompanyAddress(), post.getPosition(),
                post.getPositionDetails(), post.getPositionBenefits(), post.getPostedDate());
    }
}
