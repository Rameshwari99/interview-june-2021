package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

  
int n=1;
for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        
        
        
    
        System.out.println();   
         
            
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){   
           System.out.print(arr[i] + " ");    
        }   
}

public static void main(String[] args)
    {
        ShiftElementsInArray rotate = new ShiftElementsInArray();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.shift(arr);
        
    }
  
  

}
