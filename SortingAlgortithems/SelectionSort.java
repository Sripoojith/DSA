package demo;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {90,25,0,89,1,-9,-6,100,-100};
		System.out.println(Arrays.toString(selectionSort(array)));
	}
	static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int end = array.length-i-1;
			int max = max(array,0,end);
			sort(array,max,end);
		}
		return array;
	}
	static int max(int[] array,int start,int end) {
		int maxElement = start;
		for (int i = start; i <= end; i++) {
			if(array[maxElement]<array[i]) {
				maxElement = i;
			}
		}
		return maxElement;
	}
	static void sort(int[] array,int num1,int num2) {
		int temp = array[num1];
		array[num1]=array[num2];
		array[num2]= temp;
	}
}


