import java.util.Scanner;

class example
{
    static int maximum_index(int a[])
    {
        int maximum,index=0,i=1;
        maximum=a[0];
        while(i<a.length)
        {
            if(maximum<a[i])
            {
                maximum=a[i];
                index=i;
            }
            i++;
        }
        return index;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int a[]=new int[size];
        int i=0;
        while(i<a.length) {
            a[i++]=in.nextInt();
        }
        int index=example.maximum_index(a);
        System.out.println(index);
    }
}
