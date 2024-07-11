public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,
                true); //setting the duplex will initialize both front and back side of page
        System.out.println("initial pages count = "+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages %d, Printer Total = %d%n",
                pagesPrinted,printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages %d, Printer Total = %d%n",
                pagesPrinted,printer.getPagesPrinted());
    }
}