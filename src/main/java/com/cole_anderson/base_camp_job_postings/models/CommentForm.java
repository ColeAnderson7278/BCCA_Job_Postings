package com.cole_anderson.base_camp_job_postings.models;

import javax.validation.constraints.NotNull;

public class CommentForm {
    @NotNull
    public String admin_name;

    @NotNull
    public String comment;

    public CommentForm(String admin_name, String comment) {
        this.admin_name = admin_name;
        this.comment = comment;
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
}
