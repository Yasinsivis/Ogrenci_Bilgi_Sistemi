public class Teacher {
    String name;
    String mpno; //Mobile Phone
    String branch; //Alanı

    //Constructor Metot
    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("ADI:" + name);
        System.out.println("TEL NO:" + mpno);
        System.out.println("ALANI:" + branch);
    }
}
