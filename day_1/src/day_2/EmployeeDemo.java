/*
package day_2;
//import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		//int m1 = 100;
		Employee e1 = new Employee();// object 1
		Employee e2 = new Employee();// object 2
		Employee e3 = new Employee();// object 3
	//	
		e1.eid = 101;
		e1.ename = "Vasan";
		e1.ecity = "Cuddalore";
		
		eid = 102;
		e2.ename = "Keerthi";
		e2.ecity = "Cuddalore";
		
		e3.eid = 103;
		e3.ename = "Jo";
		e3.ecity = "Pondy";
		
		System.out.println("Employee One detail: EID - "+e1.eid+ " ,Employee Name - "+e1.ename+" , Employee City -"+e1.ecity);
		System.out.println("Employee Two detail: EID - "+e2.eid+ " ,Employee Name - "+e2.ename+" , Employee City -"+e2.ecity);
		System.out.println("Employee Three detail: EID - "+e3.eid+ " ,Employee Name - "+e3.ename+" , Employee City -"+e3.ecity);
	//
	e1.setEid(101);
	e1.setEname("Vasan");
	e1.setEcity("Cuddalore");
	System.out.println("Employee Details: Id - "+e1.getEid()+" ,Name - "+e1.getEname()+" ,City - "+e1.getEcity());
	e2.setEid(102);
	e2.setEname("Keerthi");
	e2.setEcity("Cuddalore");
	System.out.println("Employee Details: Id - "+e2.getEid()+" ,Name - "+e2.getEname()+" ,City - "+e2.getEcity());
	e3.setEid(103);
	e3.setEname("Jo");
	e3.setEcity("Pondy");
	System.out.println("Employee Details: Id - "+e3.getEid()+" ,Name - "+e3.getEname()+" ,City - "+e3.getEcity());
	}

}
*/
// String to string method

package day_2;
//import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		//int m1 = 100;
		Employee e1 = new Employee();// object 1
		Employee e2 = new Employee();// object 2
		Employee e3 = new Employee();// object 3
		e1.setEid(101);
		e1.setEname("Vasan");
		e1.setEcity("Cuddalore");
		System.out.println(e1);
		e2.setEid(102);
		e2.setEname("Keerthi");
		e2.setEcity("Cuddalore");
		System.out.println(e2);
		e3.setEid(103);
		e3.setEname("Jo");
		e3.setEcity("Pondy");
		System.out.println(e3);
		}

	}
