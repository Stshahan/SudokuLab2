
package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	public Sudoku() {
		super();
		
	}

	public Sudoku(int[][] puzzle) {
		super(puzzle);
		// TODO Auto-generated constructor stub
	}
	
	protected int [] getRegion(int iRegionNum) {
		
		return null;
	}
	
	protected int [] getRegion(int Col, int Row)
	{
		return null;
	}

	protected boolean isSudoku() {
		return false;
		
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