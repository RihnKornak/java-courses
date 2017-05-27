public class Calculate {
	public static void main(String[] args){
		String[] data = new String[3];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);
		System.out.println("Input data and operations from keyboard");
		System,out.println("Input first number:");
		data[0] = reader.readLine();
		System,out.println("Input second number:");
		data[1] = reader.readLine();
		System.out.println("Now input needed operation from keyboard, named as summ, divide, multiply or subtract");
		System,out.println("Input needed operation:");
		data[2] = reader.readLine();

		
		if	(data[0].contains(".")){
			double first = Double.parseDouble(data[0]);
		}else{
			int first = Integer.parseInteger(data[0]);
		}
		if	(data[1].contains(".")){
			double first = Double.parseDouble(data[1]);
		}else{
			int first = Integer.parseInteger(data[1]);
		}
		if (data[2].equals("summ"){
			System.out.println("The sum of " + first + " and " + second + " is " + new Operations().summ(first, second));
		}
		if (data[2].equals("subtract"){
			System.out.println("The result of subtract " + first + " and " + second + " is " + new Operations().subtract(first, second));
		}
		if (data[2].equals("divide"){
			System.out.println("The result of divide " + first + " by " + second + " is " + new Operations().divide(first, second));
		}
		if (data[2].equals("multiply"){
			System.out.println("The result of multiply " + first + " by " + second + " is " + new Operations().multiply(first, second));
		}
	}
}