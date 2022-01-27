
public class Card {
	int value;
	char suite; // S, H, D, C
	
	public Card(int v, char s) {
		this.value = v;
		this.suite = s;
	}
	
	@Override
	public String toString() {
		return ""+value+this.suite;
	}
}
