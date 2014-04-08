package generics;

import java.util.Iterator;
import java.util.List;

public class Inserter {
public void insert(List list){
list.add(new String("pranjay"));
System.out.println(list);
System.out.println(list.get(2));
}

}