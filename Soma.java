public class Soma {
	public static int soma(int lista[], int num){
		if (lista[num] == 0){
			return 0;
		}
		if (lista[num] == 1){
			return num;
		} else return lista[0] + soma(lista, lista[1]);
	}

	public static void main(String[] args){
		int soma = 0;
		for (String num: args){
			soma += Integer.parseInt(num); 
		}
		System.out.println(soma);
	}
}

