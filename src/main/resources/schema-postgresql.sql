-- DROP TABLE job_post;

CREATE TABLE IF NOT EXISTS job_post(
    id SERIAL PRIMARY KEY NOT NULL,
    company_name TEXT NOT NULL,
    company_email TEXT NOT NULL,
    company_address TEXT NOT NULL,
    position TEXT NOT NULL,
    position_details TEXT NOT NULL,
    position_benefits TEXT NOT NULL,
    posted_date DATE NOT NULL
);

-- ALTER TABLE applications OWNER TO "user";
-- GRANT ALL ON TABLE applications TO "user";

-- GRANT ALL PRIVILEGES ON DATABASE "application-db" TO "user";
