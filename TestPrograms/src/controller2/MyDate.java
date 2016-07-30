/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller2;


import java.io.*;


public class MyDate {
    public static void main( String[] args )
    throws IOException
    {
        int[] day = { 1,2,3,4,5,6,7,8,9,10 };
        String[] month = { "jan","feb","march","apr","may","june","july","aug","oct","sep" };
        int year = 2015;
        
        String fileName = "date.txt";
        String dirName = "E:/imtiaz/";
        File dir = new File( dirName );
        
        File file = new File( dir,fileName );
        
        file.createNewFile();
        
        PrintWriter output = new PrintWriter( new BufferedWriter(new FileWriter( file )));
        
        for( int i = 0; i< day.length; i++ )
        {
            if( i == 0 ){
            output.write(day[i]+"st "+month[i]+" 2015 ");
            }else
                if( i==1 )
                {
                   output.write(day[i]+"nd "+month[i]+" 2015 "); 
                }
                else if( i == 2 )
                {
                    output.write(day[i]+"rd "+month[i]+" 2015 ");
                }
            else
                {
                    output.write(day[i]+"th "+month[i]+" 2015 ");
                }
            output.write("\n");
        }
        output.close();
    }
}

