package com.bridgelabz.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningAI {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();

        SoftwareEngineer softwareEngineerRole = new SoftwareEngineer();
        DataScientist dataScientistRole = new DataScientist();
        ProductManager productManagerRole = new ProductManager();

        System.out.println("Screening Resumes:");
        resumes.add(new Resume<>("Sehaj", softwareEngineerRole, "java, spring, software design"));
        resumes.add(new Resume<>("Sanya", dataScientistRole, "python, data analysis, machine learning"));
        resumes.add(new Resume<>("Shruti", productManagerRole, "product strategy, market research, agile"));

        Resume.displayResumes(resumes);
    }
}
