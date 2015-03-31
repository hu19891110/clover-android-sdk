/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.merchant;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum OrderTitle implements Parcelable {
  NONE, MANUAL, AUTOMATIC;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<OrderTitle> CREATOR = new Creator<OrderTitle>() {
    @Override
    public OrderTitle createFromParcel(final Parcel source) {
      return OrderTitle.valueOf(source.readString());
    }

    @Override
    public OrderTitle[] newArray(final int size) {
      return new OrderTitle[size];
    }
  };
}