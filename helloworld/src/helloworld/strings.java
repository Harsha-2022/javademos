package helloworld;

public class strings {

	public static void main(String[] args) {
      String name = "max williams";
      String s1 = new String("winchester");
      char[] c = {'s','a','m','m','y'};
      String s2 = new String(c);
      byte[] b = {12,13,14};
      String s3 = new String(b);
      System.out.println("Name: "+ name);
      System.out.println("new name: "+ s1);
      System.out.println("length of name: "+ name.length());
      System.out.println("nick name: "+ s2);
      System.out.println("numbers: "+ s3);
	}

}
