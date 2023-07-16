package entities;

public class Student implements DailySession {
    private Attendance attendance;

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendLesson() {
        System.out.println("Student attending the Session ...");
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}
