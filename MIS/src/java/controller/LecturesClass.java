
package controller;


public class LecturesClass implements java.io.Serializable {
    
    private Database db;
    private PersonalInfo pInfo;
    
    public LecturesClass( Database db,PersonalInfo pInfo )
    {
        this.pInfo = pInfo;
        this.db = db;
    }
    
    
}
