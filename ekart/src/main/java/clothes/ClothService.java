package clothes;

public class ClothService {
	Clothpojo cloth=new Clothpojo(); 
	
	void choosecloth() {
		String names[]=cloth.getNames();
				for(int cindex=0;cindex<names.length;cindex++)
					System.out.print(cindex+1+"."+names[cindex]+" ");
				
				
		
	}
}
