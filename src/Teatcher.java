import entities.Attendance;
import entities.Student;
import proxy.StudentProxy;

import java.util.Date;

public class Teatcher {
    public static void main(String[] args) {
        Student student1 = new StudentProxy(new Attendance(new Date(), true));
        Student student2 = new StudentProxy(new Attendance(new Date(), false));

        student1.attendLesson(); // Student attending the Session ...
        student2.attendLesson(); // Student is not present, so he can't attend the Lesson ...
    }
}
