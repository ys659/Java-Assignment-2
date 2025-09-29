package module2;

public class InPersonStudents extends Students {
    public InPersonStudents(String id, String name) {
        super(id, name, "in-person");
    }

    @Override
    public double score(double midterm, double finalExam, double assignments, double discussion) {
        // Discussion ignored for in-person students
        return (midterm * 0.30) + (finalExam * 0.30) + (assignments * 0.40);
    }
}
