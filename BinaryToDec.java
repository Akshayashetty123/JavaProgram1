import java.util.Scanner;
public class BinaryToDec{
  public static void main(String[] args){
    System.out.println("Enter a Number");
    Scanner sc=new Scanner(System.in);
    int bin=sc.nextInt();
    int temp=bin;
    int count=0;
    double sum=0;
    while(bin!=0){
      int d=bin%10;
      if(d>1){
        count=-1;
        break;
      }
      count++;
      sum=sum+(d*Math.pow(2,count));
      bin=bin/10;
    }
    if(count==-1)
      System.out.println(temp+" is not a binary number");
    else
      System.out.println((int)sum/2);
    sc.close();
  }
}
