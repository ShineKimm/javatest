package pack01;

class Tv {
	boolean power;
	int channel;
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channeldown() {
		channel--;
	}
}
