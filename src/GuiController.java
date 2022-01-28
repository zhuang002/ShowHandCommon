import java.util.List;

public interface GuiController {
	void displayCards(int player, List<Card> cards);
	void displayBets(int player, int amount);
	void displayInventories(int player, int amount);
	void roundDone();
	void gameOver(int player);
}
