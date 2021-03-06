

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SortEmployee model class
 * 
 * @author Hamid_Narimani
 * Ref: -http://viralpatel.net/blogs/java-tip-how-to-sort-array-in-java-java-util-arrays/
 *      -http://www.javacodegeeks.com/2013/04/arrays-sort-versus-arrays-parallelsort.html
 *      -http://stackoverflow.com/questions/8938235/java-sort-an-array
 */

public class SortEmployee implements Comparator {
	public int sortId;

	public SortEmployee(int sortId) {
		this.sortId = sortId;
	}

	@Override
	public int compare(Object a1, Object a2) {
		Employee o1 = (Employee) a1;
		Employee o2 = (Employee) a2;
		try {

			if (sortId == 3) {
				return Integer.parseInt(o1.getEmployeeID())
						- Integer.parseInt(o2.getEmployeeID());
			} else
				return 0;
		} catch (Exception ex) {

		}
		return 0;

	}

	public List sort(List listEmp) {

		Collections.sort(listEmp, new SortEmployee(sortId));
		return listEmp;

	}

}
