
public class Locker100Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean OPEN = true;
		boolean CLOSED = false;
		boolean[] array = new boolean[101];
		int i,j, diff = 1;
		
		for(i=0; i<100; i++)
			array[i] = CLOSED;

		
		for(i=0; i<100; i++) {
			for(j=i;j<100; j=j+diff) {
				if (array[j] == CLOSED)
					array[j] = OPEN;
				else 
					array[j] = CLOSED;
			}
			System.out.print("Round " + i + " -");
			for(int k=0; k<100; k++)
				if(array[k] == OPEN)
					System.out.print(" " + (k+1));
			System.out.println("");
			diff++;
			
		}
		
	}

}
