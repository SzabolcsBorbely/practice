package fizzbuzz;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz{

	public List<String> generateSequence(Integer range_floor, Integer range_top){
		List<String> result_list = new ArrayList<String>();
		boolean divisible_by_3, divisible_by_5;

		for (Integer i=range_floor;i<=range_top;i++){
			divisible_by_3 = i%3 == 0;
			divisible_by_5 = i%5 == 0;

			if ( divisible_by_3 & divisible_by_5 )
				result_list.add("fizzbuzz");
			else if ( divisible_by_3 )
				result_list.add("fizz");
			else if ( divisible_by_5 )
				result_list.add("buzz");
			else
				result_list.add(i.toString());
		}
		return result_list;
	}

	public List<String> fizzBuzzSequence(String range_floor, String range_top){
		if (rangeIsValid(range_floor, range_top)){
			Integer floor = Integer.parseInt(range_floor);
			Integer top = Integer.parseInt(range_top);
			return generateSequence(floor, top);
		}
			return null;
	}
	
	public boolean rangeIsValid(String range_floor, String range_top){
		try{
			Integer floor = Integer.parseInt(range_floor);
			Integer top = Integer.parseInt(range_top);
			if (floor<0 || top<0)
				return false;
			if (top<floor)
				return false;
		}
		catch (NumberFormatException e){
			return false;
		}
		return true;
	}

	public static void main(String[] args){
		
	}

}
