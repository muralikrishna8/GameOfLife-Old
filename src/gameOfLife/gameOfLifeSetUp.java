package gameOfLife;

public class gameOfLifeSetUp {
	

	public boolean gameState[][] = new boolean[4][4];
	
	public gameOfLifeSetUp(){
		
	}
	
	public gameOfLifeSetUp(int[][] positionsSeed) {
		for(int i=0; i<positionsSeed.length; i++){
			gameState[positionsSeed[i][0]][positionsSeed[i][1]] = true;
		}
		new generateNext();	
		
	}
	}
