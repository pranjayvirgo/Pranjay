package com.pranjay;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;


@Unfinished(value="hgha")
	public class UnfinishedDump {
		  public static void main(String[] args) {
		    Class c = UnfinishedDump.class;
		    System.out.println("Package:");
		    dump(c.getPackage());
		    System.out.println("Class:");
		    dump(c);
		    System.out.println("Constructor:");
		    dump(c.getConstructors());
		    System.out.println("Methods:");
		    dump(c.getMethods());
		  }
@Unfinished(value="vhvgv",owners="bbbnbnb")
		  public static void dump(AnnotatedElement[] elts) {
		    for(AnnotatedElement e : elts) { dump(e); }
		  }

		  // Written specifically for Unfinished annotation type
		  public static void dump(AnnotatedElement e) {
		    if (e == null ||
		       !e.isAnnotationPresent(Unfinished.class)) {
		      return;
		    }
		    Unfinished u = e.getAnnotation(Unfinished.class);
		    String desc = u.value();
		    Unfinished.Priority prio = u.priority();
		    String[] owner = u.owners();
		    System.out.println("  " + desc + "; prio: " + prio +
		      "; owner: " + Arrays.asList(owner));
		  }
		}

