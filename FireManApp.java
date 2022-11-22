import java.util.*;

public class FireManApp {
   public static void main(String[] args) {
    System.out.println("ファイアーマンを作成します。");
    System.out.print("名前を入力して下さい>>");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.print("年齢を入力してください。>>");
    int age=sc.nextInt();
    System.out.print("マッチの銘柄を入力してください。>>");
    String brand=sc.next();
    System.out.print("何に火をつけますか>>");
    String obj=sc.next();
    System.out.print("何回火をつけますか>>");
    int num=sc.nextInt();
   
        for(int i=0;i<num;i++){
            System.out.printf("%sは%sに%sで火をつけた%n",name,obj,brand);
        }
            if(num>=5){
                System.out.printf("%sを完全に燃やし尽くした",obj);
            }
        

    }
} 


