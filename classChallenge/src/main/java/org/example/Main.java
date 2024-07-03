package org.example;

public class Main {
    public static void main(String[] args) {

     //   Bank bobsAcc = new Bank();
        Bank bobsAcc = new Bank(12343,500,"(+91) 6300913279",
                "Guru Aakash","guruaakash1610@gmail.com");

        System.out.println("\n"+bobsAcc.getName());
        System.out.println(bobsAcc.getAccountNumber());
        System.out.println(bobsAcc.getAccountBalance());
        System.out.println(bobsAcc.getPhoneNumber());
        System.out.println(bobsAcc.getEmail()+"\n");


//        bobsAcc.setName("Guru Aakash");
//        bobsAcc.setAccountBalance(1000);
//        bobsAcc.setEmail("guruaakash1610@gmail.com");
//        bobsAcc.setAccountNumber(183763911);
//        bobsAcc.setPhoneNumber("(+91) 6300913279");
        //filling all these above make more difficult so we use constructors


        bobsAcc.withdrawFunds(100);
        bobsAcc.depositFunds(250.0);
        bobsAcc.withdrawFunds(105.0);
        bobsAcc.withdrawFunds(50);

        Bank forConst = new Bank("aakashspidy101@gmail.com","Akash","(+81)9849953306");
        System.out.println("email: "+forConst.getEmail()+" , name: "+forConst.getName()+" , phone: "+forConst.getPhoneNumber());


 //_________________________________________________________________________________________________________________________________

        Customer A = new Customer();
        System.out.println("Email: "+A.getEmail()+" ,Name: "+A.getName()+" ,Credit Limit: "+A.getCreditLimit());

        Customer B = new Customer("Thanos","Thanos@gmail.com");
        System.out.println(B.getName());
        System.out.println(B.getCreditLimit());
        System.out.println(B.getEmail());

        Customer C = new Customer("\nGuru",2223,"123@gmail.com");
        System.out.println(C.getName());
        System.out.println(C.getCreditLimit());
        System.out.println(C.getEmail());



    }
}