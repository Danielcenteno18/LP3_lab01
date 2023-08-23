import java.util.Scanner;

public class Principal {


	public class ejemplo {

	    public static void main(String[] args){

	        int vida, rp;
	        boolean fl = false;
	        vida = 0; 
	        try (Scanner sc = new Scanner(System.in)) {
				do {
					vida++;
					System.out.println("V2");
					System.out.println("vida:"+vida+"\t¿cual es el numero secreto?");
					rp = sc.nextInt();
					if (rp == 1234){
						
						fl = true;
					}
					
				}while (vida < 3 && !fl);
			}
	        if (fl == true) {
	        	System.out.println("adivinaste!!!!!");
	        }
	        else {
	        	System.out.println("ups, perdiste......");
	        }
	    }

	}
}
