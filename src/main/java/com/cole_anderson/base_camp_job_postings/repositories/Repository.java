package com.cole_anderson.base_camp_job_postings.repositories;

import java.util.List;
import java.util.Optional;

import com.cole_anderson.base_camp_job_postings.models.JobPost;

public interface Repository<T> {
    void saveJobPost(JobPost post);

    List<JobPost> findAllPosts();

    Optional<T> findById(Integer id);
}
