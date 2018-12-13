package Lexicon_Java_victor.Exercise8;

import java.util.Random;
import java.util.Scanner; 
public class App 
{
    public static void main( String[] args )
    {
      
Random rand = new Random();
int Nummer = rand.nextInt(500) +1;

Scanner input = new Scanner(System.in);
int gissa;
boolean vinna = false;

while (vinna == false)
{
	System.out.println("gissa ett nummer mellan 1 och 500");
	gissa = input.nextInt();
	
	if(gissa == Nummer)
	{
		vinna = true;
	}
	else if(gissa < Nummer)
	{
		System.out.println("för litte");
	}
	else if(gissa > Nummer)
	{
		System.out.println("för högt");
	}
	
}


System.out.println("du gissade rätt");
System.out.println("rätt nummer var " + Nummer);

	
	
    		
    }
}

