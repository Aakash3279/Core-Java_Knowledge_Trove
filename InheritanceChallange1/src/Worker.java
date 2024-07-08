import java.time.LocalDate;

public class Worker {
    private String name;
    private String dateOfBirth;
    protected String endDate;

    public Worker() {}

    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear(); // You might want to use LocalDate.now().getYear() for dynamic year
        int birthYear = Integer.parseInt(dateOfBirth.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
