package com.myapps.roadtrips.main.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

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
public class Itinerary implements Parcelable {

	private ArrayList<Flight> goingFlight;
	private ArrayList<Car> listCar;
	private ArrayList<HotelOptions> hotelOptionDays;
	private ArrayList<TicketOptions> ticketOptionDays;
	private ArrayList<Flight> returnFlight;

	public Itinerary (Parcel parcel) {
		goingFlight = parcel.readArrayList(Hotel.class.getClassLoader());
		listCar = parcel.readArrayList(Car.class.getClassLoader());
		hotelOptionDays = parcel.readArrayList(HotelOptions.class.getClassLoader());
		ticketOptionDays = parcel.readArrayList(TicketOptions.class.getClassLoader());
		returnFlight = parcel.readArrayList(Flight.class.getClassLoader());
	}

	// We need to add a Creator
	public static final Parcelable.Creator<Itinerary> CREATOR = new Parcelable.Creator<Itinerary>() {

		@Override
		public Itinerary createFromParcel(Parcel parcel) {
			return new Itinerary(parcel);
		}

		@Override
		public Itinerary[] newArray(int size) {
			return new Itinerary[size];
		}
	};

	public ArrayList<Flight> getGoingFlight() {
		return goingFlight;
	}

	public void setGoingFlight(ArrayList<Flight> goingFlight) {
		this.goingFlight = goingFlight;
	}

	public ArrayList<Car> getListCar() {
		return listCar;
	}

	public void setListCar(ArrayList<Car> listCar) {
		this.listCar = listCar;
	}

	public ArrayList<HotelOptions> getHotelOptionDays() {
		return hotelOptionDays;
	}

	public void setHotelOptionDays(ArrayList<HotelOptions> hotelOptionDays) {
		this.hotelOptionDays = hotelOptionDays;
	}

	public ArrayList<TicketOptions> getTicketOptionDays() {
		return ticketOptionDays;
	}

	public void setTicketOptionDays(ArrayList<TicketOptions> ticketOptionDays) {
		this.ticketOptionDays = ticketOptionDays;
	}

	public ArrayList<Flight> getReturnFlight() {
		return returnFlight;
	}

	public void setReturnFlight(ArrayList<Flight> returnFlight) {
		this.returnFlight = returnFlight;
	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeTypedList(goingFlight);
		dest.writeTypedList(listCar);
		dest.writeTypedList(hotelOptionDays);
		dest.writeTypedList(ticketOptionDays);
		dest.writeTypedList(returnFlight);
	}
}
