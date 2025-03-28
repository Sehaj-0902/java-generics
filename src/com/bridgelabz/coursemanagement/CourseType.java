package com.bridgelabz.coursemanagement;

abstract class CourseType {
    private String courseTypeName;

    public CourseType(String typeName) {
        this.courseTypeName = typeName;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    @Override
    public String toString() {
        return "Course Type: " + getCourseTypeName();
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
}