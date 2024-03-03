public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }

    public void addOralExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.oralNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralNote = kimya;
        }
    }

    public void calcWeightedGradeAverage() {
        this.fizik.finalNote = (this.fizik.examNote * 0.8) + (this.fizik.oralNote * 0.2);
        this.mat.finalNote = (this.mat.examNote * 0.8) + (this.mat.oralNote * 0.2);
        this.kimya.finalNote = (this.kimya.examNote * 0.8) + (this.kimya.oralNote * 0.2);
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0 || this.mat.oralNote == 0 || this.fizik.oralNote == 0 || this.kimya.oralNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        calcWeightedGradeAverage();
        this.avarage = (this.fizik.finalNote + this.kimya.finalNote + this.mat.finalNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.finalNote);
        System.out.println("Fizik Notu : " + this.fizik.finalNote);
        System.out.println("Kimya Notu : " + this.kimya.finalNote);
    }

}