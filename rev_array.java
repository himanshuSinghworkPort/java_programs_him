public class ReverseArrays {

public static void main(String[] args) {
	int[] array = new int[]{1,2,34,5,6,89};
	for(int i:array) {
		System.out.print(i+" ");
	}
	reverseArray(array);
	System.out.println();
	for(int i:array) {
		System.out.print(i+" ");
	}
}

public static void reverseArray(int[] array) {
	for(int i = 0; i < Math.ceil((double)array.length/2); i++) {
		int temp = array[i];
		array[i] = array[array.length-1-i];
		array[array.length-1-i] = temp;
	}
}
	
}