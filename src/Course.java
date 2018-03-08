import java.util.Objects;

public class Course {
    private String classId;
    private int credit;

    public Course(){
        classId = "";
        credit = 0;
    }

    public Course(String c, int cr){
        classId = c;
        credit = cr;
    }

    public int getCredit() {
        return credit;
    }

    public String getClassId() {
        return classId;

    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setClassId(String classId) {

        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return credit == course.credit &&
                Objects.equals(classId, course.classId);
    }


    @Override
    public String toString() {
        return "Course{" +
                "classId='" + classId + '\'' +
                ", credit=" + credit +
                '}';
    }
}
