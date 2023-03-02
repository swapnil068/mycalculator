package com.example.mycalculator;

public class Vertical {
    private String tv1;
    private String tv2;
    private String tv3;
    private String tv4;
    private String tv5;
    private int image;

    public Vertical(String tv1, String tv2, String tv3, String tv4, String tv5, int image) {

        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.tv5 = tv5;
        this.image = image;

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

    public String getTv4() {
        return tv4;
    }

    public void setTv4(String tv4) {
        this.tv4 = tv4;
    }

    public String getTv5() {
        return tv5;
    }

    public void setTv5(String tv5) {
        this.tv5 = tv5;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
