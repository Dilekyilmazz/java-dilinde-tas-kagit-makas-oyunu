package taskagit;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Random rastgele =new Random();
		int pc = rastgele.nextInt(3);
		String [] secenekler={"taş" , "kağıt" , "makas"};
		String pcs = secenekler[pc];
		
		System.out.println("tas , kagıt , makas hangisini seçiyorsunuz?");
		String giris = input.next();
		
		if(giris.equals("taş")||  giris.equals("kağıt") || giris.equals("makas")) {
			if(giris.equals(pcs)) {
				System.out.println("berabere");
			}else if(giris.equals("taş") && pcs.equals("kağıt") || giris.equals("kağıt") && pcs.equals("makas")|| giris.equals("makas") && pcs.equals("taş")) {
				System.out.println("kaybettiniz");
			}else {
				System.out.println("kazandınız");
				
			}
			System.out.println("bilgisayarın seçtiği = "+pcs+" sizin seçtiğiniz ise = "+giris);
		}else {
			System.out.println("yanlış girdiniz");
		}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			
		}
		
		

	

}
