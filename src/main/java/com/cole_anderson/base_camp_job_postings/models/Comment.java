package com.cole_anderson.base_camp_job_postings.models;

import java.util.Date;

public class Comment {
    public Integer id;
    public String admin_name;
    public String comment;
    public String company_email;
    public Integer post_id;
    public Date posted_date;

    public Comment(String admin_name, String comment, Integer post_id) {
        this.admin_name = admin_name;
        this.comment = comment;
        this.post_id = post_id;
        this.posted_date = getDate();
    }

    public Comment(Integer id, String admin_name, String comment, Integer post_id, Date posted_date) {
        this.id = id;
        this.admin_name = admin_name;
        this.comment = comment;
        this.post_id = post_id;
        this.posted_date = posted_date;
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

    public Date getPostedDate() {
        return this.posted_date;
    }

    public void setPostedDate(Date date) {
        this.posted_date = date;
    }

    public static Date getDate() {
        Date date = new Date();
        return new Date(date.getTime());
    }
}
