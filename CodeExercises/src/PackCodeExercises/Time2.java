package PackCodeExercises;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	//no-arg constructor 
	//intializes each instance variable to zero
	public Time2(){
		this(0,0,0);
	}
	
	//constructor with hour value
	public Time2(int hour){
		this(hour,0,0);
	}
	
	//constructor with hour and minute value
	public Time2(int hour, int minute){
		this(hour,minute,0);
	}
	
	//constructor with 3 arguments
	public Time2(int hour, int minute,int second){
		if(hour<0||hour>24){ 
			throw new IllegalArgumentException("hour t must me inbetween 0.0 and 20.0");
		}
		if(minute<0||minute>60){
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		}
		if(second<0||second>60.0){
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		}
		this.hour=hour;
		this.second=second;
		this.minute=minute;
		
	}
	
	//Time2 constructor: when time2 object supplied
	public Time2(Time2 time){
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	//set methods
	//setting a new time using universal time:
	//validating the data
	
	public void setTime(int hour, int minute,int second){
		
		if(hour<0.0||hour>24){ 
			throw new IllegalArgumentException("lenght must me inbetween 0.0 and 20.0");
		}
		if(minute<0||minute>60){
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		}
		if(second<0||second>60){
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		}
		this.hour=hour;
		this.second=second;
		this.minute=minute;
		
	}
	
	//validating and setting the hour
	public void setHour(int hour){
		if(hour<0||hour>24) 
			throw new IllegalArgumentException("lenght must me inbetween 0.0 and 20.0");
		this.hour=hour;
    
		
	}
	public void setMinute(int minute){
		if(minute<0||minute>60)
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		this.minute=minute;
		
	}
	public void setSecond(int second){
		if(second>=0||second<60)
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		
	this.second=second;
	}
	
	//get methods
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	//converting String to universal string format
	public String toUniversalString(){
		return String.format("%02d%:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	//converting string in standard time format
	
	public String toString(){
		//return String.format("%d:%02d%:%02d:%02d %s",((getHour()==0||getHour()==12)?12: getHour()%12),getMinute(),getSecond(),(getHour()<12? "AM": "PM"));
		int seconds = getHour()*getMinute()*getSecond();
		return String.format("No. of Seconds= "+seconds);
		
	}

}

