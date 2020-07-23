package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		
		for(int i=0; i < pieces.length; i++) {
			System.out.print(( 8 - i) + " "); // gera os numeros na primeira coluna
			for(int j=0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println(); // quebra de linha p/ a proxima linha
			
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-"); // se a posi��o estiver vazia imprimei somente um tra�o
			
		} else {
			System.out.print(piece); // sen�o imprime a propria pe�a
		}
		System.out.print(" "); // independente do resultado ele sempre vai imprimrir espa�o p/ q as pe�as � fiquem grudadas
	}
}
