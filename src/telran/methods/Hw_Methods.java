package telran.methods;

public class Hw_Methods {
	
	public static boolean isPalidrome(String str ){
		str = str.replaceAll("\\s+", "").toLowerCase();
		
		int left = 0;
		int right = str.length() - 1;
		
		while(left< right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	public static int isReturnNumber(int[] arr) {
		if(arr.length < 2) {
			throw new IllegalArgumentException("in massive need to be more than 2 numbers");
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			}else if(num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}
		
		if(secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("There is no secondLargest element");
		}
		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalidrome("madam"));
		System.out.println(isPalidrome("java"));
		
		 int[] arr = {10, 20, 5, 30};
	        System.out.println(isReturnNumber(arr)); 
	}

}
