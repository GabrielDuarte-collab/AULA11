import java.util.Scanner;
public class TESTE {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
      while (true) {
        try {
        System.out.print("Insira o primeiro número: ");
        float num1 = sc.nextFloat();
        } catch (Exception e) {
         System.out.println("Opação invalido!");
        }
         sc.next();
         sc.close();
      }    
    }
}
