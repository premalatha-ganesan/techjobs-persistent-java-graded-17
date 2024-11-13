package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 20, message = "Location must be minimum 3 or maximum 20 characters long")
    public String location;

    @OneToMany()
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public @NotBlank @Size(min = 3, max = 20, message = "Location must be minimum 3 or maximum 20 characters long") String getLocation() {
        return location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 20, message = "Location must be minimum 3 or maximum 20 characters long") String location) {
        this.location = location;
    }


}
