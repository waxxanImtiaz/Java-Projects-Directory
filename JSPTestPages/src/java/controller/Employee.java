/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


public class Employee implements java.io.Serializable {
    private String name;
    private int id;
    private String sId;
    private String age;
    public Employee(){}
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge( String age )
    {
        this.age = age;
    }
    public String getAge()
    {
        return age;
    }
    
    public void setId(String sId)
    {
        this.sId = sId;
    }
    public String getId()
    {
        return sId;
    }
    public String getName()
    {
        return name;
    }
    public void setId( int id )
    {
        this.id = id;
    }
    public int getIntId()
    {
        return id;
    }
    
    
}
