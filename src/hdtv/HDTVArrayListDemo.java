/**
 * 
 */
package hdtv;

import java.util.*;  // importing the java.util package

/**
 * @author Praveen
 *
 */
class HDTV{

	/**
	 * The HDTV Brand Name
	 */
	String brandName;

	/**
	 * The HDTV Screen Size
	 */
	int screenSize;

	/**
	 * @param brandName takes brandName as parameter
	 * @return returns nothing
	 */
	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	/**
	 * @param screenSize takes screenSize as parameter
	 * @return returns nothing
	 */
	public void setScreenSize(int screenSize){
		this.screenSize = screenSize;
	}

	/**
	 * @return returns brandName 
	 */
	public String getBrandName(){
		return brandName;
	}

	/**
	 * @return returns screenSize
	 */
	public int getScreenSize(){
		return screenSize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return  "Brandname: " + brandName + ", Screen Size: " + screenSize + " inches";
	}
}

/**
 * This class is used to demostrate the sorting of HDTV objects in an ArrayList   
 *
 * @author Praveen
 */
public class HDTVArrayListDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		/* Instantiating a HDTV object through an empty constructor and initializing its instance 
		variables using setter methods */
		HDTV tv1 = new HDTV();
		tv1.setBrandName("Samsung");
		tv1.setScreenSize(55);

		/* Instantiating a HDTV object through an empty constructor and initializing its instance 
		variables using setter methods */
		HDTV tv2 = new HDTV();
		tv2.setBrandName("LG");
		tv2.setScreenSize(60);


		/* Instantiating a HDTV object through an empty constructor and initializing its instance 
		variables using setter methods */
		HDTV tv3 = new HDTV();
		tv3.setBrandName("Sony");
		tv3.setScreenSize(58);

		/* Instantiating an ArrayList object through an empty constructor */
		ArrayList<HDTV> tvList = new ArrayList<HDTV>();

		// Adding HDTV objects into the ArrayList object
		tvList.add(tv1);
		tvList.add(tv2);
		tvList.add(tv3);

		System.out.println("--------------------------------------------------");
		System.out.println("Printing the elements of the ArrayList before sorting\n");

		// Printing the elements of the array before sorting 
		for(HDTV element:tvList){
			System.out.println(element.toString());
		}

		// Sorting the elements of the ArrayList according the TVs Screen Size using Comparator Class
		tvList.sort(new TVSizeComparator());

		System.out.println("\n--------------------------------------------------");
		System.out.println("Printing the Elements of the ArrayList after sorting\n");

		// Printing the Elements of the Array after sorting
		for(HDTV element:tvList){
			System.out.println(element.toString());
		}

	}

}

/**
 * This class is used to compare the screen size of the HDTV objects by overriding compare method
 * of the Comparator class
 * @author Praveen
 *
 */
class TVSizeComparator implements Comparator<HDTV>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(HDTV  tv1, HDTV tv2) {
		if(tv1.getScreenSize() < tv2.getScreenSize()){
			return 1;
		} else {
			return -1;
		}
	}
}
