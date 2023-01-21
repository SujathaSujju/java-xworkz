package xworkz_myprograms;

public class SpaceCount {

	public static void main(String[] args) {
       String str = "my name is sujatha";
       int spacecount=0;
       for(int i=0;i<str.length();i++) {
    	   if(str.charAt(i)==' ') {
    		   spacecount++;
    		   
    	   }
       }
       
       System.out.println("the given String " +str+ " has " +spacecount+ " spaces");

	}

}
