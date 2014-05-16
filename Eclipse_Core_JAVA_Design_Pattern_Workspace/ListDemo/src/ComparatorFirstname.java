import java.util.Comparator;


public class ComparatorFirstname implements Comparator<ArrayListDemoComparatorProperty>{
	@Override
	public int compare(ArrayListDemoComparatorProperty a1,ArrayListDemoComparatorProperty a2) {
		// TODO Auto-generated method stub
		return a1.getFirstName().compareTo(a2.getFirstName());
	}
}
