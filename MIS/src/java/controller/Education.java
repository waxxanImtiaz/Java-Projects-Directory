
package controller;


public class Education implements java.io.Serializable {
    private String matriculation;
    private String intermediate;
    private String graduation;
    
    public void setMatriculation( String matriculation )
    {
        this.matriculation = matriculation;
    }
    public String getMatriculation() {
        return matriculation;
    }
    public void setIntermediate( String intermediate )
    {
        this.intermediate = intermediate;
    }
    public String getIntermediate()
    {
        return intermediate;
    }
    public void setGraduation( String graduation )
    {
        this.graduation = graduation;
    }
    public String getGraduation()
    {
        return graduation;
    }
}
