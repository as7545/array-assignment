/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int[] arr1 = {4,5,6,7,8};
      int n1 = arr1.length;
      int[] arr2 = {1,2,3,4};
      int n2 = arr2.length;
      int[] merge = new int[n1 + n2];
      int i = 0, j = 0, k = 0, x;
      System.out.print("Array 1: ");
      for (x = 0; x < n1; x++)
      System.out.print(arr1[x] + " ");
      System.out.print("\nArray 2: ");
      for (x = 0; x < n2; x++)
      System.out.print(arr2[x] + " ");
      while (i < n1 && j < n2) {
         if (arr1[i] < arr2[j])
            merge[k++] = arr1[i++];
         else
            merge[k++] = arr2[j++];
      }
      while (i < n1)
      merge[k++] = arr1[i++];
      while (j < n2)
      merge[k++] = arr2[j++];
      System.out.print("\nArray after merging: ");
      for (x = 0; x < n1 + n2; x++)
      System.out.print(merge[x] + " ");
   }
}
	

