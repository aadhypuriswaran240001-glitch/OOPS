class Student {
    String name;
    int rollno;
    int[] marks;

    Student(String name, int rollno, int[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    double calculate() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Average Marks: " + calculate());
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 90, 95, 99, 98};
        Student s1 = new Student("none", 000, marks);
        s1.display();
    }
}
