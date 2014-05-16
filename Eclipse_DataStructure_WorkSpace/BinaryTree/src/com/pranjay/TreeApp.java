package com.pranjay;

class TreeApp
{
public static void main(String[] args)
{
Tree theTree = new Tree(); // make a tree
theTree.insert(50, 1.5); // insert 3 nodes
theTree.insert(25, 1.7);
theTree.insert(75, 1.9);
theTree.insert(23, 1.9);
theTree.insert(35, 1.9);
theTree.insert(343, 1.9);
theTree.insert(250, 1.9);
theTree.insert(200, 1.9);
theTree.inOrder(null);
Node found = theTree.find(25); // find node with key 25
if(found != null)
	System.out.println("Found the node with key 25");
	else
	System.out.println("Could not find node with key 25");
	} // end main()
	} // end class TreeApp