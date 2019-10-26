import java.util.*;

public class Conv
{
    public static void main(String[] args){
            Controller control = new Controller();
            Scanner keyboard = new Scanner(System.in);
            double number;
            int limit;
            System.out.println(" ");
            System.out.println("************************************************");
            System.out.println("Task:     Converter decimais fracionados em binario");
            System.out.println("Versão:   1.0");
            System.out.println("Data:     25/10/2019");
            System.out.println("Author:   Danilo");
            System.out.println("************************************************");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Digite o número decimal (o sistema entende que a vírgula é um -> *(,))");
            System.out.print("-> ");
            number = keyboard.nextDouble();
            
            System.out.println("Digite o número de casas decimais");
            System.out.print("-> ");
            limit = keyboard.nextInt();
            
            System.out.println("-------------------------------------------------");
            System.out.println(control.decimalToBinary(number,limit)); 
            System.out.println("-------------------------------------------------");

        }
}
