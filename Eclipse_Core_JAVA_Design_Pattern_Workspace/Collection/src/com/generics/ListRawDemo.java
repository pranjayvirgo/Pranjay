package com.generics;

import java.util.ArrayList;
import java.util.List;

public class ListRawDemo {
public static void unsafeAdd(List<?> list,Object o){
list.add(o);
}
public static void main(String []args){
List<String> strings=new ArrayList<String>();
unsafeAdd(strings,new Integer(1));
String s=strings.get(0);
}
}
