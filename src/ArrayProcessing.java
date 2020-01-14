import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing
{
    public static void main(String[] args)
    {
        //create integer array
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println();

        //static initialization
        // int[] brr={10,20,30,40,50};
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;
        arr[4]=14;
        arr[5]=15;
        arr[6]=16;
        arr[7]=17;
        arr[8]=18;
        arr[9]=19;

        //print the static initialized array
        System.out.println("printing the static initialized array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println();

        //command line initialization
        for(int i=0;i<args.length && i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }

        //print the command line initialized array
        System.out.println("printing the command line initialized array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println();

        //initialization from user input by using Scanner Class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //print the user input initialized array
        System.out.println("printing the user input initialized array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(",");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //sum and average of all elements
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
        double avg=(double)sum/arr.length;
        System.out.println("Average is "+avg);
    }
}
