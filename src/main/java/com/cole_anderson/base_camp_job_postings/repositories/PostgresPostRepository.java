package com.cole_anderson.base_camp_job_postings.repositories;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        String columns = "company_name, company_phone, company_email, company_address, position, position_details, position_benefits";
        jdbc.update("INSERT INTO job_posts (" + columns + ") VALUES (?,?,?,?,?,?,?);", post.getCompanyName(),
                post.getCompanyPhone(), post.getCompanyEmail(), post.getCompanyAddress(), post.getPosition(),
                post.getPositionDetails(), post.getPositionBenefits());
    }

    public List<JobPost> findAllPosts() {
        return jdbc.query("SELECT * FROM job_posts;", this::mapToJobPost);
    }

    public JobPost mapToJobPost(ResultSet rs, int rowNum) throws SQLException {
        return new JobPost(rs.getInt("id"), rs.getString("company_name"), rs.getString("company_phone"),
                rs.getString("company_email"), rs.getString("company_address"), rs.getString("position"),
                rs.getString("position_details"), rs.getString("position_benefits"));
    }
}
