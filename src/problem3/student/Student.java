package problem3.student;

public class Student{
    int[] rollNumber;

    public int[] getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int[] rollNumber) {
        this.rollNumber = rollNumber;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return Arrays.toString(rollNumber);
    }
}