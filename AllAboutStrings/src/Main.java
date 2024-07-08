public class Main {
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("length = %d\n",length);
        if(string.isEmpty()){
            System.out.println("string is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("string is blank");
        }
        System.out.printf("First char = %c%n",string.charAt(0));
        System.out.printf("Last char = %c%n",string.charAt(length-1));
    }
    public static void main(String[] args) {
        String s = "Aakash";
        printInformation(s);
        printInformation("");
        printInformation("\t   \n");

        String hello = "Hello World";
        System.out.printf("Index of r = %s%n",hello.indexOf('r'));
        System.out.printf("Index of World = %s%n",hello.indexOf("World"));

        System.out.printf("Index of l = %s%n",hello.indexOf('l'));
        System.out.printf("Last index of r = %s%n",hello.lastIndexOf('l'));

        System.out.printf("Index of l = %s%n",hello.indexOf('l',3));
        System.out.printf("Last index of r = %s%n",hello.lastIndexOf('l',8));

        String helloWorldLower = hello.toLowerCase();
        if(hello.equals(helloWorldLower)){
            System.out.println("Both values match exactly");
        }

        if(hello.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Both values ignores");
        }

        if(hello.startsWith("Hello")){
            System.out.println("Starts with hello");
        }

        if(hello.endsWith("World")){
            System.out.println("Ends with world");
        }

        if(hello.contains("World")){
            System.out.println("String contains World");
        }

        if(hello.contentEquals("Hello World")){
            System.out.println("Both values match exactly");
        }

    }
}