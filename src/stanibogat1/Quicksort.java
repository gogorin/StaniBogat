package stanibogat1;

public class Quicksort 
{
    public int sort(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <high; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = swap;
        return (i+1);
    }
}
