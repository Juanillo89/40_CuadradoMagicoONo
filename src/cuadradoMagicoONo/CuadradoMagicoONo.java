package cuadradoMagicoONo;

import java.util.Scanner;

public class CuadradoMagicoONo
{
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		final int orden = 3;
		boolean descartado = false;
		int[][] cuadrado = new int[orden][orden];
		int suma;
		for(int i = 0; i < orden; i++)
		{
			for(int j = 0; j < orden; j++)
			{
				System.out.print("Fila " + (i + 1) + " columna " + (j + 1) + ": ");
				cuadrado[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i < orden; i++)
		{
			for(int j = 0; j < orden; j++)
			{
				System.out.print(cuadrado[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i = 0; i < orden && !descartado; i++)
		{
			for(int j = 0; j < orden && !descartado; j++)
			{
				for(int fila = 0; fila < orden && !descartado; fila++)
				{
					for(int col = 0; col < orden && !descartado; col++)
					{
						if(cuadrado[i][j] == cuadrado[fila][col] && (i != fila || j != col))
						{
							descartado = true;
						}
					}
				}
			}
		}
		for(int i = 0; i < orden && !descartado; i++)
		{
			suma = 0;
			for(int j = 0; j < orden; j++)
			{
				suma += cuadrado[i][j];
			}
			if(suma != 15)
			{
				descartado = true;
			}
		}
		for(int i = 0; i < orden && !descartado; i++)
		{
			suma = 0;
			for(int j = 0; j < orden; j++)
			{
				suma += cuadrado[j][i];
			}
			if(suma != 15)
			{
				descartado = true;
			}
		}
		suma = 0;
		int fila = 0;
		int col = 0;		
		while(fila < orden && !descartado)
		{
			suma += cuadrado[fila][col];
			fila++;
			col++;
		}
		if(suma != 15)
		{
			descartado = true;
		}
		suma = 0;
		fila = 2;
		col = 0;
		while(col < orden && !descartado)
		{
			suma += cuadrado[fila][col];
			fila--;
			col++;
		}
		if(suma != 15)
		{
			descartado = true;
		}
		if(descartado)
		{
			System.out.println("No es un cuadrado mágico.");
		}
		else
		{
			System.out.println("Es un cuadrado mágico.");
		}
	}
}

