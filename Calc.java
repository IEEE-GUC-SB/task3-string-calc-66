package task3;

public class Calc {

	public int getResult(String s) {
		int sum=0;
		if (s.length()==0)
			return 0;
		else  {
			s=s.replaceAll("\n", ",");
			int count = 0;
			for (int i = 0; i < s.length()-1; i++) {
				      if(s.charAt(i)==',') {
				    	  if(s.charAt(i+1)==',')
				    		  count++;
				   }
			}
			
			if (count>=1) 
				return 0;
			
			String numbers[] = s.split(","); 
			for (String number : numbers) {  // loop through all the number in the string array
			    Integer n = Integer.parseInt(number);  // parse each number
				System.out.println(n);
			    sum += n;     // sum the numbers
			  }	
			return sum;
		}
	
	}
}