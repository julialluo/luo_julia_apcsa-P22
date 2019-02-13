//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels= "AEIOUaeiou";
	   int index = vowels.indexOf(a.substring(0, 1));
	   int inde = vowels.indexOf(a.substring(a.length()-1,a.length()));
	   if (index+inde !=-2){
		   return "yes";
	   }
	  return "no";
	}
}