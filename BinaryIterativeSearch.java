/**
Adam Epstein
2/14/19
This programs iteratively searches for a target value in an array
 */

public class BinaryIterativeSearch implements Practice03Search {

    public int search(int[] myArray, int target)
    {
        return search(myArray, target, 0, myArray.length - 1);
    }

    private int search(int[] myArray, int target, int start, int end) 
    {
        int start = 0;
        int end = myArray.length-1;

        while(start < end) 
        {
            int mid = (start+end)/2;
            if(myArray[mid]==target) {
                return mid;
            }

            else if (target < myArray[mid]) {
                end = mid -1;
            }

            else {
                start = mid +1;
            }
            return -1;
        }    

    }

    public String searchName()
    {
        return "Binary Iterative Search";
    }
}

