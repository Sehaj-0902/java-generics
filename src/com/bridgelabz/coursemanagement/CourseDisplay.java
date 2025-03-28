package com.bridgelabz.coursemanagement;

import java.util.List;

class CourseDisplay {
    public static void displayCourses(List<Course<? extends CourseType>> courseList) { // Removed courseTypeList parameter
        System.out.println("University Courses:");
        for (Course<? extends CourseType> course : courseList) {
            System.out.println(course);
        }
    }
}