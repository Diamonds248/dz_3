import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double masiv[] ={12.2,-12.2,23.5,234.5,45.4,-45.8,78.8,-78.5,6.6,-67.6,3.3,-34.5,78.7,78.4,34.3};
      double summa = 0;
      int amount= 0;
      boolean isNegative=false;
      for(double elements:masiv){
          if(elements<0){
              isNegative=true;

          } else if (elements>0&&isNegative) {
            summa=elements;
            amount++;
              System.out.println(elements);

          }
      }
        System.out.println("srednee orivm: "+summa/amount);
    }
}

