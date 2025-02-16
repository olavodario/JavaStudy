public class Main {
    public static void main(String[] args) {

        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                        array
        //    char                          object
        //    boolean

        //variaveis 'primitivas'
        int idade = 19;
        int ano = 2025;
        int quantidade = 1;

        double preco = 251009.99;
        double gpa = 3.5;
        double temperatura = 26;

        char grade = 'A';
        char simbolo = '!';
        char dolar = '$';

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Olavo";
        String food = "pizza";
        String email = "isnotmyemail@gmail.com";
        String car = "BYD Seal";
        String color = "blue";

        System.out.println("Your choice is a " + color + " " + ano + " " + car);
        System.out.println("The price is: " + dolar + preco);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + "is NOT for Sale");
        }
    }
}
