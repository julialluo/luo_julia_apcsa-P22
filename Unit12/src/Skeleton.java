//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	//add a constructor

	
	public Skeleton(String n, int s) {
		name = n;
		size = s;
	}
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return (other.getHowBig()>size);
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return (other.getHowBig()<size);
	}

	@Override
	public boolean namesTheSame(Monster other) {
		return (other.getName().equals(name));
	}
	//add instance variables	

	//add code to implement the Monster interface

	//add a toString
	public String toString() {
		return ""+name+ " " +size+ "";
	}
}