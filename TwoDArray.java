package geekstser;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr= {{1,0,0},{0,1,3},{2,4,1}};
		boolean  flag=false;
		int ans=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
				if(arr[i][j]==ans) {
					flag=true;
				}else {
					flag=false;
					System.out.println("false");
					break;
				}
			}
		}if(flag==false) {
			break;
		}
		
	}
		if(flag==true) {
			System.out.println("true");
		}
	}
}

			
		
			
			
		

	



