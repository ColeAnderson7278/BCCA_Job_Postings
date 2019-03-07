package com.cole_anderson.base_camp_job_postings.repositories;

import java.util.List;

import com.cole_anderson.base_camp_job_postings.models.JobPost;

public interface Repository<T> {
    void saveJobPost(JobPost post);
}
