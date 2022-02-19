import java.util.Scanner;

public class Task01 {

    /*
     Задание 1.1
     Найдите значение функции: z = ( ( a - 3 ) * b / 2) + c;
     19.02.2022
    */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = readDouble(console,"Enter a:");
        double b = readDouble(console, "Enter b:");
        double c = readDouble(console, "Enter c:");
        func_z(a, b, c);
    }

    // чтение и проверка аргументов функции
    public static double readDouble(Scanner sc, String message){
        while(true){
            System.out.println(message);
            String line = sc.nextLine();

            try{
                return Double.parseDouble(line);
            }catch(NumberFormatException e){
                System.err.println("Error: incorrect input");
            }
        }
    }

    // вычисление и вывод функции z = ( ( a - 3 ) * b / 2) + c;
    public static void func_z(double a, double b, double c){
        double z = ( (a - 3) * b / 2 ) + c;
        System.out.println( "z = " + z );
    }
}
