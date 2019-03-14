-- DROP TABLE job_posts;
-- DROP TABLE admin_comments;

CREATE TABLE IF NOT EXISTS job_posts(
    id SERIAL PRIMARY KEY NOT NULL,
    company_name TEXT NOT NULL,
    company_phone TEXT NOT NULL,
    company_email TEXT NOT NULL,
    company_address TEXT NOT NULL,
    position TEXT NOT NULL,
    position_details TEXT NOT NULL,
    position_benefits TEXT NOT NULL,
    posted_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS admin_comments(
    id SERIAL PRIMARY KEY NOT NULL,
    admin_name TEXT NOT NULL,
    comment TEXT NOT NULL,
    post_id INTEGER REFERENCES job_posts (id)
);

ALTER TABLE job_posts OWNER TO "user";
GRANT ALL ON TABLE job_posts TO "user";
ALTER TABLE admin_comments OWNER TO "user";
GRANT ALL ON TABLE admin_comments TO "user";
GRANT ALL PRIVILEGES ON DATABASE "job-posting-db" TO "user";

