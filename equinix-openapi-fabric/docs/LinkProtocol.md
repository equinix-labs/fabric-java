

# LinkProtocol

Connection link protocol Configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **LinkProtocolType** |  |  |
|**ipv4** | [**LinkProtocolIpv4Ipv6Config**](LinkProtocolIpv4Ipv6Config.md) |  |  [optional] |
|**ipv6** | [**LinkProtocolIpv4Ipv6Config**](LinkProtocolIpv4Ipv6Config.md) |  |  [optional] |
|**tagProtocolId** | **String** | Tag protocol identifier |  [optional] |
|**vlanTag** | **String** | VLAN tag |  |
|**vlanTagMin** | **Integer** | VLAN tag Min value specified for DOT1Q connections |  [optional] |
|**vlanTagMax** | **Integer** | VLAN tag Max value specified for DOT1Q connections |  [optional] |
|**innerTagProtocolId** | **Integer** | Inner tag protocol identifier |  |
|**outerTagProtocolId** | **Integer** | Outer tag protocol identifier |  |
|**vlanCTag** | **Integer** | Inner tag, i.e., C-VLAN tag |  |
|**vlanSTag** | **Integer** | Outer tag, i.e., S-VLAN tag |  |
|**vlanCTagMin** | **Integer** | Outer tag Min value specified for QINQ connections |  [optional] |
|**vlanCTagMax** | **Integer** | Outer tag Max value specified for QINQ connections |  [optional] |
|**subInterface** | **Integer** | Subinterface identifier |  [optional] |
|**vnid** | **Integer** | Virtual Network Identifier |  |
|**type5vni** | **Integer** | Type 5 VNI identifier |  |



