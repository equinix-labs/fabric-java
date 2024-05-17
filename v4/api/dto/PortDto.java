package com.equinix.openapi.fabric.v4.api.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PortDto{

	@SerializedName("connection_name")
	private String connectionName;

	@SerializedName("connection_type")
	private String connectionType;

	@SerializedName("bandwidth")
	private int bandwidth;

	@SerializedName("aside_vlan_tag")
	private String asideVlanTag;

	@SerializedName("zside_ap_profile_type")
	private String zsideApProfileType;

	@SerializedName("purchase_order_number")
	private String purchaseOrderNumber;

	@SerializedName("notifications_type")
	private String notificationsType;

	@SerializedName("zside_ap_type")
	private String zsideApType;

	@SerializedName("zside_sp_name")
	private String zsideSpName;

	@SerializedName("notifications_emails")
	private List<String> notificationsEmails;

	@SerializedName("zside_location")
	private String zsideLocation;

	@SerializedName("aside_port_name")
	private String asidePortName;

	public String getConnectionName(){
		return connectionName;
	}

	public String getConnectionType(){
		return connectionType;
	}

	public int getBandwidth(){
		return bandwidth;
	}

	public String getAsideVlanTag(){
		return asideVlanTag;
	}

	public String getZsideApProfileType(){
		return zsideApProfileType;
	}

	public String getPurchaseOrderNumber(){
		return purchaseOrderNumber;
	}

	public String getNotificationsType(){
		return notificationsType;
	}

	public String getZsideApType(){
		return zsideApType;
	}

	public String getZsideSpName(){
		return zsideSpName;
	}

	public List<String> getNotificationsEmails(){
		return notificationsEmails;
	}

	public String getZsideLocation(){
		return zsideLocation;
	}

	public String getAsidePortName(){
		return asidePortName;
	}
}
