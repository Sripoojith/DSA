package demo;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {90,25,0,89,1,-9,-6,100,-100};
		System.out.println(Arrays.toString(insertionSort(array)));
	}
	static int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for(int j = i+1;j>0;j--) {
				if(array[j]<array[j-1]) {
					swap(array,j,j-1);
				}else break;
			}		
		}
		return array;
	}
	static void swap(int[] array,int num1,int num2) {
		int temp = array[num1];
		array[num1]=array[num2];
		array[num2]= temp;
	}
}


