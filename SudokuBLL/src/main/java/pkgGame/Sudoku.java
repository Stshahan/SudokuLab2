
package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	 
	private int iSize; //length of the sudoku puzzle
	
	private int iSqrtSize; // square root of iSize
	
	public Sudoku(int iSize) throws java.lang.Exception {
		
		super();
		this.iSize=iSize;
		
		try {
			if (Math.sqrt(iSize) == (int) Math.sqrt(iSize)) {
				this.iSqrtSize = (int) Math.sqrt(iSize);
			}
		}
			catch(Exception e) {
				System.out.print("Dude, this is Sudoku. Give me a perfect square.");
			}
		}
		//if //check if iSqrtSize is an int. Throw exception if it isn't. 
		//Finally block will run if no matter if there's is an exception or not
	 

	public Sudoku(int[][] puzzle) throws java.lang.Exception { 
		super(puzzle);
		
	} 
	 
	protected int [] getRegion(int iRegionNum) {
		
		return null;
	}
	 
	protected int [] getRegion(int Col, int Row)
	{
		int [] aCol = getColumn(Col); //Get the column and row the parameters represent.
		int [] aRow = getRow(Row);
		
		for(int i = 0; i < aCol.length; i++) {
			for (int j = 0; j < aRow.length; j++) {
				
			}
		}
		
		//need to use SqrtSize, that will determine how many regions there will be in the puzzle.
		return null;
	}
	
	protected int getPuzzle() {
		return this.puzzle;
	}

	protected boolean isSudoku() {
		if(isPartialSudoku() == true) {
			return true;
		}
		else {
		return false;
		}
		//Must be latin square and each region must be tested.
	}
	
	protected boolean isPartialSudoku() {
		// Will return true it it's Sudoku and there's a zero value
		return false;
	}
	
	protected boolean isValueValid(int Val, int Col, int Row) {
		
		return false;
	}
	
}