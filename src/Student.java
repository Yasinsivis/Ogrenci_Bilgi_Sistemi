public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    double sNote;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.sNote=0.0;
    }

    void addBulkExamNote(int note1, int note2, int note3,int sNote1,int sNote2, int sNote3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
        if (sNote1 >= 0 && sNote1 <= 100) {
            c1.sNote = sNote1;
        }
        if (sNote2 >= 0 && sNote2 <= 100) {
            c2.sNote = sNote2;
        }
        if (sNote3 >= 0 && sNote3 <= 100) {
            c3.sNote = sNote3;
        }
    }

    void isPass(){
       double course1 = (this.c1.sNote*0.20)+(this.c1.note*0.80);
       double course2 = (this.c2.sNote*0.20)+(this.c2.note*0.80);
       double course3 = (this.c3.sNote*0.20)+(this.c3.note*0.80);
       this.avarage=(course1+course2+course3)/3.0;
        printNote();
       if(avarage>55){
           System.out.println("Sınıfı Geçtiniz!");
           this.isPass=true;
       }else{
           System.out.println("Sınıfı Geçemediniz.");
           this.isPass=false;
       }

    }

    void printNote() {
        System.out.println(c1.name + " " + "Notu\t" + c1.note);
        System.out.println(c2.name + " " + "Notu\t" + c2.note);
        System.out.println(c3.name + " " + "Notu\t" + c3.note);
        System.out.println(c1.name + "Sözlü" + "Notu\t" + c1.sNote);
        System.out.println(c2.name + "Sözlü" + "Notu\t" + c2.sNote);
        System.out.println(c3.name + "Sözlü" + "Notu\t" + c3.sNote);
        System.out.println("Ortalamanız:"+this.avarage);
    }
}
