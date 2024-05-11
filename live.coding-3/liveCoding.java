import java.util.Scanner;

public class liveCoding 
{
	public static void imprimir(int mangos, int naranjas) 
	{
		int minimo = Math.min(mangos, naranjas);

	    int cajas = 1;
	    int mangosPorCaja = 1;
	    int naranjasPorCaja = 1;
	    for (int i = 2; i <= minimo; i++) 
	    {
	    	if (mangos % i == 0 && naranjas % i == 0) 
	        {
	    		cajas = i;
	            mangosPorCaja = mangos / i;
	            naranjasPorCaja = naranjas / i;
	        }
	    }

	    System.out.println("El número de cajas de mangos es: " + cajas);
	    System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
	    System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
	}
	    
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de mangos: ");
        int mangos = scanner.nextInt();

        System.out.print("Ingrese el número de naranjas: ");
        int naranjas = scanner.nextInt();

        imprimir(mangos,naranjas);

        scanner.close();
    }
}
