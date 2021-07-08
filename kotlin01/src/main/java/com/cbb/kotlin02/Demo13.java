package com.cbb.kotlin02;

import java.util.Random;

public class Demo13 {

    public static void main(String[] args) {
        //匿名内部类
        showOnBoard("牙膏", new DiscountWords() {
            @Override
            public String getDiscountWords(String goodsName, int hour) {
                int year = 2029;
                return year+"年,双11"+goodsName+"大促销，剩余"+hour+"小时";
            }
        });
    }

    public interface DiscountWords{
        String getDiscountWords(String goodsName,int hour);
    }

    public static void showOnBoard(String goodsName,DiscountWords discountWords){
        int hour = new Random().nextInt(24);
        System.out.println(discountWords.getDiscountWords(goodsName,hour));
    }
}
