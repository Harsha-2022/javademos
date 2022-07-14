package helloworld;

public class conditions {

	public static void main(String[] args) {
         boolean isalien=false;
         if (isalien){
        	 System.out.println("it is an alien");
         }
         if(!isalien) {
        	 System.out.println("it is not an alien");
         }
         boolean mybool= false;
         if(mybool=true) {
        	 System.out.println("x");
         }
         else {
        	 System.out.println("y");
         }
         int a=2;
         int b=6;
         int c=10;
         System.out.println("a<b and a<c= "+(a<b && a<c));
         System.out.println("a<b and a<c= "+(a<b & a<c));
         System.out.println("a<b and a<c= "+(++a<b && a<c));
         System.out.println("a after logical and= "+a);
         System.out.println("a>b and a<c= "+(++a>b && a<c));
         System.out.println("a after bitwise and= "+a);
         System.out.println("a>b and a<c= "+(++a>b & a<c));
         System.out.println("a after bitwise and= "+a);
         System.out.println("a>b and a>c= "+(a>++b & a>c));
         System.out.println("b after bitwise and= "+b);
	}

}
