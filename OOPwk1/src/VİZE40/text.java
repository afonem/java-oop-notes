package VİZE40;

public class text {
    public static void main(String[] args) {

        // Öğrenciler oluştur
        Student s1 = new Student("Ali", 0);
        Student s2 = new Student("Ayşe", 0);
        Student s3 = new Student("Mehmet", 0);

        // Not ekle
        s1.getGrade().add(85.0);
        s1.getGrade().add(90.0);
        s2.getGrade().add(70.0);
        s2.getGrade().add(75.0);
        s3.getGrade().add(95.0);
        s3.getGrade().add(88.0);

        // Ders ekle
        s1.enrollCourse("Math");
        s1.enrollCourse("Math"); // duplicate test
        s2.enrollCourse("Science");
        s3.enrollCourse("Math");

        // Öğretmen oluştur
        Teacher t1 = new Teacher("Hoca Ahmet", 3, "Math");
        Teacher t2 = new Teacher("Hoca Fatma", 2, "Science");

        // Öğretmene öğrenci ekle
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s1); // duplicate test

        // En iyi öğrenciyi bul
        System.out.println("=== En iyi öğrenci ===");
        Student top = t1.findTopStudent(t1.getStudents(), null);
        if (top != null) {
            System.out.println(top.toString());
        }

        // Okul oluştur
        School school = new School("Okul", "Ankara Lisesi");
        school.getTeachers().add(t1);
        school.getTeachers().add(t2);
        school.getStudents().add(s1);
        school.getStudents().add(s2);
        school.getStudents().add(s3);

        // Tüm personeli yazdır
        System.out.println("=== Tüm Personel ===");
        school.printAllPersonnel();

        // ID ile arama
        System.out.println("=== ID Arama ===");
        school.searchById(s1.getId());
    }
}