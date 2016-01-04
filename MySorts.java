import java.util.ArrayList;

public class MySorts{

public static void main( String [] args ) {
    ArrayList glen = bubbleSort.populate( 10, 1, 1000 );
    	System.out.println( "ArrayList glen before sorting:\n" + glen );
    	ArrayList glenSorted = bubbleSort.bubbleSort( glen );
    	System.out.println( "sorted version of ArrayList glen:\n"
    			    + glenSorted );
    //	System.out.println( "ArrayList glen after sorting:\n" + glen );
}//end main

}//end class SelectionSort

/*
ArrayList coco = populate( 10, 1, 1000 );
System.out.println( "ArrayList coco before sorting:\n" + coco );
ArrayList cocoSorted = selectionSort( coco );
System.out.println( "sorted version of ArrayList coco:\n"
+ cocoSorted );
System.out.println( "ArrayList coco after sorting:\n" + coco );
System.out.println( coco );

ArrayList bogo = populate( 10, 1, 1000 );
System.out.println( "ArrayList bogo before sorting:\n" + bogo );
ArrayList bogoSorted = selectionSort( bogo );
System.out.println( "sorted version of ArrayList bogo:\n"
+ bogoSorted );
System.out.println( "ArrayList bogo after sorting:\n" + bogo );
System.out.println( bogo );*/

/*
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
          al.set( i, al.set( randomIndex, al.get(i) ) );}}*/
