package modelo;

public class Matematica {

	public static void main (String[]args) { 
	
	int val1 = 13;
	int val2 = 3;
	int e = (int) Math.pow(val1, val2);
	float raiz = (float) Math.sqrt(e);
	
	
	System.out.printf("%d + %d = %d\n",val1, val2,val1 + val2);
	System.out.printf("%d - %d = %d\n",val1, val2,val1 - val2);
	System.out.printf("%d * %d = %d\n",val1, val2,val1 * val2);
	System.out.printf("%d / %d = %d\n",val1, val2,val1 / val2);
	System.out.printf("%d & %d = %d",  val1, val2,val1 + val2);	
	System.out.printf("%d elevado a %d � %d\n ",val1, val2,e);
	System.out.printf("A raiz de %d � %.2f\n",e, raiz);
	}
}
