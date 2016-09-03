package Main;

public class Time {
	public static final int secsInMin = 60;
	public static final int secsInHour = secsInMin * 60;
	String sTime;
	long lTime;
	/**
	 * Makes a time object at the start of the day 00:00
	 */
	public Time(){
		lTime = 0;
	}
	
	/**
	 * 
	 * @param time
	 */
	public Time(String time){
		sTime = time;
		lTime = timeToLong(time);
	}
	
	/**
	 * Returns the 
	 * @param time
	 * @return
	 */
	long timeToLong(String time){
		long out=0;
		out = getHours(time)*secsInHour+getMins(time)*secsInMin+getSecs(time);
		return out;
	}
	long getLongTime(){
		return lTime;
	}
	
	/**
	 * 
	 * @param in 
	 * The input time in the format of ##:##:##
	 * @return Returns the number of hours
	 */
	int getHours(String in){
		int out=0;
		//Finds the first 2 numbers
		out = (int)(Integer.parseInt(in.substring(0, 2)));
		return out;
	}
	
	/**
	 * 
	 * @param in 
	 * The input time in the format of ##:##:##
	 * @return Returns the number of minutes
	 */
	int getMins(String in){
		int out=0;
		out = (int)(Integer.parseInt(in.substring(3, 5)));
		return out;
	}
	
	/**
	 * 
	 * @param in 
	 * The input time in the format of ##:##:##
	 * @return Returns the number of seconds
	 */
	int getSecs(String in){
		int out=0;
		out = (int)(Integer.parseInt(in.substring(5, 7)));
		return out;
	}
	
	/**
	 * Returns the number of seconds between the two times
	 * @param start
	 * @param end
	 * @return
	 */
	public static long distance(Time start, Time end){
		long out=0;
		//Returns the absolute value of the distance between the times just in case it's an overnight
		out = Math.abs(end.getLongTime() - start.getLongTime());
		return out;
	}
}
