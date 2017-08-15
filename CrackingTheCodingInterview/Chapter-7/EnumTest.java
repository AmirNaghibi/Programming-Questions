/*
An enum type is a special data type that enables for a variable to 
	be a set of predefined constants. The variable must be equal 
	to one of the values that have been predefined for it. Common 
	examples include compass directions (values of NORTH, SOUTH, 
	EAST, and WEST) and the days of the week.
*/


public class EnumTest{
	// Days of the week
	public enum Day{
		SATURDAY,SUNDAY,MONDAY,
		TUESDAY,WEDNESDAY,THURSDAY,
		FRIDAY
	}

	Day day;

	//public EnumTest(Day dat){this.day=day;}

	public void tellDayMood(Day day){
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are great!");
				break;
			case TUESDAY:
				System.out.println("Tuesdays are shortend");
				break;
			case SATURDAY: case SUNDAY:
				System.out.println("YAY, Weekends!!");;
				break;
			default:
				System.out.println("middle of the week");
				break;
		}
	}


	public static void main(String[] args) {
		EnumTest obj = new EnumTest();
		obj.tellDayMood(Day.THURSDAY);
	}
}