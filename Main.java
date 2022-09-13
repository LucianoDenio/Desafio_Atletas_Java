import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		String name, veryTall;
		int atletas, men, woman;
		double altura, peso, Allpeso, moreTall, pMen, Tallwoman, mediaTall;
		
		men = 0;
		woman =0;
		Tallwoman = 0;
		veryTall = " ";
		moreTall = 0;
		Allpeso = 0;
		
		System.out.print("Qual a quantidade de atletas? ");
		atletas = sc.nextInt();
		
		for(int i = 1; i <= atletas; i++) {
			
			System.out.println("Digite os dados do atleta numero " + i);
			System.out.print("Nome : ");
			sc.nextLine();
			name = sc.nextLine();
			
			
			System.out.print("Sexo : ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			System.out.print("Altura : ");
			altura = sc.nextDouble();
			while (altura <= 0 ) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			System.out.print("Peso : ");
			peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			
			if( sexo == 'F') {
				woman ++;
				Tallwoman += altura;
			}
			else {
				men ++;
			}
			
			if (altura > moreTall) {
				moreTall = altura;
				veryTall = name;
			}
			
			Allpeso += peso;
			
		}
		
		pMen = (double) men * 100/atletas;
		mediaTall = (double)Tallwoman/woman;
		System.out.println("RELATÓRIO : ");
		System.out.printf("Peso médio dos atletas: %.2f%n", Allpeso/atletas);
		System.out.printf("Atleta mais alto: %s%n" , veryTall);
		System.out.printf("Porcentagem de homens: %.1f %%%n", pMen);
		if(woman < 1) {
			System.out.println("Não ha mulheres cadastradas.");
		}
		else {
			System.out.printf("Altura Média das mulheres %.2f%n" , mediaTall);
		}
		
		sc.close();
	}
}