
public interface Service {
	void newGame();
	void newRound();
	Card draw(int player);
	void bet(int amount, int player);
	void giveUp(int player);
	void done(int player);
	GuiController getGuiController();
}
