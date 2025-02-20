import java.util.*;

public class SomarNumeros 
{
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("A soma de " + num1 + " e " + num2 + " e: " + soma);
        
        sc.close();
    }
}
