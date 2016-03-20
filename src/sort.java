import java.util.Arrays;

public class sort {
	
	
	/*@ requires arrayToSort != null;
	  @	ensures (\forall int i; 
	  @				0 <= i && i < arrayToSort.length-1;
	  @					arrayToSort[i] <= arrayToSort[i + 1]);
	  @
	  @ ensures (\forall int j;
	  @				0 <= j && j <= arrayToSort.length-1;
	  @					(\num_of int i; 0 <= i && i <= arrayToSort.length-1; arrayToSort[i] == \old(arrayToSort[j]))
	  @					== 
	  @					(\num_of int i; 0 <= i && i <= arrayToSort.length-1; \old(arrayToSort[i]) == \old(arrayToSort[j])));
	  @*/
	public int[] sortArray(int[] arrayToSort) {
		int buffer = 0;		
		for(int j = 0; j < arrayToSort.length-1; j++) {
			for(int i = 0; i < arrayToSort.length-1; i++) { 
				if(arrayToSort[i] > arrayToSort[i+1]) {
					buffer = arrayToSort[i+1];
					arrayToSort[i+1] = arrayToSort[i];
					arrayToSort[i] = buffer;
				}
			}
		}
		
		return arrayToSort;
	}
	
	
	/*@
	  @ requires array != null;
	  @ ensures (\exists int i; 
	  @				0 <= i && i <= array.length-1;
	  @				array[i] == member && \result == i) ||
	  @			(\forall int j;
	  @				0 <= j && j <= array.length-1;
	  @				array[j] != member && \result == -1);
	  @ 			
	  @*/
	public int membQuery(int[] array,int member) {
		int res = -1;
		int left = 0;
		int mid;
        int right = array.length - 1;
        while (left <= right) {
        	mid = (left + right) / 2;
            if(member < array[mid]) {
            	right = mid - 1;
            } else if (member > array[mid]) {
            	left = mid + 1;
            } else {
            	System.out.println("Mid value: " + mid);
            	res = mid;
            	break;
            }
        }
        return res;
	}
}


