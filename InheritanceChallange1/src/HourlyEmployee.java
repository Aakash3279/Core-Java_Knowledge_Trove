public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth,
                          String hireDate, double hourlyPayRate) {
        super(name, dateOfBirth, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){ // this will follow up on collect pay in this class not on salaried employee
        return 2 * collectPay();
    }
}
