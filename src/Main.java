import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            System.out.println("HELLO AND WELCOME!");

            Scanner Number = new Scanner(System.in);
            int a, b, option;
        do {
            /*Pidiendo números por consola*/
            System.out.println("Insert the first number:");
            a = Number.nextInt();

            System.out.println("Insert the second number:");
            b = Number.nextInt();
            int result;
            /*MENÚ */

            do {
                System.out.println("Please choose one of the following options:");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.Exit");
                option = Number.nextInt();
            } while (option < 1 || option > 5);/*acá queremos un número que este por fuera 1-5 para que no siga repitiendo el do*/


            switch (option) {
                case 1:
                    //System.out.printf("1.Addition");
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);

                    break;

                case 2:
                    // System.out.printf("2.Subtraction");
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;

                case 3:
                    // System.out.printf("3.Multiplication");
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;

                case 4:
                    // System.out.printf("4.Division");
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                    break;

                case 5:
                    // System.out.printf("4.Division");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Thanks");
                    break;

            }
        } while (option != 5);//change



    }




}