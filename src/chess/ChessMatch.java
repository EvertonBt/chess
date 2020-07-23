package chess;

import boardgame.Board;

// gera a matriz do tabuleiro com as pe�as
public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
}
