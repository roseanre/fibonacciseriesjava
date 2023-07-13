import java.util.*;

class Uniqueelements {
    public static void main(String[] args) {
        int arr[] = {1,3,5,1,2,5,3,4};
        int n = arr.length;
        for(int i=0;i<n;i++){ //outer loop iterates each element in the array
            boolean isUnique=true;// intiliaze the flag as true
            for(int j=0;j<n;j++){ //inner loop compares the element at each index 'i' and with the rest of the elements using j
                if( i!=j && arr[i]==arr[j]){ //element found flag is false  it breaks
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){ //if not found in the array ,print as unique element
                System.out.print(arr[i]+ " ");
            }
        }

    }
}

