import java.util.*;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		List<Integer> listaOriginal = Arrays.asList(1,2,3,4,5,6,7,8);
		listaOriginal.add(9);
		
		List<Integer> listaNueva = listaOriginal.stream().
									filter(n->{
										System.out.println("Filtro: "+ n);
										return n%2==0;
									}).
									map(n-> {
										System.out.println("Extraigo: "+ n);
										return n;
									}).
									collect(Collectors.toList());
		
		System.out.println("Imprimo Lista final------------------ ");
		listaNueva.forEach(System.out::println);
	}

}
