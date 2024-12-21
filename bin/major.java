import java.util.Scanner;


public class major {
    public static void main(String[] args) {
       String var = "62792057696c6c69616d2077616e67";//hex translate it!
       String NUM[] = {"1","2","3","4"};
       String check = "I1I2I3I4A1A2A3A4C1C2C3C4";
       String CS = "Computer Science ";
       String AC = "Accounting ";
       String IM = "Information Management ";
       String grade[] = {"freshman", "sophomore", "junior","senior"};
       Scanner scanner = new Scanner(System.in);
       System.err.print( "ENTER TWO CHARACTERS :  ");
       String input = scanner.nextLine();

      if(check.indexOf(input)==-1){
        System.out.println("invalid input + var");
        System.exit(0);
      }


      
       if(input.indexOf("I")!=-1){
        System.out.print(IM+var) ;
       }
      else if(input.indexOf("A")!=-1){
        System.err.print(AC);
      }
      else if(input.indexOf("C")!=-1){
        System.err.print(CS);
      }
      if(input.indexOf(NUM[0])!=-1){
        System.err.print(grade[0]);
      }
      else if(input.indexOf(NUM[1])!=-1){
        System.err.print(grade[1]);
      }
      else if(input.indexOf(NUM[2])!=-1){
        System.err.print(grade[2]);
      }
      else if(input.indexOf(NUM[3])!=-1){
        System.err.print(grade[3]);
      }
      

      scanner.close();
    }
  }
