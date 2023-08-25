package com.jrhcodes;

public class Student {
    String name;
    Grade grade;
    Group group;
    String secretNickName = "MySecretNickName";

    public Student(final String name, final Grade grade, final Group group) {
        if( name == null || name.isBlank() ) {
            throw new IllegalArgumentException("Student(): Blank or null student name provided");
        };

        if( grade == null){
            throw new IllegalArgumentException("Student(): Null grade provided");
        }

        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Group getGroup() {
        return group;
    }

    public boolean upgradeGrade() {
        return grade.increase();
    }

    public boolean downgradeGrade() {
        return grade.decrease();
    }

}
