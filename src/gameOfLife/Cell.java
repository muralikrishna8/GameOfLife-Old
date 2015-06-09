package gameOfLife;

public class Cell {
	private int positionX;
	private int positionY;
	private boolean isAlive;
	
	public void setPosition(int positionX, int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}
	public void setState(boolean state){
		this.isAlive = state;
	}
}
