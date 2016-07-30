
package test2;


public class MainMethod {
    public static void main( String[] args )
    {
        
        
        //write file
//        RecordInput ri = new RecordInput();
//        
//        ri.openFile( "b.txt" );
//        ri.addRecord();
//        ri.closeFile();
        
                //read file
        ReadRecord2 r = new ReadRecord2();
        
        r.openFile( "b.txt" );
        r.readRecord();
        r.closeFile();
    }
}
