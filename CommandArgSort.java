// Question 1.2
class CommandArgSort
{
    static void sort(int[] arr)
    {
        int temp;
        int n = arr.length;
        for(int i =0;i< n;i++)
        {
            for(int j = 1; j<(n-i);j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void display(int[] arr)
    {
        for(int i = 0;i<arr.length;i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = new int[args.length];
        for(int i = 0; i<args.length;i++) arr[i] = Integer.parseInt(args[i]);
        sort(arr);
        System.out.print("Sorted stuff:");
        display(arr);

    }
}

