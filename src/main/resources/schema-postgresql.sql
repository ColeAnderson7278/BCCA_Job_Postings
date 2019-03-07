-- DROP TABLE job_posts;

CREATE TABLE IF NOT EXISTS job_posts(
    id SERIAL PRIMARY KEY NOT NULL,
    company_name TEXT NOT NULL,
    company_phone TEXT NOT NULL,
    company_email TEXT NOT NULL,
    company_address TEXT NOT NULL,
    position TEXT NOT NULL,
    position_details TEXT NOT NULL,
    position_benefits TEXT NOT NULL
);

ALTER TABLE job_posts OWNER TO "user";
GRANT ALL ON TABLE job_posts TO "user";
GRANT ALL PRIVILEGES ON DATABASE "job-posting-db" TO "user";
