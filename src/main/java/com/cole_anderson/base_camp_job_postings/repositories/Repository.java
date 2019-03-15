package com.cole_anderson.base_camp_job_postings.repositories;

import java.util.List;
import java.util.Optional;

import com.cole_anderson.base_camp_job_postings.models.JobPost;
import com.cole_anderson.base_camp_job_postings.models.Comment;;

public interface Repository<T> {
    void saveJobPost(JobPost post);

    void deletePostById(Integer id);

    List<JobPost> findPostsAZ();

    List<JobPost> findPostsZA();

    List<JobPost> findPostsByOldest();

    List<JobPost> findAllPosts();

    Optional<T> findPostById(Integer id);

    void saveComment(Comment comment);

    void deleteCommentById(Integer id);

    List<Comment> findCommentsById(Integer id);
}
