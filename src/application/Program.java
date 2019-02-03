package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Digite o tamanho do triangulo X: ");
		x.a = scr.nextDouble();
		x.b = scr.nextDouble();
		x.c = scr.nextDouble();

		System.out.println("Digite o tamano do triangulo Y: ");
		y.a = scr.nextDouble();
		y.b = scr.nextDouble();
		y.c = scr.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Triangulo X maior que triangulo Y ");
		} else {
			System.out.println("Triangulo y maior que triangulo x ");
		}

		scr.close();
	}

}
