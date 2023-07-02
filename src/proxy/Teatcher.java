package proxy;

import java.util.Date;

public class Teatcher {
    public static void main(String[] args) {
        Student student1 = new Student(new Attendance(new Date(), true));
        Student student2 = new Student(new Attendance(new Date(), false));

        student1.attendLesson(); // Student attending the Session ...
        student2.attendLesson(); // Student attending the Session ...
    }
}
