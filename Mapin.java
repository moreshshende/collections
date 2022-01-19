import java.util.*;

class Mapin{
  public static void main(String[] args)
  {
    String[] arr={"a","b","c","c","a"};
    Map<String,Integer> map=new TreeMap<>();
    for(int i=0;i<arr.length;i++)
    {
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i],map.get(arr[i])+1);
        
      }
      else
      {
        map.put(arr[i],1);
      }
    }
       
       Set<Map.Entry<String,Integer>> data=map.entrySet();
       for(Map.Entry<String,Integer> m :data)
  
    {
      // System.out.println(m.getKey()+" "+m.getValue());
      if(m.getValue()>1)
      {
        System.out.print(m.getKey() +" ");
      }
    }
  }
}