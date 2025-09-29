package module2;

public class RemoteStudents extends Students {
    public RemoteStudents(String id, String name) {
        super(id, name, "remote");
    }

    @Override
    public double score(double midterm, double finalExam, double assignments, double discussion) {
        return (midterm * 0.30) + (finalExam * 0.30) + (assignments * 0.30) + (discussion * 0.10);
    }
}