package Exercice2;

public class ex4 {
	
	
	public static String getDizaineTo100(int nombre)
	{
		char levels[] = {'X', 'L', 'C'};
		int currentLevel = 0;
		int nextLevel = 3;
		int xp = 0;
		
		String str = "";
		int j;
		for(j = 10; j <= 100 && j <= nombre; j+=10)
		{

			if(xp >= nextLevel)
			{
				str = "X";
				str += levels[currentLevel + 1];
				
				xp = -1;
				currentLevel++;
			}
			else if(xp == -1)
			{
				xp++;
				str = "";
				str += levels[currentLevel];
			}
			else
			{
				str += levels[0];
				xp++;
			}

		}
		
		return str;
	}
	public static String getDizaineTo1000(int nombre)
	{
		char levels[] = {'D', 'M'};
		int currentLevel = 0;
		int xp = 0;
		int nextLevel = 3;
		String str = "";
		
		while(nombre >= 10)
		{
			if(xp >= nextLevel  && nombre >= 100)
			{
				str = "C";
				str += levels[currentLevel];
				xp = -1;
			}
			else if(xp == -1 && nombre >= 100)
			{
				str = "";
				str += levels[currentLevel];
				currentLevel++;
				xp++;
			}
			else
			{
				str += getDizaineTo100(nombre);
				xp++;
			}
			nombre -= 100;
		}
		
		return str;
	}
	public static String nombreToRomain(int nombre)
	{
		String str = "";
		int debut = 0;

		
		if(nombre > 1000)
		{
			int nombretmp = nombre;
			while(nombretmp >= 100)
			{
				if(nombretmp <= 1000)
				{
					str += getDizaineTo1000(nombretmp);
				}
				else
				{
					str += getDizaineTo1000(1000);
				}
				nombretmp -= 1000;
			}
		}
		else
		{
			str = getDizaineTo1000(nombre);
		}
		

		debut = nombre - (nombre % 10);

		int nbI = nombre - debut;
		
		switch(nbI)
		{
			case 4:
				str += "IV";
				break;
			case 5:
				str += "V";
				break;
			case 9:
				str += "IX";
				break;
		}
		
		if(nbI <= 3)
		{
			for(int i = 1; i <= nbI; i++)
			{
				str+="I";
			}
		}
		else if(nbI > 5 && nbI != 9)
		{
			str+="V";
			for(int i = 5; i < nbI; i++)
			{
				str+="I";
			}
		}
		
		
		return str;
	}
	

	public static void main(String[] args) {
		

		for(int i = 1; i <= 3000; i++)
		{
			System.out.println("nombre " + i + " => " + nombreToRomain(i));
		}
	}
	

}
