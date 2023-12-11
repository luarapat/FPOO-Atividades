package Atividade_Luara_Patracon;
import java.util.Scanner;
public class Contas {

	public static void main(String[] args) {
		int V,a,p,f;

        try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Valor do saldo");

			V = entrada.nextInt();

			System.out.println("Valor da conta do acougue");

			a = entrada.nextInt();

			System.out.println("Valor da conta da padaria");

			p = entrada.nextInt();

			System.out.println("Valor da conta da farmacia");

			f = entrada.nextInt();
		}

        if (V >= (a+f+p)) {

            System.out.println("3");

        } else if(V>= (a+f) || V>= (a+p)){

            System.out.println("2");

            if(V >= a || V>= f || V>=p)

            System.out.println("1");

        }

        }

	}


