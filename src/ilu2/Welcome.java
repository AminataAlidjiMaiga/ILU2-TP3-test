package ilu2;

public class Welcome {
	
	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		retour.append("Hello,");
		if (nom.equals("bob")) {
			retour.append("Bob");
		}
		return retour.toString();
	}
	
	public static void main (String args[])
	{
		String nom=affichage("bob");
		System.out.println(nom);
	}
}
