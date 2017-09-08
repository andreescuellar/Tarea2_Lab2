
public class Point {

	//Variables privadas
	
	private int x = 0;
	private int y = 0;
	
	//Constructor Vacio
	public Point(){
		
	}
	
	//Constructor
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//Funciones y procedimientos
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	
	public int[] getXY(){
		int[] coordinates = new int[2];
		coordinates[0] = this.x;
		coordinates[1] = this.y;
		
		return coordinates;
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x, int y){
		
		//Variables de apoyo
		double valueX = 0;
		double valueY = 0;
		double result = 0;
		
		// Encuentra el valor sobre el eje X
		if(this.x < 0 && x >= 0){
			valueX = x - this.x;
		}
		else{
			if(this.x >= 0 && x < 0){
				valueX = this.x - x;
			}
			else{
				if(this.x < 0 && x < 0){
					if(this.x >= x){
						valueX = this.x - x;
					}
					else{
						valueX = x - this.x;
					}
				}
				else{
					if(this.x >= x){
						valueX = this.x - x;
					}
					else{
						valueX = x - this.x;
					}
				}	
			}
		}
		
		
		// Encuentra el valor sobre el eje Y
		if(this.y < 0 && y >= 0){
			valueY = y - this.y;
		}
		else{
			if(this.y >= 0 && y < 0){
				valueY = this.y - y;
			}
			else{
				if(this.y < 0 && y < 0)
				{
					if(this.y >= y){
						valueY = this.y - y;
					}
					else{
						valueY = y - this.y;
					}
				}
				else{
					
					if(this.y >= y){
						valueY = this.y - y;
					}
					else{
						valueY = y - this.y;
					}
				}			
			}
		}
		
		//Pitagoras
		result = Math.pow(valueX, 2) + Math.pow(valueY, 2);
		result = Math.sqrt(result);
		
		return result;		
	}

	public double distance(Point another){
		
		//Variables de apoyo
		double valueX = 0;
		double valueY = 0;
		double result = 0;
		
		// Encuentra el valor sobre el eje X
		if(this.x < 0 && another.getX() >= 0){
			valueX = another.getX() - this.x;
		}
		else{
			if(this.x >= 0 && another.getX() < 0){
				valueX = this.x - another.getX();
			}
			else{
				if(this.x < 0 && another.getX() < 0){
					if(this.x >= another.getX()){
						valueX = this.x - another.getX();
					}
					else{
						valueX = another.getX() - this.x;
					}
				}
				else{
					if(this.x >= another.getX()){
						valueX = this.x - another.getX();
					}
					else{
						valueX = another.getX() - this.x;
					}
				}	
			}
		}
		
		// Encuentra el valor sobre el eje Y
		if(this.y < 0 && another.getY() >= 0){
			valueY = another.getY() - this.y;
		}
		else{
			if(this.y >= 0 && another.getY() < 0){
				valueY = this.y - another.getY();
			}
			else{
				if(this.y < 0 && another.getY() < 0){
					if(this.y >= another.getY()){
						valueY = this.y - another.getY();
					}
					else{
						valueY = another.getY() - this.y;
					}
				}
				else{
					
					if(this.y >= another.getY()){
						valueY = this.y - another.getY();
					}
					else{
						valueY = another.getY() - this.y;
					}
				}				
			}
		}
		
		//Pitagoras
		result = Math.pow(valueX, 2) + Math.pow(valueY, 2);
		result = Math.sqrt(result);
		
		return result;
	}
	
	public double distance(){
		
		int origenX = 0;
		int origenY = 0;
		
		//Variables de apoyo
		double valueX = 0;
	    double valueY = 0;
		double result = 0;
		
		
		// Encuentra el valor sobre el eje X
		if(this.x < 0 && origenX >= 0){
			valueX = origenX - this.x;
		}
		else{
			if(this.x >= 0 && origenX < 0){
				valueX = this.x - origenX;
			}
			else{
				if(this.x < 0 && origenX < 0){
					if(this.x >= origenX){
						valueX = this.x - origenX;
					}
					else{
						valueX = origenX - this.x;
					}
				}
				else{
					if(this.x >= origenX){
						valueX = this.x - origenX;
					}
					else{
						valueX = origenX - this.x;
					}
				}	
			}
		}
				
		// Encuentra el valor sobre el eje Y
		if(this.y < 0 && origenY >= 0){
			valueY = origenY - this.y;
		}
		else{
			if(this.y >= 0 && origenY < 0){
				valueY = this.y - origenY;
			}
			else{
				if(this.y < 0 && origenY < 0){
					if(this.y >= origenY){
						valueY = this.y - origenY;
					}
					else{
						valueY = origenY - this.y;
					}
				}
				else{
					
					if(this.y >= origenY){
						valueY = this.y - origenY;
					}
					else{
						valueY = origenY - this.y;
					}
				}				
			}
		}
		
		//Pitagoras
		result = Math.pow(valueX, 2) + Math.pow(valueY, 2);
		result = Math.sqrt(result);
		
		return result;
	
	}
	
}
