import java.util.*;
public class exercicio3 {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira a sua idade: ");
		int idade = Integer.parseInt(ler.nextLine());
		
		if((idade >=10) && (idade <=14)) {
			System.out.println("Voc� est� na categoria Infantil.");
		}else if ((idade >= 15) && (idade <= 17)) {
			System.out.println("Voc� est� na categoria Juvenil.");
		}else if ((idade >= 18) && (idade <= 25)) {
			System.out.println("Voc� est� na categoria Adulto.");
		}else {
			System.out.println("Insira uma idade v�lida.");
		}
		
		System.out.println("\n");
	}
}
