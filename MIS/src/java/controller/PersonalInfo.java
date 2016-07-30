
package controller;

import java.io.*;
public class PersonalInfo implements Serializable {
    private String name;
    private String fname;
    private String id;
    private String caste;
    private String address;
    private String permAdd;
    private String gender;
    private String stContactNum;
    private String fContactNum;
    private String email;
    private String cnic;
    private String depart;
    private String batch;
    
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setfName( String fname )
    {
        this.fname = fname;
    }
    public String getfName()
    {
        return fname;
    }
    public void setId( String id )
    {
        this.id = id;
    }
    public String getId()
    {
        return id;
    }
    public void setCaste( String caste )
    {
        this.caste = caste;
    }
    public String getCaste()
    {
        return caste;
    }
    public void setAddress( String address )
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPermAdd( String permAdd )
    {
        this.permAdd = permAdd;
    }
    public String getPermAdd()
    {
        return permAdd;
    }
    public void setGender( String gender )
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }
    public void setStContactNum( String stContactNum )
    {
        this.stContactNum = stContactNum;
    }
    
    public String getStContactNum()
    {
        return stContactNum;
    }
    public void setfContactNum( String fContactNum )
    {
        this.fContactNum = fContactNum;
    }
    public String getfContactNum()
    {
        return fContactNum;
    }
    public void setEmail( String email )
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setCnic( String cnic )
    {
        this.cnic = cnic;
    }
    public String getCnic()
    {
        return cnic;
    }
    public void setDepart( String depart )
    {
        this.depart = depart;
    }
    public String getDepart()
    {
        return depart;
    }
    public void setBatch( String batch )
    {
        this.batch = batch;
    }
    public String getBatch(){
        return batch;
    }
}
