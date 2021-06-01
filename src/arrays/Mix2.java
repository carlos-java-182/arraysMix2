package arrays;

import java.util.Scanner;

public class Mix2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int A[] = new int[12], B[] = new int[12], C[] = new int[24];

		for (int i = 0; i < 12; i++) {
			System.out.print("Arrego 1 - Número: " + (i + 1) +" ");
			A[i] = entrada.nextInt();
		}

		for (int i = 0; i < 12; i++) {
			System.out.print("Arrego 2 - Número: " + (i + 1) +" ");
			B[i] = entrada.nextInt();
		}

		int j = 0;
		int k = 0;
		int l = 0;

		for (int i = 0; i < 4; i++) {

			for (int n = 0; n < 3; n++) {
				C[j] = A[k];
				k++;
				j++;
			}

			for (int n = 0; n < 3; n++) {
				C[j] = B[l];
				l++;
				j++;
			}

		}
		for (int i = 0; i < 24; i++) {
			System.out.println("Arreglo 3 - "+ (i + 1) +" Número: " + C[i]);
			
		}

	}
}
