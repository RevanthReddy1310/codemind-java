import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i=a;i>0;i--)
        {
             b = b + i;
        }
        System.out.println(b);
    }
}