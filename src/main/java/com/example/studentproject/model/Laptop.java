package com.example.studentproject.model;

public class Laptop {
    private Long Id;
    private String asset_Id;
    private String wifi_mac_address;
    private String lan_mac_address;
    private String os;
    private String processor;
    private String ram;
    private String disk_type;
    private String disk_capacity;
    private Boolean is_cisco_product;
    private Boolean is_cloudops_product;
    private String splunk_id;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk_type() {
        return disk_type;
    }

    public void setDisk_type(String disk_type) {
        this.disk_type = disk_type;
    }

    public String getDisk_capacity() {
        return disk_capacity;
    }

    public void setDisk_capacity(String disk_capacity) {
        this.disk_capacity = disk_capacity;
    }

    public Boolean getIs_cisco_product() {
        return is_cisco_product;
    }

    public void setIs_cisco_product(Boolean is_cisco_product) {
        this.is_cisco_product = is_cisco_product;
    }

    public Boolean getIs_cloudops_product() {
        return is_cloudops_product;
    }

    public void setIs_cloudops_product(Boolean is_cloudops_product) {
        this.is_cloudops_product = is_cloudops_product;
    }

    public String getSplunk_id() {
        return splunk_id;
    }

    public void setSplunk_id(String splunk_id) {
        this.splunk_id = splunk_id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAsset_Id() {
        return asset_Id;
    }

    public void setAsset_Id(String asset_Id) {
        this.asset_Id = asset_Id;
    }

    public String getWifi_mac_address() {
        return wifi_mac_address;
    }

    public void setWifi_mac_address(String wifi_mac_address) {
        this.wifi_mac_address = wifi_mac_address;
    }

    public String getLan_mac_address() {
        return lan_mac_address;
    }

    public void setLan_mac_address(String lan_mac_address) {
        this.lan_mac_address = lan_mac_address;
    }
}
