package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 1000)
    @Column(length = 1000)
    private String description;

    @ManyToMany(mappedBy = "skills")

    private List<Job> jobs = new ArrayList<>();

    public Skill() {}

    public @Size(max = 1000) String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 1000) String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}


