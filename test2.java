1.your task is to make two function(max or min or Maximum and Minimum depending on 
language)that receives a list of integers as input and return the largest and
lowest numbers i the list respectively.
input={45,333,76,29,900,23,474,654,29,454}
output=min=23 max=900;

2.Timmy & sarah think they are in love,but around where they live, they will only
know once they pick a flower each, if one of the flower has an even number of petals
and the other has an old number of petals it means they are in love.
write the function that will take the number of petals of each flower and return
true if they are in love and false if they aren't.
Ans: public class Timmy {
	
	static boolean findLove(int num) {
		if(num % 2 == 0) {
			System.out.println("They are In Love");
			return true;
		}else {
			System.out.println("They are not in love");
		}
		return false;
	}

	public static void main(String[] args) {
		
		findLove(11);//They Are not in love

	}
}


3.what are generalised and specilised class in java?
4.a)i dont want my class to be inherited by any other class.what should i do?
Ans: we should make class as Final ,so that no can inherit that class.
 b) can you give a few examples of final classes defined in java API?
 Ans: String Class
 c) What are some alternatives to inheritance?
 Ans: Alternatives to inheritance is Interface.

5) which sorted collection have u used?
Ans:Stream
6) what is difference between LinkedList and ArrayList in java?
Ans:i)LinkedList uses Node and ArrayList used Array.
   ii)LinkedList is slow while Reading the elements Because it will check every Node.
      ArrayList is Fast while Reading the elements because it will check through index value.
  iii)LinkedList is fast while Adding,or Removing the elements,
      ArrayList is slow while Adding,or Removing the elements .  
7) what is the difference between ListIterator and Iterator?
Ans:ListIterator is used to iterator elements in both forward and backward direction.
    Iterator is used only loop elements in forward direction.
8) what is the covarient method and overriding in java?
Ans: overriding: If we want to use the parent method in Subclass we use that method
     that is called Override 
9)what is memory leakage in java?
10)Explain Static polymorphism And dynamic polymorphism?
Ans:static Polymorphism: It binds the method with method defination before the
    excution of the main method.
	Dynamic polymorphism: It binds the method with method defination during the
	excution of the main method.
11)Hema Created a class called personInformation and she want to give securtiy for
the properties how can she achieve?
Ans:make All properties as Private and class as Final.