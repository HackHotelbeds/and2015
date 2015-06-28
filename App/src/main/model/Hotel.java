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
public class Hotel implements Parcelable {

	private String name;
	private String price;
	private String category;
	private String code;
	private String currency;
	private String lat;
	private String lon;
	private String roomType;
	private String board;
	private int night;
	private String company;

	public Hotel (Parcel parcel) {
		name = parcel.readString();
		price = parcel.readString();
		category = parcel.readString();
		code = parcel.readString();
		currency = parcel.readString();
		lat = parcel.readString();
		lon = parcel.readString();
		roomType = parcel.readString();
		board = parcel.readString();
		night = Integer.parseInt(parcel.readString());
		company = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Hotel> CREATOR = new Parcelable.Creator<Hotel>() {

		@Override
		public Hotel createFromParcel(Parcel parcel) {
			return new Hotel(parcel);
		}

		@Override
		public Hotel[] newArray(int size) {
			return new Hotel[size];
		}
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeString(price);
		dest.writeString(category);
		dest.writeString(code);
		dest.writeString(currency);
		dest.writeString(lat);
		dest.writeString(lon);
		dest.writeString(roomType);
		dest.writeString(board);
		dest.writeString(String.valueOf(night));
		dest.writeString(company);
	}
}
