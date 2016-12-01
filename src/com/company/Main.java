package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(centimetreToMetre(157));
        System.out.println(centimetreToMetre(163));

        System.out.println(minuteTosecond(3));

        System.out.println(hourToMinute(2));

        //順番に注意！下のメソッドの順番と揃える！
        System.out.println(calcBMI(1.6,45));
    }

    public static double centimetreToMetre(double cm){
        double m = cm / 100;
        //返り値　return + イコールなしでそのまま変数名とか計算とか書く
        return m;
    }

    public static double minuteTosecond(double minute){
        //centimetreToMetreみたいに２つに分けるより、そのままreturnに入れる方がすっきり！
        return minute * 60;
    }

    public static double hourToMinute(double hour){
        return hour * 60;
    }

    //メソッド名は動詞 + 名詞ってパターンが多い
    //引数が複数の時は、一つずつ型を書く
    public static double calcBMI(double height,double weight){
        return weight / (height * height);
    }
}
