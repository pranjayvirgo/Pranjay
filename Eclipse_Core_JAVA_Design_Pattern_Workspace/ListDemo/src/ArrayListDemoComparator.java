import java.util.Comparator;


public class ArrayListDemoComparator implements Comparator<ArrayListDemoComparatorProperty>{

	@Override
	public int compare(ArrayListDemoComparatorProperty a1,ArrayListDemoComparatorProperty a2) {
		// TODO Auto-generated method stub
		return new Integer(a1.getAge()).compareTo(a2.getAge());
	}

}
