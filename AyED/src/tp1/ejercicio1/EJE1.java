package tp1.ejercicio1;
import java.util.ArrayList;

public class EJE1 {

	public static void main(String[] args) {
		int a = 1;
		int b= 7;	
		imprimirConFor(a,b);
		System.out.println("-------");
		imprimirConWhile(a,b);
		System.out.println("-------");
		imprimirConLista(a,b);
		System.out.println("-------");
		imprimirConListaSinRecursion(a,b);
	}
	
	public static void imprimirConFor(int a, int b) {
		for (int i = a; i<=b;i++) {
			System.out.println(i);
		}
	}


	public static void imprimirConWhile(int a,int b) {
		int i = a;
		while (i<=b) {
			System.out.println(i);
			i++;
		}
	}
	
	//para el metodo sin iterar necesito una lista
	
	public static void imprimirConLista(int a, int b) {
		// declaro la lista
		ArrayList<Integer> lista = new ArrayList<>();
		
		// procedimiento que llena la lista
		llenarLista(lista,a,b);
		
		for(int num:lista) {
			System.out.println(num);
		}
	}
	
	
	public static void imprimirConListaSinRecursion(int a, int b) {
		// declaro la lista
		ArrayList<Integer> lista = new ArrayList<>();
		
		// procedimiento que llena la lista
		llenarListaSinRecursion(lista,a,b);
		
		for(int num:lista) {
			System.out.println(num);
		}
	}
	
	//con recursion seria asi
	public static void llenarLista(ArrayList <Integer> lista,int a,int b) {
		if(a>b)return;
		lista.add(a);
		llenarLista(lista,a+1,b);
	}
	
	public static void llenarListaSinRecursion(ArrayList <Integer> lista,int a,int b) {
		for (int i=a; i<=b; i++ ) {
			lista.add(i);
		}
	}
	
}