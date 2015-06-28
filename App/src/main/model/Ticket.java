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
public class Ticket implements Parcelable {

	private String name;
	private String price;
	private String company;
	private int night;

	public Ticket (Parcel parcel) {
		name = parcel.readString();
		price = parcel.readString();
		company = parcel.readString();
		night = Integer.valueOf(parcel.readString());
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Ticket> CREATOR = new Parcelable.Creator<Ticket>() {

		@Override
		public Ticket createFromParcel(Parcel parcel) {
			return new Ticket(parcel);
		}

		@Override
		public Ticket[] newArray(int size) {
			return new Ticket[size];
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeString(price);
		dest.writeString(company);
		dest.writeString(String.valueOf(night));
	}
}
