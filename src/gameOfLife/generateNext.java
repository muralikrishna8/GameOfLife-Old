package gameOfLife;

public class generateNext extends gameOfLifeSetUp{
	
	public generateNext(){
		printTheGame();
		startTheGeneration();
	}
	
	
	
	private void startTheGeneration() {
		
		
	}



	private void printTheGame(){
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				if(gameState[i][j]){
					System.out.print("A");
				}else{
					System.out.print("D");
				}
			}
			System.out.println();
		}
	}

}
