package helloworld;

public class loops {

	public static void main(String[] args) {
      // for(int i=22;i<98;i=i+2) {
    	//   System.out.println(i);
       //}
		int sum = 0;
		for(int i=1; i<100; i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

}
