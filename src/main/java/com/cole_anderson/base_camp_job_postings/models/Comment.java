package com.cole_anderson.base_camp_job_postings.models;

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

public class Comment {
    public Integer id;

    @NotNull
    public String admin_name;

    @NotNull
    public String comment;

    @NotNull
    public String company_email;

    public Integer post_id;

    // public String posted_date;

    public Comment(Integer id, String admin_name, String comment, Integer post_id) {
        this.id = id;
        this.admin_name = admin_name;
        this.comment = comment;
        this.post_id = post_id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return this.admin_name.trim();
    }

    public void setAdminName(String name) {
        this.admin_name = name;
    }

    public String getComment() {
        return this.comment.trim();
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPostId() {
        return this.post_id;
    }

    public void setPostId(Integer id) {
        this.post_id = id;
    }

    // public String getPostedDate() {
    // return this.posted_date;
    // }

    // public void setPostedDate() {
    // this.posted_date =
    // LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    // }
}
