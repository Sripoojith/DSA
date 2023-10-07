import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {25,0,89,1,-9,-6};
		System.out.println(Arrays.toString(bubbleSort(array)));
	}
	static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = 1; j < array.length-i; j++) {
				if(array[j]<array[j-1]) {
					int temp = array[j];
					array[j]=array[j-1];
					array[j-1]= temp;
					flag = true;
				}
			}
			if(!flag) return array;
		}
		return array;
	}
}
