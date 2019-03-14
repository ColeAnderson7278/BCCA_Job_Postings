package com.cole_anderson.base_camp_job_postings.models;

import java.util.Date;

public class JobPost {
    public Integer id;
    public String company_name;
    public String company_phone;
    public String company_email;
    public String company_address;
    public String position;
    public String position_details;
    public String position_benefits;
    public Date posted_date;

    public JobPost(String company_name, String company_phone, String company_email, String company_address,
            String position, String position_details, String position_benefits) {
        this.company_name = company_name;
        this.company_phone = company_phone;
        this.company_email = company_email;
        this.company_address = company_address;
        this.position = position;
        this.position_details = position_details;
        this.position_benefits = position_benefits;
        this.posted_date = getDate();
    }

    public JobPost(Integer id, String company_name, String company_phone, String company_email, String company_address,
            String position, String position_details, String position_benefits, Date posted_date) {
        this.id = id;
        this.company_name = company_name;
        this.company_phone = company_phone;
        this.company_email = company_email;
        this.company_address = company_address;
        this.position = position;
        this.position_details = position_details;
        this.position_benefits = position_benefits;
        this.posted_date = posted_date;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return this.company_name.trim();
    }

    public void setCompanyName(String name) {
        this.company_name = name;
    }

    public String getCompanyPhone() {
        return this.company_phone.trim();
    }

    public void setCompanyPhone(String phone) {
        this.company_phone = phone;
    }

    public String getCompanyEmail() {
        return this.company_email.trim();
    }

    public void setCompanyEmail(String email) {
        this.company_email = email;
    }

    public String getCompanyAddress() {
        return this.company_address.trim();
    }

    public void setCompanyAddress(String address) {
        this.company_address = address;
    }

    public String getPosition() {
        return this.position.trim();
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionDetails() {
        return this.position_details.trim();
    }

    public void setPositionDetails(String details) {
        this.position_details = details;
    }

    public String getPositionBenefits() {
        return this.position_benefits.trim();
    }

    public void setPositionBenefits(String benefits) {
        this.position_benefits = benefits;
    }

    public Date getPostedDate() {
        return this.posted_date;
    }

    public void setPostedDate(Date posted_date) {
        this.posted_date = posted_date;
    }

    public static Date getDate() {
        Date date = new Date();
        return new Date(date.getTime());
    }
}
