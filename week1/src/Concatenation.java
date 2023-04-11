public class Concatenation {

    public static void main(String[]args) {

        String color = "red";
        System.out.println("My favorite color is " +color);

        int money = 2_000_000;
        System.out.println("I hit the jackpot and won $" +money+ " dollars!");

        System.out.println(color+" "+money);
        System.out.println("This will be my statement regarding my favorite color which is " +color+ " " +
                "and will let you know that I won $ " +money+ " dollars");
    }
}
