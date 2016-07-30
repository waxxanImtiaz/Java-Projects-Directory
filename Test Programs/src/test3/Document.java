
package test3;


public class Document {
    private String text;
    
    public static void main( String[] args )
    {
            Document d = new Document( "He was visiting th"
                    + "e United States when Adolf Hitler came to power in "
                    + "1933 and, being Jewish, did not go back to Germa  ny,"
                    + " where he had been a professor at the Berlin Academy of Sciences. "
                    + "He settled in the U.S., becoming an American citizen in 1940."
                    + " On the eve of World War II, he endorsed a "
                    + "letter to President Franklin D. Roosevelt"
                    + " alerting him to the potential development "
                    + "of \"extremely powerful bombs of a new type\" and recommending that "
                    + "the U.S. begin similar research. This eventually led to "
                    + "what would become the Manhattan ");
            System.out.print(d);
            
    }
    public Document( String text ){
        if( text.equals("") ){
            System.out.println("String is empty");
        }else{
            this.text = text;
        }
    }//constructor.
    @Override
    public String toString(){
        
        String extract = "";
        int len = text.length();
        
        if( len <50 )
        {
           return text.concat("\n");
           
        }
        else{
            int prev = 0,next = 50;
             
            while( next<text.length())
            {
                    if(text.charAt(next) == ' ' )
                        extract = extract.concat(text.substring(prev,next) ).concat("\n");
                    else{
                        while( text.charAt(next) != ' ' ){
                            next++;
                        }
                        extract = extract.concat(text.substring(prev,next) ).concat("\n");
                    }
                    prev = next;
                next+=50;
            }
            extract = extract.concat(text.substring(next-50,text.length()) ).concat("\n");
            
            
            return extract;
        }
        
    }
}
