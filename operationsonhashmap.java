import java.util.*;
public class operationsonhashmap {
    public static void main(String args[])
    {
            HashMap<String,String> a=new HashMap<>();
            a.put("SNO","01");
            a.put("SNAME","Muraja");
            a.put("City","Chennai");
            System.out.println(a);
            //modifying value for a key
            a.put("SNO","90");
            System.out.println(a);
            //removing key in a hashmap
            a.remove("SNAME");
            System.out.println(a);
            a.clear();
            System.out.println(a);
        }  
    
}
