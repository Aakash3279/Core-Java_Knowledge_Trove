package org.example;

public class Bank {
    private int accountNumber;
    private double accountBalance;
    private String phoneNumber;
    private String name;
    private String email;

    //constructor creation
    public Bank(){

        //constructor chaning
        this(11111,200,"(+91)9010812298",
                "Ultron","monarch123@gmail.com"); //we can only declare on the front

        System.out.println("Empty Constructor called");
    }

    public Bank(int accnumber,double accbalance,String phone,String name,String email){
        System.out.println("non empty Constructor called");
        accountNumber = accnumber;
        accountBalance = accbalance;
        phoneNumber = phone;
//        this.name = name;
        setName(name); //alternative approach but don't use might get complications if any changes have made
        this.email = email;
    }

    public Bank(String email, String name, String phoneNumber) {
        this(9999,20,phoneNumber,name,email);
//        this.phoneNumber = phoneNumber;
//        this.name = name;
//        this.email = email;
        //even though it is commented this will follow up the major constructor created early one
    }

    //setters and getters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //calling methods
    public void depositFunds(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("The deposit amount of "+depositAmount+"" +
                " is made and the total balance in your account is "+accountBalance);
    }

    public  void withdrawFunds(double withdrawAmount){
        if(accountBalance - withdrawAmount < 0){
            System.out.println("Insufficient funds! you just have "+accountBalance+" in your account");
        }else{
            accountBalance -= withdrawAmount;
            System.out.println("You have withdrawed "+ withdrawAmount+"" +
                    " from your account and you have "+ accountBalance+" amount in your account");
        }
    }

}
