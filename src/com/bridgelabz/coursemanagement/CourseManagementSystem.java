package com.bridgelabz.coursemanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystem {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courses = new ArrayList<>();

        Course<ExamCourse> course1 = new Course<>("Discrete Math", new ExamCourse());
        Course<AssignmentCourse> course2 = new Course<>("Introduction to Java Programming", new AssignmentCourse());
        Course<ResearchCourse> course3 = new Course<>("Advanced Thesis Research", new ResearchCourse());

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        CourseDisplay.displayCourses(courses);
    }
}