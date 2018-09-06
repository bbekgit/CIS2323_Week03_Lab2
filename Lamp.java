package lab2;

public class Lamp{
	// Object Attributes
    public boolean isOn = false;
	String color;
	int watts;
	
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