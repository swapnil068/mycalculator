package com.example.mycalculator;

import android.os.Parcel;
import android.os.Parcelable;

public  class History implements Parcelable {
     String tvh1;
     Double tvh2;

    public History(String tvh1,Double tvh2){
        this.tvh1=tvh1;
        this.tvh2=tvh2;

    }

    protected History(Parcel in) {
        tvh1 = in.readString();
        if (in.readByte() == 0) {
            tvh2 = null;
        } else {
            tvh2 = in.readDouble();
        }
    }

    public static final Creator<History> CREATOR = new Creator<History>() {
        @Override
        public History createFromParcel(Parcel in) {
            return new History(in);
        }

        @Override
        public History[] newArray(int size) {
            return new History[size];
        }
    };

    public String getTvh1() {
        return tvh1;
    }

    public void setTvh1(String tvh1) {
        this.tvh1 = tvh1;
    }

    public Double getTvh2() {
        return tvh2;
    }

    public void setTvh2(Double tvh2) {

        this.tvh2 = tvh2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tvh1);
        if (tvh2 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(tvh2);
        }
    }
}