import java.util.ArrayList;
  public class bubbleSort {
    public static ArrayList populate( int size, int lo, int hi )
       {ArrayList<Integer> retAL = new ArrayList<Integer>();
         while( size > 0 ) {
   	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
   	    size--;}
   	return retAL;}

       //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al )
       {  	int randomIndex;
           for( int i = al.size()-1; i > 0; i-- ) {
   	           randomIndex = (int)( (i+1) * Math.random() );
   	           al.set( i, al.set( randomIndex, al.get(i) ) );}}

    public static void bubbleSortV( ArrayList<Comparable> data ) {
      boolean swaps=true;
      while (swaps) {
      swaps=false;
      for ( int i = 0; i < data.size() - 1; i++ ) {
        if ( data.get(i).compareTo( data.get(i+1) ) > 0 ) {
           		data.set(i,  data.set(i + 1, data.get(i)));
              swaps=true;}
            }
          }
        }

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
        ArrayList<Comparable> data = new ArrayList<Comparable>();
        for (Comparable i : input)
            data.add(i);
        bubbleSortV( data );
        return data;
    }//end bubbleSort -- O(n^2)

//  Best Case: n Average Case: n 2 Worst Case: n 2

public static void main(String[] args){
  /*	ArrayList glen = new ArrayList<Integer>();
  	glen.add(7);
  	glen.add(1);
  	glen.add(5);
  	glen.add(12);
  	glen.add(3);
  	System.out.println( "ArrayList glen before sorting:\n" + glen );
  	bubbleSortV(glen);
  	System.out.println( "ArrayList glen after sorting:\n" + glen );

  	ArrayList coco = populate( 10, 1, 1000 );
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	bubbleSortV(coco);
  	System.out.println( "ArrayList coco after sorting:\n" + coco );*/


      	ArrayList glen = new ArrayList<Integer>();
  	glen.add(7);
  	glen.add(1);
  	glen.add(5);
  	glen.add(12);
  	glen.add(3);
  	System.out.println( "ArrayList glen before sorting:\n" + glen );
  	ArrayList glenSorted = bubbleSort( glen );
  	System.out.println( "sorted version of ArrayList glen:\n"
  			    + glenSorted );
  	System.out.println( "ArrayList glen after sorting:\n" + glen );

        	ArrayList coco = populate( 10, 1, 1000 );
  	System.out.println( "ArrayList coco before sorting:\n" + coco );
  	ArrayList cocoSorted = bubbleSort( coco );
  	System.out.println( "sorted version of ArrayList coco:\n"
  			    + cocoSorted );
  	System.out.println( "ArrayList coco after sorting:\n" + coco );
  	System.out.println( coco );

}
}


//
