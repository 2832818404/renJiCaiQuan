package edu.game;

import java.util.Scanner;

/**
 * @author wangyibo
 * @date 2021/4/14 22:16
 */
public class User {

    public String name;// 名字
    public int count;// 次数
    public String quan;// 出的拳
    public int points;// 得分

    // 获取用户名字
    public void giveName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名；");
        String mingzi = scanner.next();
        name = mingzi;
    }
    // 用户出的拳传入quan属性
    public void chuquan() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int num;
        do {
            System.out.println("请出拳：1.剪刀 2.石头 3.布（请输入相应数字）");
            num = scanner.nextInt();
            if ( num == 1 ) {
                quan = "剪刀";
                flag = false;
            }else if ( num == 2 ) {
                quan = "石头";
                flag = false;
            }else if ( num == 3 ) {
                quan = "布";
                flag = false;
            }else {
                System.out.println("输入的值不合法，请重新输入");
                flag = true;
            }
        }while ( flag );
    }
}
