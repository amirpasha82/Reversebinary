import java.util.Scanner;
public class Solution {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int sum = 0;
	    	while (n != 0){
	    		int r = n%2;
	    		sum = sum*2 + r;
	    		n = n/2;
	    	}
	        System.out.println(sum);
	    }
}
	

