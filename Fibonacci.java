public class Fibonacci {
	public static int fibonacci(int num){
		if (num < 2) {
			return num;
		} else return fibonacci(num-2) + fibonacci(num -1);
	}
	
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);		
		System.out.println(fibonacci(num));
	}
}
