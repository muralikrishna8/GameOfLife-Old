// http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

package gameOfLife;

public class gameOfLife {
	public static void main(String[] args) {
		
		int positionsSeed[][] = {{1,1}, {1,2}, {2,1}, {2,2}};
		
		new gameOfLifeSetUp(positionsSeed);
	}
}
