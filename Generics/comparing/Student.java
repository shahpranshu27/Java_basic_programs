package comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        // return "Student [rollno=" + rollno + ", marks=" + marks + "]";
        return rollno+" ";
        // return marks+" ";
    }

    // @Override
    // public int compareTo(Student o) {
    //     // return 0;
    //     int diff = (int)(this.marks - o.marks);
    //     // if diff == 0 -> both are equal
    //     // if diff > 0 -> this.marks > o.marks 
    //     // if diff < 0 -> this.marks < o.marks 
    //     return diff;
    // }
    @Override
    public int compareTo(Student o) {
        // return 0;
        int diff = (int)(this.rollno - o.rollno);
        // if diff == 0 -> both are equal
        // if diff > 0 -> this.marks > o.marks 
        // if diff < 0 -> this.marks < o.marks 
        return diff;
    }
}
