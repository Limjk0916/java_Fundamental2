package java_20190605;

class Car{
	String modelNumber;
	String color;
	int year;
	
	
	
	//매개변수 있는 생성자 alt+shift+s => o => ok
	//디폴트 생성자 alt +shift+s => c => ok
	
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}
	
	
	//setter,getter : alt+shift+s => r +> ok
	//해쉬코드 : alt+shift+s => h +> ok
	


	public String getColor() {
		return color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
	
	//toString() : alt+shift+s => s =>ok


	public void setColor(String color) {
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + ", year=" + year + "]";
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	
}

public class EqualsDemo {
	public static void main(String[] args) {
		Car c1 = new Car("010101000","black",2018);
		Car c2 = new Car("010101000","black",2018);
		
		Car c3 = new Car("010101001","red",2019);
		Car c4 = new Car("010101001","red",2019);
		
		System.out.println(c2.toString());
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 hashCode : "+c1.hashCode());
		System.out.println("c2 hashCode : "+c2.hashCode());
		
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println("c3 hashCode : "+c3.hashCode());
		System.out.println("c4 hashCode : "+c4.hashCode());
	}

}
