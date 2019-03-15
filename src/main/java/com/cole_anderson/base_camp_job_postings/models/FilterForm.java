package com.cole_anderson.base_camp_job_postings.models;

import javax.validation.constraints.NotNull;

public class FilterForm {
    @NotNull
    public String filter_choice;

    public FilterForm(String filter_choice) {
        this.filter_choice = filter_choice;
    }

    public String getFilterChoice() {
        return this.filter_choice.trim();
    }

    public void setFilterChoice(String choice) {
        this.filter_choice = choice;
    }
}
