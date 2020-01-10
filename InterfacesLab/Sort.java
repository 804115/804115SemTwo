//© A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args )
	{
		Comparable[] creatureList = new Creature[3];
		//add 3 creatures to creatureList
		Creature creature1 = new Creature(3);
		Creature creature2 = new Creature(4);
		Creature creature3 = new Creature(5);
		
		creatureList[0] = creature1;
		creatureList[1] = creature2;
		creatureList[2] = creature3;
		
		Arrays.sort(creatureList);  		//will throw an exception until
															//creatures are added to the array		
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}