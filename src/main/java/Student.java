package src.main.java;

public class Student {
    String name;
    Grade grade;
    Group group;
    String secretNickName = "MySecretNickName";

    public Student(final String name, final Grade grade, final Group group) {
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
