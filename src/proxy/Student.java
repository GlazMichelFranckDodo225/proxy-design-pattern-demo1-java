package proxy;

public class Student implements DailySession {
    private Attendance attendance;

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendLesson() {
        System.out.println("Student attending the Session ...");
    }
}
