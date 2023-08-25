package src.main.java;

public class Grade {
    private int value;

    public Grade(int grade) {
        if (grade > 5 || grade < 1)
            throw new IllegalArgumentException("Illegal grade, values must be an integer in the range 1..5");

        this.value = grade;
    }

    public boolean isMaxGrade() {
        return value == 1;
    }

    public boolean isMinGrade() {
        return value == 5;
    }

    public boolean increase() {
        if (isMaxGrade()) {
            --value;
            return true;
        }
        return false;
    }

    public boolean decrease() {
        if (!isMinGrade()) {
            ++value;
            return true;
        }
        return false;
    }

    int getValue() {
        return value;
    }

}
