package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class PortDto{

	@SerializedName("encapsulation")
	private Encapsulation encapsulation;

	@SerializedName("settings")
	private Settings settings;

	@SerializedName("availableBandwidth")
	private int availableBandwidth;

	@SerializedName("bandwidth")
	private int bandwidth;

	@SerializedName("lagEnabled")
	private boolean lagEnabled;

	@SerializedName("type")
	private String type;

	@SerializedName("uuid")
	private String uuid;

	@SerializedName("cvpId")
	private String cvpId;

	@SerializedName("lag")
	private Lag lag;

	@SerializedName("usedBandwidth")
	private int usedBandwidth;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Location location;

	@SerializedName("href")
	private String href;

	@SerializedName("state")
	private String state;

	@SerializedName("redundancy")
	private Redundancy redundancy;

	@SerializedName("device")
	private Device device;

	public Encapsulation getEncapsulation(){
		return encapsulation;
	}

	public Settings getSettings(){
		return settings;
	}

	public int getAvailableBandwidth(){
		return availableBandwidth;
	}

	public int getBandwidth(){
		return bandwidth;
	}

	public boolean isLagEnabled(){
		return lagEnabled;
	}

	public String getType(){
		return type;
	}

	public String getUuid(){
		return uuid;
	}

	public String getCvpId(){
		return cvpId;
	}

	public Lag getLag(){
		return lag;
	}

	public int getUsedBandwidth(){
		return usedBandwidth;
	}

	public String getName(){
		return name;
	}

	public Location getLocation(){
		return location;
	}

	public String getHref(){
		return href;
	}

	public String getState(){
		return state;
	}

	public Redundancy getRedundancy(){
		return redundancy;
	}

	public Device getDevice(){
		return device;
	}
}