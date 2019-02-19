//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect () {
	   number = 0;
   }
   public Perfect (int x) {
	   number = x;
   }
   public void setPerfect(int x) {
	   number = x;
   }
   
	public boolean isPerfect()
	{
		int sumofdivisors = 0;
		for (int i = 1; i<number; i++) {
			if (number%i==0) {
				sumofdivisors=sumofdivisors+i;
			}
		}
		if (sumofdivisors == number) {
			return true;
		}
		else{
			return false;
		}
	}

	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
		
		
	}
	
}