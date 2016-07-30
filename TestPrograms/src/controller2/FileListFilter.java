
package controller2;

import java.io.*;



public class FileListFilter implements FilenameFilter {
    public String name;
    public String extension;
    
    public FileListFilter( String name,String extension )
    {
        this.name = name;
        this.extension = extension;
    }
    
    public boolean accept( File myDir,String filename )
    {
        boolean fileOk = true;
        
        if( name != null )
            fileOk &= filename.startsWith(name);
        if( extension != null )
            fileOk &= filename.endsWith('.'+extension);
        
        return fileOk;
    }
}
