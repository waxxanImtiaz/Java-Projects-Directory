try{
            StringBuilder s = new StringBuilder();
            r = new BufferedReader(new FileReader(path));
            
            String line=null;
            while ((line = r.readLine()) != null) {
                if(line.contains("//")==true){
                    output.insert("Invalid Token   ::        "+line, caret);
                output.insert("\n",caret);
                }else if(line.contains("/*") == true){
                    s.append(line+"\n");
                    while((line=r.readLine()) !=null){
                        s.append("\n"+line);
                        if(line.contains("*/")){
                            output.insert("Invalid Token   ::        "+s.toString(), caret);
        


import java.util.scanner;
import java.util.*;
int main(){
  int i=10;
  int j=100;
  100+90;
  int j=19-9;
  String s="pakistan";
  for(int i=0;i<10;i++){
System.out.println(i);
}
if();
while(i!=10){
System.out.println(i);
}
this is 
// no 
++
---
if()
	
 while ((line = br.readLine()) != null) {
                   StringTokenizer st = new StringTokenizer(line, "[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLPOIYQAZXVDBSME =-+++--';().*{}[],!@#$%^&/]", true);
               
                
                
              
                String str = st.nextToken();
                          
                  while(st.hasMoreTokens()){
                      
                       
                  
                      switch(st.nextToken()){ 
                      case "++":
                  jTextArea1.insert("++"+" "+":Unary Operator "+"\n",caret);
                              break;
                              case "--":
                  jTextArea1.insert("--"+" "+":Unary Operator "+"\n",caret);
                                  break;
                                  case "!":
                  jTextArea1.insert("!"+" "+":Unary Operator "+"\n",caret);
                                      break;
                                      case "+":
                  jTextArea1.insert("+"+" "+":Airthmatic Operator "+"\n",caret);
                                          break;
                                    case "-":
                  jTextArea1.insert("-"+" "+":Airthmatic Operator "+"\n",caret);
                                        break;
                                        case "*":
                  jTextArea1.insert("*"+" "+":Airthmatic Operator "+"\n",caret);
                                          break;
                                    case "/":
                  jTextArea1.insert("/"+" "+":Airthmatic Operator "+"\n",caret);
                                        break;
                                        case "%":
                  jTextArea1.insert("%"+" "+":Airthmatic Operator "+"\n",caret);
                                        break;
                                            case "<<":
                  jTextArea1.insert("<<"+" "+":Rational Operator "+"\n",caret);
                                          break;
                                    case ">>":
                  jTextArea1.insert(">>"+" "+":Rational Operator "+"\n",caret);
                                        break;
                                       
                                            case "=":
           