
public class Line {
	
	private Point begin = new Point();
	private Point end = new Point(); 
	
	//Constructor
	public Line(int x1, int y1, int x2, int y2){
		this.begin.setX(x1);
		this.begin.setY(y1);
		this.end.setX(x2);
		this.end.setY(y2);	
	}
	
	public Line(Point begin, Point end){
		this.begin = begin;
		this.end = end;		
	}
	
	public Point getBegin(){
		return this.begin;
	}
	
	public void setBegin(Point begin){
		this.begin = begin;
	}
	
	public Point getEnd(){
		return this.end;
	}
	
	public void setEnd(Point end){
		this.end = end;
	}
	
	public int getBeginX(){
		return this.begin.getX();
	}
	
	public int getBeginY(){
		return this.begin.getY();
	}
	
	public void setBeginX(int x){
		this.begin.setX(x);
	}
	
	public void setBeginY(int y){
		this.begin.setY(y);
	}
	
	public int[] getBeginXY(){
		int[] punto = new int[2];
		punto[0] = this.begin.getX();
		punto[1] = this.begin.getY();
		
		return punto;
	}
	
	public void setBeginXY(int x, int y){
		this.begin.setXY(x, y);
	}
	
	public int getEndX(){
		return this.end.getX();
	}
	
	public int getEndY(){
		return this.end.getY();
	}
	
	public void setEndX(int x){
		this.end.setX(x);
	}
	
	public void setEndY(int y){
		this.end.setY(y);
	}
	
	public int[] getEndXY(){
		int[] punto = new int[2];
		punto[0] = this.end.getX();
		punto[1] = this.end.getY();
		
		return punto;
	}
	
	public void setEndXY(int x, int y){
		this.end.setXY(x, y);
	}
	
	public String toString(){
		return "Line[begin = (" + this.begin.getX() + ", " + this.begin.getY() + "), end = (" + 
	                              this.end.getX() + ", " + this.end.getY() + ")]";
		
	}

	public double getLength(){
		return this.begin.distance(this.end);
	}
}
