/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		String str = "thequickbrownfoxjumpsoverthelazydog";
      boolean[] alphaList = new boolean[26];
      int index = 0;
      int flag = 1;
      for (int i = 0; i < str.length(); i++) {
         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            index = str.charAt(i) - 'A';
         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            index = str.charAt(i) - 'a';
      }
      alphaList[index] = true;
   }
   for (int i = 0; i <= 25; i++) {
      if (alphaList[i] == false)
      flag = 0;
   }
   System.out.print("String: " + str);
   if (flag == 1)
      System.out.print("\nTrue.");
   else
      System.out.print("\nFalse.");
	}
}
