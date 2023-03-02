package com.example.mycalculator;

public class Food {
    private String tv1;
    private String tv2;
    private String tv3;
    private int iv1;

    public Food(String tv1, String tv2, String tv3, int iv1) {
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.iv1 = iv1;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public String getTv3() {
        return tv3;
    }

    public void setTv3(String tv3) {
        this.tv3 = tv3;
    }

    public int getIv1() {
        return iv1;
    }

    public void setIv1(int iv1) {
        this.iv1 = iv1;
    }
}



