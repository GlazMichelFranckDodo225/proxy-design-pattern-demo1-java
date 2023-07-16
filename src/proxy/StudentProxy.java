package proxy;

import entities.Attendance;
import entities.Student;

// The StudentProxy will behave as the original Student Class
public class StudentProxy extends Student {
    public StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendLesson() {
        if(super.getAttendance().isPresent()) {
            super.attendLesson();
        }
        else {
            throw new RuntimeException("Student is not present, so he can't attend the Lesson");
        }
    }
}
