public class MethodOverloadChallenge2 {
	public static void main(String[] args) {
		
		getDurationString (61,0);
		getDurationString (3660);
		
	}
	public static int getDurationString (int minute, int seconds) {
		if (minute >= 0 && (seconds >=0 && seconds <59))
		{
			
			
			long toHours = minute / 60;
			
			long toMinute = minute/60;
			long calculateSecondsToMinute = seconds/60;
			long calculateToMinute = minute * 60;
			
			System.out.println( "Hours: "+toHours +  " minute: " +toMinute  +  " seconds: " + calculateToMinute );
			System.out.printf("%02dH %02d, %02dS %n ", toHours,toMinute,calculateToMinute);
			
		}else 
		{
			System.out.println("invalid value"); ;
		}
		return -1;
	}
	
	public static int getDurationString (int seconds) {
		if (seconds >= 0) 
		{
			
			long toMinute = seconds / 60;
			long toHours = toMinute / 60;
			
			System.out.println(seconds + " seconds = "+"hours: "+ toHours+ " minute: "+ toMinute );
			System.out.printf("%02d S %02d H %02d M %n ", seconds, toHours, toMinute);
			
		} else {
			System.out.println("Enter inValid");
		}	
		
		return -1;
	}
