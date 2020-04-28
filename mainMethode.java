package TestO;

public class mainMethode {

	public static void main(String[] args) {
		
		Integer [] a  = {3,2,223,32};
		Pair<Integer> ip = getFirstSecond(a);
		System.out.println("first: "+ip.getFirst() +" second :" +ip.getSecond());
		
		String [] s = {"bla","blp","ble"};
		Pair<String> sp = getFirstSecond(s);
		System.out.println("first: " +sp.getFirst()+" second :" + sp.getSecond());
		

	}
	public static   <T extends Pair<T>> Pair getFirstSecond (T[] list){
		
		T n1 = list[0];
		T n2 = list[1];
		
		return new Pair(n1,n2);
		
	}

}
