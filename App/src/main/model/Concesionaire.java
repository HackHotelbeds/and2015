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
public class Concesionaire implements Parcelable {

	private String distanceKM;
	private String distanceMI;
	private String cityName;
	private String country;
	private String vendorCode;
	private String vendorShortName;
	private String streetInfo = "";
	private String positionX;
	private String positionY;
	private String localtionCode;
	private String locationName;

	public Concesionaire (Parcel parcel) {
		distanceKM = parcel.readString();
		distanceMI = parcel.readString();
		cityName = parcel.readString();
		country = parcel.readString();
		vendorCode = parcel.readString();
		vendorShortName = parcel.readString();
		streetInfo = parcel.readString();
		positionX = parcel.readString();
		positionY = parcel.readString();
		localtionCode = parcel.readString();
		locationName = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Concesionaire> CREATOR = new Parcelable.Creator<Concesionaire>() {

		@Override
		public Concesionaire createFromParcel(Parcel parcel) {
			return new Concesionaire(parcel);
		}

		@Override
		public Concesionaire[] newArray(int size) {
			return new Concesionaire[size];
		}
	};

	public String getDistanceKM() {
		return distanceKM;
	}

	public void setDistanceKM(String distanceKM) {
		this.distanceKM = distanceKM;
	}

	public String getDistanceMI() {
		return distanceMI;
	}

	public void setDistanceMI(String distanceMI) {
		this.distanceMI = distanceMI;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getVendorShortName() {
		return vendorShortName;
	}

	public void setVendorShortName(String vendorShortName) {
		this.vendorShortName = vendorShortName;
	}

	public String getStreetInfo() {
		return streetInfo;
	}

	public void setStreetInfo(String streetInfo) {
		this.streetInfo = streetInfo;
	}

	public String getPositionX() {
		return positionX;
	}

	public void setPositionX(String positionX) {
		this.positionX = positionX;
	}

	public String getPositionY() {
		return positionY;
	}

	public void setPositionY(String positionY) {
		this.positionY = positionY;
	}

	public String getLocaltionCode() {
		return localtionCode;
	}

	public void setLocaltionCode(String localtionCode) {
		this.localtionCode = localtionCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(distanceKM);
		dest.writeString(distanceMI);
		dest.writeString(cityName);
		dest.writeString(country);
		dest.writeString(vendorCode);
		dest.writeString(vendorShortName);
		dest.writeString(streetInfo);
		dest.writeString(positionX);
		dest.writeString(positionY);
		dest.writeString(localtionCode);
		dest.writeString(locationName);
	}
}
