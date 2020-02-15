package electronics;

import electronics.Electronicpojo;;

public class ElectronicService {
	Electronicpojo electronics=new Electronicpojo(); 
	void chooseeletronics() {
		String names[]=electronics.getNames();
				for(int eindex=0;eindex<names.length;eindex++)
					System.out.print(eindex+1+"."+names[eindex]+" ");
				
				
		
	}
}
