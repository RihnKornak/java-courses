public class Operations {
	public String summ(int first, int second){
		String result = "" + (first + second);
		return result;
	}
	public String summ(double first, double second){
		String result = "" + (first + second);
		return result;
	}
	public String summ(double first, int second){
		String result = "" + (first + second);
		return result;
	}
	public String summ(int first, double second){
		String result = "" + (first + second);
		return result;
	}
	
	public String multiply(int first, int second){
		String result = "" + (first * second);
		return result;
	}
	public String multiply(double first, double second){
		String result = "" + (first * second);
		return result;
	}
	public String multiply(int first, double second){
		String result = "" + (first * second);
		return result;
	}
	public String multiply(double first, int second){
		String result = "" + (first * second);
		return result;
	}
	
	public String divide(int first, int second){
		if (second != 0){
		if	(first % second == 0){
			return "" + first/second;
		}else{
			return String.format("%.8f", first/second);
			
		}
		}else{
			return "You can not divide by zero!"
		}
		}
		
		public String divide(double first, double second){
		if (second != 0){
		if	(first % second == 0.0){
			return "" + first/second;
		}else{
			return String.format("%.8f", first/second);
			
		}
		}else{
			return "You can not divide by zero!"
		}
		}
		
	public String divide( double first, int second){
		if (second != 0){
		if	(first % second == 0.0){
			return "" + first/second;
		}else{
			return String.format("%.8f", first/second);
			
		}
	}else{
			return String.format("%.8f", first/second);
	}
	
	public String divide( int first, double second){
		if (second != 0){
		if	(first % second == 0.0){
			return "" + first/second;
		}else{
			return String.format("%.8f", first/second);
			
		}
	}else{
			return String.format("%.8f", first/second);
	}
	
	public String subtract(int first, int second){
		String result = "" + (first - second);
		return result;
	}
	public String subtract(double first, double second){
		String result = "" + (first - second);
		return result;
	}
	public String subtract(int first, double second){
		String result = "" + (first - second);
		return result;
	}
	public String subtract(double first, int second){
		String result = "" + (first - second);
		return result;
	}
	
}