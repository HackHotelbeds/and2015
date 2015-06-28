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
public class Car implements Parcelable {

	private String startString;
	private String endString;
	private String rateCode;
	private String price;
	private String numDays;
	private String carCode;
	private String warranty;
	private String additionalString;
	private String participationLevel;
	private String carType;
	private String capacity;
	private String carName;

	public Car (Parcel parcel) {
		startString = parcel.readString();
		endString = parcel.readString();
		rateCode = parcel.readString();
		price = parcel.readString();
		numDays = parcel.readString();
		carCode = parcel.readString();
		warranty = parcel.readString();
		additionalString = parcel.readString();
		participationLevel = parcel.readString();
		carType = parcel.readString();
		capacity = parcel.readString();
		carName = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Car> CREATOR = new Parcelable.Creator<Car>() {

		@Override
		public Car createFromParcel(Parcel parcel) {
			return new Car(parcel);
		}

		@Override
		public Car[] newArray(int size) {
			return new Car[size];
		}
	};

	public String getStartString() {
		return startString;
	}

	public void setStartString(String startString) {
		this.startString = startString;
	}

	public String getEndString() {
		return endString;
	}

	public void setEndString(String endString) {
		this.endString = endString;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNumDays() {
		return numDays;
	}

	public void setNumDays(String numDays) {
		this.numDays = numDays;
	}

	public String getCarCode() {
		return carCode;
	}

	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getAdditionalString() {
		return additionalString;
	}

	public void setAdditionalString(String additionalString) {
		this.additionalString = additionalString;
	}

	public String getParticipationLevel() {
		return participationLevel;
	}

	public void setParticipationLevel(String participationLevel) {
		this.participationLevel = participationLevel;
	}

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
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(startString);
		dest.writeString(endString);
		dest.writeString(rateCode);
		dest.writeString(price);
		dest.writeString(numDays);
		dest.writeString(carCode);
		dest.writeString(warranty);
		dest.writeString(additionalString);
		dest.writeString(participationLevel);
		dest.writeString(carType);
		dest.writeString(capacity);
		dest.writeString(carName);
	}
}
