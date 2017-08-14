package com.techbeamers;

import java.util.StringTokenizer;
// Write Java Code To Get Rid Of Multiple Spaces From A String?
public class removeExtraSpaces {
	 public static void main(String args[]){
	    	
	        String input = "Try    to    remove   extra   spaces.";
	        //Ez elemekre tordeli space-enkent, es el is tunnek a folosleges space-ek.
	        StringTokenizer substr = new StringTokenizer(input, " ");
            System.out.println("A substr token szama: "+substr.countTokens());

	        StringBuffer sb = new StringBuffer();
	        
	        while(substr.hasMoreElements()){
	            sb.append(substr.nextElement()).append(" ");
	            System.out.println(sb);
	        }
	        
	        System.out.println("Actual string: " + input);
	        System.out.println("Processed string: " + sb.toString().trim());
	        
	        //A split az nem jo megoldas, mert ket space koze beiktat egy ures elemet.
	        String[] s2=input.split(" ");
	        System.out.println("Az s2 egy "+s2.length+" elemu tomb.");
	        for(int i=0;i<s2.length;i++) {	        	
	        System.out.println(s2[i].trim()+" ");
	        }
	    }
}
