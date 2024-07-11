public class Main {
    public static void printStringInformation(String string){
        System.out.println("String = "+string);
        System.out.println("String length = "+string.length());
    }

    public static void printStringInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("StringBuilder length = "+builder.length());
        System.out.println("StringBuilder Capacity = "+builder.capacity());
    }
    public static void main(String[] args) {
        String helloWorld = "hello" + " world";
        helloWorld.concat(" and GoodBye!");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " world");
        helloWorldBuilder.append(" and GoodBye!");


        printStringInformation(helloWorld);
        printStringInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printStringInformation(emptyStart);
        printStringInformation(emptyStart32);

        StringBuilder helloWorldPlus = new StringBuilder("Hello" + " world");
        helloWorldPlus.append(" and GoodBye");

        helloWorldPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(helloWorldPlus);

        helloWorldPlus.replace(16,17,"G");
        System.out.println(helloWorldPlus);

        helloWorldPlus.reverse().setLength(7);
        System.out.println(helloWorldPlus);
    }
}