package com.myapps.roadtrips.main.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

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
public class HotelOptions implements Parcelable {

	private ArrayList<Hotel> listHotel;
	private String day;

	public HotelOptions (Parcel parcel) {
		listHotel = parcel.readArrayList(Hotel.class.getClassLoader());
		day = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<HotelOptions> CREATOR = new Parcelable.Creator<HotelOptions>() {

		@Override
		public HotelOptions createFromParcel(Parcel parcel) {
			return new HotelOptions(parcel);
		}

		@Override
		public HotelOptions[] newArray(int size) {
			return new HotelOptions[size];
		}
	};

	public ArrayList<Hotel> getListHotel() {
		return listHotel;
	}

	public void setListHotel(ArrayList<Hotel> listHotel) {
		this.listHotel = listHotel;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeTypedList(listHotel);
		dest.writeString(day);
	}
}
