/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	            int[] arr = {1,2,4,5,7};
        int[] newArr = null;
        int elementToBeDeleted = 5;
        System.out.println("Original Array is: "+Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == elementToBeDeleted){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println("New Array after deleting element = "+elementToBeDeleted+" and shifting: "+ Arrays.toString(newArr));

   }
}
	

