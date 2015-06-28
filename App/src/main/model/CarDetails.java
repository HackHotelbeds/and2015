package com.myapps.roadtrips.main.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Copyright 28/06/2015 the original author or authors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CarDetails implements Parcelable {

	private String carType;
	private String capacity;
	private String carName;

	public CarDetails (Parcel parcel) {
		carType = parcel.readString();
		capacity = parcel.readString();
		carName = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<CarDetails> CREATOR = new Parcelable.Creator<CarDetails>() {

		@Override
		public CarDetails createFromParcel(Parcel parcel) {
			return new CarDetails(parcel);
		}

		@Override
		public CarDetails[] newArray(int size) {
			return new CarDetails[size];
		}
	};

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(carType);
		dest.writeString(capacity);
		dest.writeString(carName);
	}
}
