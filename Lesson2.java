import java.io.BufferedReader;
import java.io.*;
public class Lesson2 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // System.out.println("あなたは何歳ですか？");
    // String str = br.readLine();
    // int num = Integer.parseInt(str);
    // System.out.println(num);
    // System.out.println("あなたは"+num+"歳です");
    // System.out.println("円周率の値はいくつですか？");
    // String str = br.readLine();
    // double num = Double.parseDouble(str);
    // System.out.println(num);
    // System.out.println("身長と体重を入力してください？");
    // String str1 = br.readLine();
    // String str2 = br.readLine();
    // double num1 = Double.parseDouble(str1);
    // double num2 = Double.parseDouble(str2);
    // System.out.println("身長は"+num1+"センチです");
    // System.out.println("体重は"+num2+"キロです");
    // System.out.println(0-4);
    // System.out.println(3.14*2);
    // System.out.println(5/3);
    // System.out.println(30%7);
    // System.out.println((7+32)/5);
    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);
    int num3 = Integer.parseInt(str3);
    int num4 = Integer.parseInt(str4);
    int num5 = Integer.parseInt(str5);
    int ans = num1+num2+num3+num4+num5;
    System.out.println(ans);
    double aves = (double)ans/5;
    System.out.println(aves);

  }
}