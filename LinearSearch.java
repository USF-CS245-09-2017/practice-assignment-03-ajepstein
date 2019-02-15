/**
Adam Epstein
2/14/19
This programs linearly searches for a target value in an array
 */

public class LinearSearch implements Practice03Search {

    public int search(int[] myArray, int target)
    {
        for (int i = 0; i < myArray.length; i ++)
        {
            if (myArray[i] == target)
            {
                return i;
            }
        }
        return -1; // if target not found

    }

    public String searchName()
    {
        return "Linear Search";
    }
}