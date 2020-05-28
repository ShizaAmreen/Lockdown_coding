import java.util.Scanner;

public class Main { 

	// function to find total sub-array 
	// which start and end with same element 
	public static void cntArray(int A[], int N) 
	{ 
		// initialize result with 0 
		int result = 0; 

		for (int i = 0; i < N; i++) { 

			// all size 1 sub-array 
			// is part of our result 
			result++; 

			// element at current index 
			int current_value = A[i]; 

			for (int j = i + 1; j < N; j++) { 

				// Check if A[j] = A[i] 
				// increase result by 1 
				if (A[j] == current_value) { 
					result++; 
				} 
			} 
		} 

		// print the result 
		System.out.println(result); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int[] A = { 1, 2, 1, 5, 2 }; 
		int N = A.length; 
		cntArray(A, N); 
	} 
}

    public static void cntArray(int A[], int N) 
    { 

        int result = 0; 

        for (int i = 0; i < N; i++) { 

            result++; 

            int current_value = A[i]; 

            for (int j = i + 1; j < N; j++) { 

                if (A[j] == current_value) { 
                    result++; 
                } 
            } 
        } 
        System.out.println("output is:"+result); 
    } 

    public static void main(String[] args) 
    { 
	Scanner sc= new Scanner(System.in);
 	System.out.println("Enter the length of array");
        int length=sc.nextInt();
        int [] A=new int[length];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<length;i++)
         A[i]=sc.nextInt();
        cntArray(A, length); 
    } 
} 
