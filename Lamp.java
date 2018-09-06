package lab2;

public class Lamp{
	// Object Attributes
    public boolean isOn = false;
	String color;
	int watts;
	
	public String showStatus(){
		return " Light is " + isOn() + "is"
		+ " is color " + color + "\n"
		+ " and is " + watts + "watts";
	}
	
	public String isOn(){
		if (isOn){
			return "OFF";
		}else{
			return "OFF";
		}
			
		
	}
	
	// Object Methods
	public void turnOn(){
		isOn = true;
	}
	public void turnOff(){
		isOn = false;
	}
	public void setColor(String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	public void setWatts(int w){
		int = w;
	}
	public void getWatts(){
		return watts;
	}
	
	
}