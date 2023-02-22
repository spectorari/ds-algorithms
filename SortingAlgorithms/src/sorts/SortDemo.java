package sorts;

public class SortDemo {

	public static void main(String[] args) {
		char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
		int b[] = { 5, 2, 3, 8, 0, 9, 1, 4, 7, 6 };
		int i;
		
		System.out.print("Original char array: ");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		Quicksort.qsort(a);
		
		System.out.print("Sorted char array: ");
		for(i=0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		System.out.print("Original int array: ");
		
		for(i=0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		
		Quicksort.qsort(b);
		
		System.out.print("Sorted int array: ");
		for(i=0; i < b.length; i++) {
			System.out.print(b[i]);
		}
			
	}

}
