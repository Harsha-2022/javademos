package helloworld;

public class ternary {

	public static void main(String[] args) {
           boolean houseavailable= false;
           boolean loanapproved = true;
           String buyahouse = houseavailable ?(loanapproved?"buyahouse":"donotbuyahouse"):"donotbuyahouse";
           System.out.println(buyahouse);
	       boolean buyiahouse =houseavailable?(loanapproved?true:false):false;
	       System.out.println(buyiahouse);
	}

}
