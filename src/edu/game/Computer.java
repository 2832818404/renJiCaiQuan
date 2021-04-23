package edu.game;

import java.util.Scanner;

/**
 * @author hongxiaozheng
 * @date 2021/4/14 22:16
 */
public class Computer {
    public String name;// 电脑名字
    public int points;//   胜利次数
    public String quan;// 出的拳


    //选择电脑角色
    public void giveName() {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean flag = true;// 循环判断条件
        do {
            System.out.println("请选择对方角色（1.葫芦娃 2.哆啦A梦 3.瑞克·桑切斯）");
            num = scanner.nextInt();
            if ( num == 1 ) {
                name = "葫芦娃";
                flag = false;
            }else if ( num == 2 ) {
                name = "哆啦A梦";
                flag = false;
            }else if ( num == 3 ) {
                name = "瑞克·桑切斯";
                flag = false;
            }else {
                System.out.println("输入的值不合法，请重新输入");
                flag = true;
            }
        }while ( flag );
    }


    //电脑的随机出拳
    public void chuquan() {
        int num = (int)(Math.random()*3)+1;//在1-3之间随机选择
        if ( num == 1 ) {
            quan = "剪刀";
        }else if ( num == 2 ) {
            quan = "石头";
        }else if ( num == 3 ) {
            quan = "布";
        }
    }
}
