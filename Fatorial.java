public class Fatorial {
	public static int fatora(int num){
		if(num == 0) {
			return 1;
		} else return num * fatora(num - 1);
	}
	
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);		
		System.out.println(fatora(num));
	}
}