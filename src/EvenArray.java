import java.util.Arrays;

public class EvenArray
{
    static int[] evenArray(int[] inpArr)
    {
        int c=0;
        for(int i:inpArr)
        {
            if(i==0)
                continue;
            if(i%2==0)
            {
                //arr[c]=i;
                c++;
            }
        }
        int[] arr=new int[c];
        int p=0;
        for(int i:inpArr)
        {
            if(i==0)
                continue;
            if(i%2==0)
            {
                arr[p]=i;
                p++;
            }
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr={1,10,5,6,8,9,13,0};
        System.out.println(Arrays.toString(evenArray(arr)));
    }
}
