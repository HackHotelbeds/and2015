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
public class TicketOptions implements Parcelable {

	private ArrayList<Ticket> listTicket;
	private String day;

	public TicketOptions (Parcel parcel) {
		listTicket = parcel.readArrayList(Hotel.class.getClassLoader());
		day = parcel.readString();
	}

	// We need to add a Creator
	public static final Parcelable.Creator<TicketOptions> CREATOR = new Parcelable.Creator<TicketOptions>() {

		@Override
		public TicketOptions createFromParcel(Parcel parcel) {
			return new TicketOptions(parcel);
		}

		@Override
		public TicketOptions[] newArray(int size) {
			return new TicketOptions[size];
		}
	};

	public ArrayList<Ticket> getListTicket() {
		return listTicket;
	}

	public void setListTicket(ArrayList<Ticket> listTicket) {
		this.listTicket = listTicket;
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
		dest.writeTypedList(listTicket);
		dest.writeString(day);
	}
}
