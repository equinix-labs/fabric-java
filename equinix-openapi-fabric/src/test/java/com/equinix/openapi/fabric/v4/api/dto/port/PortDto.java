package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PortDto{

	@JsonProperty("encapsulation")
	private Encapsulation encapsulation;

	@JsonProperty("settings")
	private Settings settings;

	@JsonProperty("availableBandwidth")
	private int availableBandwidth;

	@JsonProperty("bandwidth")
	private int bandwidth;

	@JsonProperty("lagEnabled")
	private boolean lagEnabled;

	@JsonProperty("type")
	private String type;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("cvpId")
	private String cvpId;

	@JsonProperty("lag")
	private Lag lag;

	@JsonProperty("usedBandwidth")
	private int usedBandwidth;

	@JsonProperty("name")
	private String name;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("href")
	private String href;

	@JsonProperty("state")
	private String state;

	@JsonProperty("redundancy")
	private Redundancy redundancy;

	@JsonProperty("device")
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
