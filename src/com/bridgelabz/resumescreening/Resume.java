package com.bridgelabz.resumescreening;

import java.util.List;

public class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private String skills;

    public Resume(String candidateName, T jobRole, String skills) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Candidate: " + getCandidateName() + ", Role: " + getJobRole().getRoleName() + ", Skills: " + getSkills();
    }

    public void processResume() {
        System.out.println(this);
    }

    public static void displayResumes(List<Resume<? extends JobRole>> resumes) {
        resumes.forEach(Resume::processResume);
    }
}