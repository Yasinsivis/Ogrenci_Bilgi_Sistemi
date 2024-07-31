//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Zeynep Yıldız", "5054125", "EDB");
        Teacher t2 = new Teacher("Ersin Göktürk", "5987768", "KMY");
        Teacher t3 = new Teacher("Yıldız Bilgiç", "4598078", "FZK");

        Course Edebiyat = new Course(t1, "Edebiyat", "101", "EDB");
        Course Fizik = new Course(t3, "Fizik", "102", "FZK");
        Course Kimya = new Course(t2, "Kimya", "101", "KMY");

        Edebiyat.addTeacher(t1);
        Fizik.addTeacher(t3);
        Kimya.addTeacher(t2);

        Student st1 = new Student("Yasin Siviş", "2563", "3", Edebiyat, Fizik, Kimya);
        st1.addBulkExamNote(50, 60, 70, 50,60,80);
        st1.isPass();

        Student st2 = new Student("Mehmet Yıldız", "2584", "1", Edebiyat, Fizik, Kimya);
        st2.addBulkExamNote(90, 84, 32, 50,70,40);
        st2.isPass();

        Student st3 = new Student("Gülbeyaz Kırkel", "2323", "2", Edebiyat, Fizik, Kimya);
        st3.addBulkExamNote(84, 55, 63, 50,35,40);
        st3.isPass();
    }
}