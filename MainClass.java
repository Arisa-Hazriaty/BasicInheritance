package ConceptInheritence;

public class MainClass {
	
	public static void main(String[] args)
	{
		Sapi sapi1 = new Sapi();
		sapi1.tampilSuara();
		sapi1.mamam();
		sapi1.showInfo("Cowman ", 3 );
		sapi1.Jalan();
		sapi1.Bernafas();
		sapi1.lahir();
		
		
		System.out.println("");
		Ikan Ikan1 = new Ikan();	
		Ikan1.tampilSuara();
		Ikan1.mamam();
		Ikan1.showInfo("FlyingFish ", 5);
		Ikan1.Jalan();
		Ikan1.Bernafas();
		Ikan1.bertelur();
		
	}

}
