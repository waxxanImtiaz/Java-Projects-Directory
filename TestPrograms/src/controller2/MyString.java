package controller2;

public class MyString {
        public static void main( String[] args )
        {
            String[] array = {"ayaz","zeeshan","sabir","kamran","rehman"};
            
            String test;
            show("Before sorting array is ",array);
            for( int i = 0; i<array.length; i++  )
            {
                for( int j = 0; j<array.length; j++ )
                {
                if( array[i].compareTo(array[j]) < 0 )
                    {
                     test = array[ i ];
                     array[ i ] = array[ j ];
                     array  [ j ] = test;
                    }
                }
            }//end of for
            
            show( "after sorting array is ",array );
        }
        public static void show( String message, String[] arr )
        {
            System.out.println(message+"\n");
            for( String temp: arr )
            {
                System.out.println(temp);
            }
       }
}
