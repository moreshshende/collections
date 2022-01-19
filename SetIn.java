import java.util.Set;
import java.util.*;

public class SetIn {
    public static void main(String[] args) {
         
           
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int array[]= new int[n];

         for(int i=0; i<n;i++)
         {
             array[i]=sc.nextInt();
         }
        Set<Integer>data = new TreeSet<Integer>();

         for(int i=0; i<n; i++)
         {
             data.add(array[i]);
         }


         Iterator itr= data.iterator();

         int sum=0;


          while(itr.hasNext())
          {
              int test=(Integer) itr.next();
               if(data.contains(test))
               {
                   sum=sum+test;
               }
          }

          System.out.println(sum);
    }
}