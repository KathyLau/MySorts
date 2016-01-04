/*======================================
  class SelectionSort -- implements SelectionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class bogoSort  {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;}
	return retAL;}

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	          randomIndex = (int)( (i+1) * Math.random() );
	          al.set( i, al.set( randomIndex, al.get(i) ) );}}
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static boolean isSorted(ArrayList<Comparable> data ){
	for (int i = 1; i < data.size(); i++){
    if ( data.get(i).compareTo(data.get(i-1)) < 0 )
    return false;}
	return true;}

    public static void bogoSortV( ArrayList<Comparable> data )
    {  int i ;
      for ( i = 1; !isSorted(data); i++){
        shuffle(data);}
      System.out.println("number of tries: " + i);}

    public static ArrayList<Comparable> bogoSort( ArrayList<Comparable> input )
    {
      ArrayList<Comparable> newArray = new ArrayList<Comparable>();
            for (Comparable i : input)
                newArray.add(i);
            bogoSortV( newArray );
            return newArray;
    }//end selectionSort -- O(n^2)


    //main method for testing
    public static void main( String [] args ) {

	/*============================================
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  ============================================*/

	/*===============for VOID methods=============
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	/*==========for AL-returning methods==========
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n"
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n"
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	  ============================================*/

    }//end main

}//end class SelectionSort
