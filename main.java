public class main {

	public static void main(String[] args) {
		int[] a = {15,9,60,44,12,1,4};
		int size = a.length;
		mergeSort(a,size);
		for(int i:a){
			System.out.println(i+" ");
		}
	}
	
	public static void merge(int[] a, int[] left, int[]right, int leftSide, int rightSide){
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < leftSide && j < rightSide){
			if(left[i] < right[j]){
				a[k++] = left[i++];
			}
			else{
				a[k++] = right[j++];
			}
		}
		while(i < leftSide){
			a[k++] = left[i++];
		}
		while(j < rightSide){
			a[k++] = right[j++];
		}
	}
	public static void mergeSort(int[]a, int size){
		if(size < 2) return;
		int mid = size/2;
		int[] left = new int[mid];
		int[] right = new int[size - mid];
		
		for(int i = 0; i<mid; i++){
			left[i] = a[i];
		}
		for(int i = 0; i<mid; i++){
			right[i] = a[i+mid];
		}
		mergeSort(left,mid);
		mergeSort(right,size-mid);
		merge(a,left,right,mid,size-mid);
	}
}
