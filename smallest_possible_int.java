class Smallestposint  
{
    int findSmallest(int arr[], int n)  
    { 
        int res = 1; 
        for (int i = 0; i < n && arr[i] <= res; i++) 
            res = res + arr[i]; 
         return res; 
    } 
    public static void main(String[] args)  
    { 
        Smallestposint small = new Smallestposint(); 
        int arr[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array elements in ascending order:");
        for(int i=0;i<n;i++)
          arr[i]=s.nextInt();
        int n= arr1.length; 
        System.out.println(small.findSmallest(arr, n)); 

    } 
} 
