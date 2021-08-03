public class ReverseArr {
    // function to reverse every sub-array
    static void reverse(String arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k)
        {
            int left = i;
            int right = Math.min(i + k - 1, n-1);
            String temp;

            // reverse the sub-array
            while (left < right)
            {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d", "e", "f"};
        int k = 2;
        int n = arr.length;
        reverse(arr, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
