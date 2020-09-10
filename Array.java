package scripts;

public class Array {

	public static void main(String[] args) {
		int Sum=0;
		int c[] = {1,2,3,4,5};
		for(int i=0;i<c.length;i++){
			Sum = Sum + c[i];
			//System.out.println(c[i]);
		}
		System.out.println(Sum);

	}

}
