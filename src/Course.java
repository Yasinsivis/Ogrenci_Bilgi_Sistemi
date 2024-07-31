public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double sNote;

    Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else System.out.println("Öğretmen alanıyla kurs alanları uyuşmuyor!!!!!!!");

    }

    void printTeacherInfo() {
        teacher.print();
    }
}
