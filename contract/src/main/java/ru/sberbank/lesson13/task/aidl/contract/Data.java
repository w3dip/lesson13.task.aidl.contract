package ru.sberbank.lesson13.task.aidl.contract;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {

    private String value;

    public Data(String value) {
        this.value = value;
    }

    private Data(Parcel in) {
        value = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(value);
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value='" + value + '\'' +
                '}';
    }
}
