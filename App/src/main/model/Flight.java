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
public class Flight implements Parcelable {

	private String startAirport;
	private String endAirport;
	private String departureDate;
	private String departureHour;
	private String arrivalDate;
	private String arrivalHour;
	private String flightNumber;
	private String price;

	public Flight (Parcel parcel) {
		startAirport = parcel.readString();
		endAirport = parcel.readString();
		departureDate = parcel.readString();
		departureHour = parcel.readString();
		arrivalDate = parcel.readString();
		arrivalHour = parcel.readString();
		flightNumber = parcel.readString();
		price = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Flight> CREATOR = new Parcelable.Creator<Flight>() {

		@Override
		public Flight createFromParcel(Parcel parcel) {
			return new Flight(parcel);
		}

		@Override
		public Flight[] newArray(int size) {
			return new Flight[size];
		}
	};

	public String getStartAirport() {
		return startAirport;
	}

	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}

	public String getEndAirport() {
		return endAirport;
	}

	public void setEndAirport(String endAirport) {
		this.endAirport = endAirport;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(String departureHour) {
		this.departureHour = departureHour;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalHour() {
		return arrivalHour;
	}

	public void setArrivalHour(String arrivalHour) {
		this.arrivalHour = arrivalHour;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(startAirport);
		dest.writeString(endAirport);
		dest.writeString(departureDate);
		dest.writeString(departureHour);
		dest.writeString(arrivalDate);
		dest.writeString(arrivalHour);
		dest.writeString(flightNumber);
		dest.writeString(price);
	}
}
