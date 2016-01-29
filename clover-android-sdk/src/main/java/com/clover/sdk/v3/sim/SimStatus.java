/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.sim;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum SimStatus implements Parcelable {
  COLD, ACTIVE, ACTIVATING, DEACTIVATED, DEACTIVATING, SUSPENDED, SUSPENDING;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<SimStatus> CREATOR = new Creator<SimStatus>() {
    @Override
    public SimStatus createFromParcel(final Parcel source) {
      return SimStatus.valueOf(source.readString());
    }

    @Override
    public SimStatus[] newArray(final int size) {
      return new SimStatus[size];
    }
  };
}
