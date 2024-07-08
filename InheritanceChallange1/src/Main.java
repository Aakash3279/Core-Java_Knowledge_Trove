import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay: " + tim.collectPay());
        System.out.println(LocalDate.now().getYear());

        Employee joe = new Employee("joe","21/04/1990","07,11,2021");
        System.out.println(joe);

        SalariedEmployee kim = new SalariedEmployee("kim","21/04/1990",
                "07,11,2021",35000);
        System.out.println(kim);
        System.out.println("kim's Paycheck = "+kim.collectPay());

        kim.retire();
        System.out.println("Collect Pension Check = "+kim.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/04/1981",
                "03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary Collect pay = "+mary.collectPay());
        System.out.println("Mary holiday pay = "+mary.getDoublePay());
    }
}
