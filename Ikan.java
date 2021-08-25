package ConceptInheritence;

public class Ikan extends Binatang {
	

		@Override
		 public void Bernafas()
		 {
			 System.out.println("Ikan : Ikan Bernafas dengan Insang");
		 }
		@Override
		 public void Jalan()
		 {
			 System.out.println("Ikan : Berenang menggunakan Sirip ");
		 }
		void bertelur()
		{
			 System.out.println("Ikan : Sebagian Ikan Bertelur kecuali ikan paus karena dia Mamalia");

		}
}


