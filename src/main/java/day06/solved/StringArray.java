package day06.solved;

public class StringArray {
	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		cityArr[3] = "Delhi";


		int  j =0;
		// Display the city names
		for (String cityName : cityArr) {
			System.out.print("The intial city name is " + cityName);
		
			if(cityName.equals("Bangalore")) {
				cityArr[j] = "Kolkata";
				
			}else if(cityName.equals("Mumbai")) {
				cityArr[j] = null;
				
			}
			System.out.println(" Final value is " + cityArr[j]);
		}
		
		
	}

}
