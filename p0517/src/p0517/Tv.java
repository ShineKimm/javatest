package p0517;

public class Tv {

	String color;
	boolean power; //on / off 0또는1
	int channel; //3-tvn 5-sbs -kbs 9-kbs1 11-mbc
	
	void power() {
		power = !power; //true, false
	}
	void channelup(){
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
