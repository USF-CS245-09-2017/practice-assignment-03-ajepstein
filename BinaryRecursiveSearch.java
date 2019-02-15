/**
Adam Epstein
2/14/19
This programs recursively searches for a target value in an array
 */

public class BinaryRecursiveSearch implements Practice03Search {

    public int search(int[] myArray, int target)
    {
        return search(myArray, target, 0, myArray.length-1);
    }

    private int search(int[] myArray, int target, int start, int end) {
    
        if (end < start)
        {
            return -1;
        }
        
        int mid = (start + end)/2;
        if(myArray[mid]==target) {
            return mid;
        }

        else if(target<myArray[mid]) {
            return search(myArray, target, start, mid-1);
        }

        else {
            return search(myArray, target, mid+1, end)
        }

    }

    public String searchName()
    {
        return "Binary Recursive Search";
    }
}
