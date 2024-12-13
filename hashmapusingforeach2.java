import java.util.*;
public class hashmapusingforeach2{
public static void main(String args[])
{
  HashMap<String,String> a=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        String S=sc.next();
        String S1=sc.next();
        a.put(S,S1); 
    }
    for(String S : a.keySet())
    {
        System.out.println(S);
    }
}
}  