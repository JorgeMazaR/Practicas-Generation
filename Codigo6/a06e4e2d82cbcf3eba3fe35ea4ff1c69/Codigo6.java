import java.util.ArrayList;

public class Codigo6 
{
	public static void main(String[] args) 
	{ // faltaba el metodo main
		ArrayList<Integer> n = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++)
		{
			n.add((int) (Math.random() * 381) + 20);
			System.out.print(n.get(i) + " ");
		}

		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		int opcion = Integer.parseInt(System.console().readLine());

		int multiplo = (opcion == 1) ? 5 : 7; // se acomoda bien el operador terniario

		for (Integer e : n) 
		{
			if (e % multiplo == 0) 
			{
				System.out.print("[" + e + "] ");
			} else {
				System.out.print(e + " ");
			}
		}

	}
}