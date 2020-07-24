/*
Simple program on Array List in Java
*/

#Program is Below:

package collection;
 
import java.util.ArrayList;     
import java.util.Iterator;      
 
public class ArrayList          #Class created
{
 
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();
        arrl.add("Shivanh");
        arrl.add("Gupta");
        arrl.add("UPES");
        arrl.add("Dehradun");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
			
		System.out.println("Actual ArrayList:"+al);
        ArrayList<String> copy = (ArrayList<String>) al.clone();
        System.out.println("Cloned ArrayList:"+copy);
		Collections.reverse(a1);
		System.out.println("ArrayList After Reverse :");
		System.out.println(a1);
        }
    }
}
