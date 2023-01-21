package xworkz_myprograms;

public class ReverseString {
 public static void main(String[] args) {
	 
	 String s="Wellcome";
	 String rev=" ";
	 if(s!=null &&s.isEmpty()) {
		 System.out.println(s);
	 }else {
		 
	
	 for(int i=s.length()-1;i>=0;i--) {
		 rev=rev+s.charAt(i);
	 }
	 System.out.println(rev);
	 
	 }
 }
}
