package org.Voting;

public class Voting {
       private void main (int a)  {
    	   if(a%2 == 0) {
    		   System.out.println("Even");
    	   }
    	   else {
    		   System.out.println("odd");
    	   }
       }
       public static void main(String[] args) {
		 Voting c = new Voting();
		 c.main(18);
	}

}
