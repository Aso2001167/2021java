package Main;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        System.out.println("戦艦ゲーム");

        Scanner scanner = new Scanner(System.in);
        System.out.println("爆弾のX座標を入力して下さい(1-5)");
        int x = scanner.nextInt();
        System.out.println("爆弾のY座標を入力して下さい(1-5)");
        int y = scanner.nextInt();
    }
}