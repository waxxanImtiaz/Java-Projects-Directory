
package controller;


public class OtherInfo implements java.io.Serializable {
    private String techSkils;
    private String internship;
    private String project;
    private String extraActivities;
    private String areaOfIntrest;
    private String languages;
    
    public void setTechSkils( String techSkils )
    {
        this.techSkils = techSkils;
    }
    public String getTechSkils()
    {
        return techSkils;
    }
    public void setInternship( String internship )
    {
        this.internship = internship;
    }
    public String getInternship()
    {
        return internship;
    }
    public void setProject( String project )
    {
        this.project = project;
    }
    public String getProject()
    {
        return project;
    }
    public void setExtraActivities( String extraActivities )
    {
        this.extraActivities = extraActivities;
    }
    public String getExtraActivities()
    {
        return extraActivities;
    }
    public void setAreaOfIntrest( String areaOfIntrest )
    {
        this.areaOfIntrest = areaOfIntrest;
    }
    public String getAreaOfIntrest()
    {
        return areaOfIntrest;
    }
    public void setLanguages( String languages )
    {
        this.languages = languages;
    }
    public String getLanguages()
    {
        return languages;
    }
}
