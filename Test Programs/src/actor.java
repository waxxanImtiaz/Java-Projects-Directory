public class actor {

    private String name;
    private String address;
    private int age;


public actor(String name, String address, int age) {

    this.name = name;
    this.address = address;
    this.age = age;


}


public void setName (String name) {

    this.name = name;

}


public void setAddress (String address) {

    this.address = address;
}


public void setAge (int age) {

    this.age = age;

}

public void setFilm () {


}

public String getName () {
    return name;

}

public String getAddress () {
    return address;

}
@Override

public String toString (){

        return name+" who's "+age+" and lives in "+address;


}


public void print (){
    //String a = toString();
    System.out.println(this);

}

public static void main( String[] args )
{
    actor a = new actor( "xyz","abc",20 );
    a.print();
}
}