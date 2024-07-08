public class Main {
    //text block and formating options
    public static void main(String[] args) {
        String bulletIt  = "Print a Bulleted List:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Second Point";

        System.out.println(bulletIt);

        //textblock
        String textblock = """
            Print a Bulleted List:
                 \u2022 First Point
                    \u2022 Second Point""";
        System.out.println(textblock);

        int age = 22;
        System.out.printf("your age is %d%n",age);

        int yearOfBirth = 2024 - age;
        System.out.printf("age is %d, year of birth is %d%n",age,yearOfBirth);

        System.out.printf("your age is %.2f%n",(float)age);

        for(int i = 1;i<=100000;i*=10){
            System.out.printf("printing %6d %n",i); // occupies 6 spaces
        }

        String formattedString = String.format("%nyour age is %d",age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);

                
                
    }
}