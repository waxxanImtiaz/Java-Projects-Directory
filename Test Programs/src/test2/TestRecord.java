
package test2;

public class TestRecord {
    public static void main( String[] args )
    {
        RecordInput ri = new RecordInput();
        
        ri.openFile( "b.txt" );
        ri.addRecord();
        ri.closeFile();
    }
}
