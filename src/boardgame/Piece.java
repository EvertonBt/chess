package boardgame;

public class Piece {

	private Board board;
	protected Position position;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// o tabuleiro só será acessado por classes do mesmo pacote(boardgame) e por classes filhas
	protected Board getBoard() {
		return board;
	}
	
	
}
