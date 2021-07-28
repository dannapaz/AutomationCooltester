package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte abc=125;
		short var=3000;
		long var2=9223372036854775807L;
		
		double altura=2.54;
		System.out.println(altura);
		
		char letra='\u00D4';
		System.out.println(letra);
		
		String frase= "Hola";
		String frase2="mundo";
		int frase3 =4;
		
		System.out.println(frase+frase2+frase3);
	
		boolean isDog= true;
		
		int x=3;
		int y=4;
		int suma =x+y;
		System.out.println(suma);
		
		//Unario
		
		int a=3;
		a++;
		a--;
		System.out.println("El valor de a es " + a);
		
		
		//Relacionales
		int var1=3;
		int var3=4;
		boolean var4=true;
		if(var1<=var3 && var4)
		{
			System.out.println("HERE");
		}

	}

}
