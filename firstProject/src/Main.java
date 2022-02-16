public class Main {
    public static void main(String args[]) {
        System.out.println("Hello world !");

        // int age = 21;
        // String fName = "Sekou";
        // String lName = "Samassa";
        // System.out.println("I'm " + fName + " " + lName);
        // System.out.println("I am " + age + " years old");
        // final int INDEPENDANCEYEAROFMALI = 1960;
        // final String COUNTRY = "Mali";
        // final String FIRSTPRESIDENT = "Modibo Keita";
        // System.out.println(COUNTRY + " has been independant state since " + INDEPENDANCEYEAROFMALI);
        // System.out.println("The first president was " + FIRSTPRESIDENT);

        // double size = 1.84;
        // double weight = 70.1;
        // System.out.println("Size: " + size);
        // System.out.println("Weight: " + weight);

        int a = 5;
        int b = 13;
        double c = (double)a / (double)b;
        System.out.println(a + " / " + b + " = " + c);

        boolean isTrue = true;
        isTrue = !isTrue;
        boolean result1 = true && false;
        boolean result2 = true && true;
        boolean result3 = false && false;
        boolean result4 = false || true;
        boolean result5 = false || !false;
        System.out.println("true AND false = " + result1);
        System.out.println("true AND true = " + result2);
        System.out.println("false && false = " + result3);
        System.out.println("false OR true = " + result4);
        System.out.println("false OR NOTtrue = " + result5);



    }
}
