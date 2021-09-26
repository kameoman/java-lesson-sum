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
    // String str1 = br.readLine();
    // String str2 = br.readLine();
    // String str3 = br.readLine();
    // String str4 = br.readLine();
    // String str5 = br.readLine();
    // int num1 = Integer.parseInt(str1);
    // int num2 = Integer.parseInt(str2);
    // int num3 = Integer.parseInt(str3);
    // int num4 = Integer.parseInt(str4);
    // int num5 = Integer.parseInt(str5);
    // int ans = num1+num2+num3+num4+num5;
    // System.out.println(ans);
    // double aves = (double)ans/5;
    // System.out.println(aves);
    // System.out.println("整数を入力してください");
    // String str = br.readLine();
    // int num = Integer.parseInt(str);
    // System.out.println(num);
    // if (num % 2 == 0){
      //   System.out.println(num + "は偶数です");
      // }else{
        //   System.out.println(num + "は奇数です");
        // }
    // System.out.println("2つの整数を入力してください");
    // String str1 = br.readLine();
    // String str2 = br.readLine();
    // int num1 = Integer.parseInt(str1);
    // int num2 = Integer.parseInt(str2);
    // System.out.println(num1);
    // System.out.println(num2);
    // if (num1 < num2 ){
    //   System.out.println(num1 +"より"+num2+ "は大きい値です");
    // }else{
    //   System.out.println(num1 +"より"+num2+ "は小さい値です");
    // }
    // System.out.println("0～10までの整数を入力してください");
    // String str1 = br.readLine();
    // int num1 = Integer.parseInt(str1);
    // System.out.println(num1);
    // if (num1 > 0 && num1 < 10 ){
    //   System.out.println("正解です");
    // }else{
    //   System.out.println("不正解です");
    // }
    // System.out.println("1～5までの整数を入力してください");
    // String str1 = br.readLine();
    // int num1 = Integer.parseInt(str1);
    // System.out.println(num1);
    // if (num1 == 1){
    //   System.out.println("もっと頑張りましょう");
    // }else if(num1 == 2){
    //   System.out.println("もう少し頑張りましょう");
    // }else if(num1 == 3){
    //   System.out.println("さらに上を目指しましょう");
    // }else if(num1 == 4){
    //   System.out.println("大変よくできました。");
    // }else{
    //   System.out.println("大変優秀です。");
    // }
    // System.out.println("1~10まで偶数を出力します");
    // for (int i = 1;i<=10;i++){
    //   if (i % 2 == 0){
    //     System.out.println(i);
    //   }
    // }
    int num = 0;
    int sum = 0;
    do{
      String str = br.readLine();
      num = Integer.parseInt(str);
      sum += num;
    }while(num != 0);
    System.out.println(sum);
  }
}
