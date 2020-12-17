package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.Associates;
import com.walmart.glitch.demo.mymodel.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Complete Location object.
 */
@ApiModel(description = "Complete Location object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class Location   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("locationNbr")
  private Integer locationNbr;

  @JsonProperty("name")
  private String name;

  @JsonProperty("openDate")
  private LocalDate openDate;

  @JsonProperty("closeDate")
  private LocalDate closeDate;

  @JsonProperty("streetAddress")
  private String streetAddress;

  @JsonProperty("city")
  private String city;

  @JsonProperty("stateProvinceCode")
  private String stateProvinceCode;

  @JsonProperty("stateProvinceId")
  private Integer stateProvinceId;

  @JsonProperty("stateProvince")
  private String stateProvince;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("timeZoneId")
  private String timeZoneId;

  @JsonProperty("timeZoneCode")
  private String timeZoneCode;

  @JsonProperty("glnNumbers")
  @Valid
  private List<String> glnNumbers = null;

  @JsonProperty("timeZoneDSTObservable")
  private Boolean timeZoneDSTObservable;

  @JsonProperty("logisticalCountryCode")
  private String logisticalCountryCode;

  @JsonProperty("type")
  private String type;

  @JsonProperty("typeCode")
  private Integer typeCode;

  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("status")
  private String status;

  @JsonProperty("buID")
  private Integer buID;

  @JsonProperty("tempStoreFlag")
  private Boolean tempStoreFlag;

  @JsonProperty("tempStoreNumber")
  private Integer tempStoreNumber;

  @JsonProperty("dcSupportTypeCode")
  private String dcSupportTypeCode;

  @JsonProperty("languageCode")
  private Integer languageCode;

  @JsonProperty("bannerCode")
  private String bannerCode;

  @JsonProperty("bannerDesc")
  private String bannerDesc;

  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("replenishmentTypeCode")
  private String replenishmentTypeCode;

  @JsonProperty("phoneNbr")
  private String phoneNbr;

  @JsonProperty("baseDivisionCode")
  private Integer baseDivisionCode;

  @JsonProperty("homeStoreNbr")
  private Integer homeStoreNbr;

  @JsonProperty("isSalesCompable")
  private Boolean isSalesCompable;

  @JsonProperty("isOpenSunday")
  private Boolean isOpenSunday;

  @JsonProperty("merchandiseMajorZoneNbr")
  private Integer merchandiseMajorZoneNbr;

  @JsonProperty("merchandiseSubZoneNbr")
  private Integer merchandiseSubZoneNbr;

  @JsonProperty("expansionOpenDate")
  private LocalDate expansionOpenDate;

  @JsonProperty("expansionSize")
  private Integer expansionSize;

  @JsonProperty("grossSize")
  private Integer grossSize;

  @JsonProperty("lastUpdatedUser")
  private String lastUpdatedUser;

  @JsonProperty("marketName")
  private String marketName;

  @JsonProperty("regionName")
  private String regionName;

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("formatDescription")
  private String formatDescription;

  @JsonProperty("divisions")
  @Valid
  private List<Division> divisions = null;

  @JsonProperty("associates")
  @Valid
  private List<Associates> associates = null;

  @JsonProperty("mainWarehouse")
  private Integer mainWarehouse;

  @JsonProperty("lastUpdatedDate")
  private LocalDate lastUpdatedDate;

  @JsonProperty("centerManaged")
  private Integer centerManaged;

  @JsonProperty("lastUpdatedTimestamp")
  private LocalDate lastUpdatedTimestamp;

  public Location id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Location ID.
   * @return id
  */
  @ApiModelProperty(value = "Location ID.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Location locationNbr(Integer locationNbr) {
    this.locationNbr = locationNbr;
    return this;
  }

  /**
   * Location number.
   * @return locationNbr
  */
  @ApiModelProperty(value = "Location number.")


  public Integer getLocationNbr() {
    return locationNbr;
  }

  public void setLocationNbr(Integer locationNbr) {
    this.locationNbr = locationNbr;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Location name.
   * @return name
  */
  @ApiModelProperty(value = "Location name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location openDate(LocalDate openDate) {
    this.openDate = openDate;
    return this;
  }

  /**
   * Location open date.
   * @return openDate
  */
  @ApiModelProperty(value = "Location open date.")

  @Valid

  public LocalDate getOpenDate() {
    return openDate;
  }

  public void setOpenDate(LocalDate openDate) {
    this.openDate = openDate;
  }

  public Location closeDate(LocalDate closeDate) {
    this.closeDate = closeDate;
    return this;
  }

  /**
   * Close date.
   * @return closeDate
  */
  @ApiModelProperty(value = "Close date.")

  @Valid

  public LocalDate getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(LocalDate closeDate) {
    this.closeDate = closeDate;
  }

  public Location streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Street address.
   * @return streetAddress
  */
  @ApiModelProperty(value = "Street address.")


  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City.
   * @return city
  */
  @ApiModelProperty(value = "City.")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location stateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

  /**
   * State province code.
   * @return stateProvinceCode
  */
  @ApiModelProperty(value = "State province code.")


  public String getStateProvinceCode() {
    return stateProvinceCode;
  }

  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }

  public Location stateProvinceId(Integer stateProvinceId) {
    this.stateProvinceId = stateProvinceId;
    return this;
  }

  /**
   * State province ID.
   * @return stateProvinceId
  */
  @ApiModelProperty(value = "State province ID.")


  public Integer getStateProvinceId() {
    return stateProvinceId;
  }

  public void setStateProvinceId(Integer stateProvinceId) {
    this.stateProvinceId = stateProvinceId;
  }

  public Location stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * State province.
   * @return stateProvince
  */
  @ApiModelProperty(value = "State province.")


  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public Location postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code.
   * @return postalCode
  */
  @ApiModelProperty(value = "Postal code.")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country.
   * @return country
  */
  @ApiModelProperty(value = "Country.")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

  /**
   * Timezone ID.
   * @return timeZoneId
  */
  @ApiModelProperty(value = "Timezone ID.")


  public String getTimeZoneId() {
    return timeZoneId;
  }

  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  public Location timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

  /**
   * Time zone code.
   * @return timeZoneCode
  */
  @ApiModelProperty(value = "Time zone code.")


  public String getTimeZoneCode() {
    return timeZoneCode;
  }

  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }

  public Location glnNumbers(List<String> glnNumbers) {
    this.glnNumbers = glnNumbers;
    return this;
  }

  public Location addGlnNumbersItem(String glnNumbersItem) {
    if (this.glnNumbers == null) {
      this.glnNumbers = new ArrayList<>();
    }
    this.glnNumbers.add(glnNumbersItem);
    return this;
  }

  /**
   * List of gln numbers.
   * @return glnNumbers
  */
  @ApiModelProperty(value = "List of gln numbers.")


  public List<String> getGlnNumbers() {
    return glnNumbers;
  }

  public void setGlnNumbers(List<String> glnNumbers) {
    this.glnNumbers = glnNumbers;
  }

  public Location timeZoneDSTObservable(Boolean timeZoneDSTObservable) {
    this.timeZoneDSTObservable = timeZoneDSTObservable;
    return this;
  }

  /**
   * Boolean to indicate Time zone DST observable.
   * @return timeZoneDSTObservable
  */
  @ApiModelProperty(value = "Boolean to indicate Time zone DST observable.")


  public Boolean getTimeZoneDSTObservable() {
    return timeZoneDSTObservable;
  }

  public void setTimeZoneDSTObservable(Boolean timeZoneDSTObservable) {
    this.timeZoneDSTObservable = timeZoneDSTObservable;
  }

  public Location logisticalCountryCode(String logisticalCountryCode) {
    this.logisticalCountryCode = logisticalCountryCode;
    return this;
  }

  /**
   * Logistical country code.
   * @return logisticalCountryCode
  */
  @ApiModelProperty(value = "Logistical country code.")


  public String getLogisticalCountryCode() {
    return logisticalCountryCode;
  }

  public void setLogisticalCountryCode(String logisticalCountryCode) {
    this.logisticalCountryCode = logisticalCountryCode;
  }

  public Location type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Location type.
   * @return type
  */
  @ApiModelProperty(value = "Location type.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Location typeCode(Integer typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Location type code.
   * @return typeCode
  */
  @ApiModelProperty(value = "Location type code.")


  public Integer getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(Integer typeCode) {
    this.typeCode = typeCode;
  }

  public Location statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status code.
   * @return statusCode
  */
  @ApiModelProperty(value = "Status code.")


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Location status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status.
   * @return status
  */
  @ApiModelProperty(value = "Status.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Location buID(Integer buID) {
    this.buID = buID;
    return this;
  }

  /**
   * BU ID.
   * @return buID
  */
  @ApiModelProperty(value = "BU ID.")


  public Integer getBuID() {
    return buID;
  }

  public void setBuID(Integer buID) {
    this.buID = buID;
  }

  public Location tempStoreFlag(Boolean tempStoreFlag) {
    this.tempStoreFlag = tempStoreFlag;
    return this;
  }

  /**
   * Boolean to indicate temporary store.
   * @return tempStoreFlag
  */
  @ApiModelProperty(value = "Boolean to indicate temporary store.")


  public Boolean getTempStoreFlag() {
    return tempStoreFlag;
  }

  public void setTempStoreFlag(Boolean tempStoreFlag) {
    this.tempStoreFlag = tempStoreFlag;
  }

  public Location tempStoreNumber(Integer tempStoreNumber) {
    this.tempStoreNumber = tempStoreNumber;
    return this;
  }

  /**
   * Temporary store number.
   * @return tempStoreNumber
  */
  @ApiModelProperty(value = "Temporary store number.")


  public Integer getTempStoreNumber() {
    return tempStoreNumber;
  }

  public void setTempStoreNumber(Integer tempStoreNumber) {
    this.tempStoreNumber = tempStoreNumber;
  }

  public Location dcSupportTypeCode(String dcSupportTypeCode) {
    this.dcSupportTypeCode = dcSupportTypeCode;
    return this;
  }

  /**
   * Delivery center support type code.
   * @return dcSupportTypeCode
  */
  @ApiModelProperty(value = "Delivery center support type code.")


  public String getDcSupportTypeCode() {
    return dcSupportTypeCode;
  }

  public void setDcSupportTypeCode(String dcSupportTypeCode) {
    this.dcSupportTypeCode = dcSupportTypeCode;
  }

  public Location languageCode(Integer languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Language code.
   * @return languageCode
  */
  @ApiModelProperty(value = "Language code.")


  public Integer getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(Integer languageCode) {
    this.languageCode = languageCode;
  }

  public Location bannerCode(String bannerCode) {
    this.bannerCode = bannerCode;
    return this;
  }

  /**
   * Banner code.
   * @return bannerCode
  */
  @ApiModelProperty(value = "Banner code.")


  public String getBannerCode() {
    return bannerCode;
  }

  public void setBannerCode(String bannerCode) {
    this.bannerCode = bannerCode;
  }

  public Location bannerDesc(String bannerDesc) {
    this.bannerDesc = bannerDesc;
    return this;
  }

  /**
   * Banner description.
   * @return bannerDesc
  */
  @ApiModelProperty(value = "Banner description.")


  public String getBannerDesc() {
    return bannerDesc;
  }

  public void setBannerDesc(String bannerDesc) {
    this.bannerDesc = bannerDesc;
  }

  public Location currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency code.
   * @return currencyCode
  */
  @ApiModelProperty(value = "Currency code.")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Location replenishmentTypeCode(String replenishmentTypeCode) {
    this.replenishmentTypeCode = replenishmentTypeCode;
    return this;
  }

  /**
   * Replenishment type code.
   * @return replenishmentTypeCode
  */
  @ApiModelProperty(value = "Replenishment type code.")


  public String getReplenishmentTypeCode() {
    return replenishmentTypeCode;
  }

  public void setReplenishmentTypeCode(String replenishmentTypeCode) {
    this.replenishmentTypeCode = replenishmentTypeCode;
  }

  public Location phoneNbr(String phoneNbr) {
    this.phoneNbr = phoneNbr;
    return this;
  }

  /**
   * Phone number.
   * @return phoneNbr
  */
  @ApiModelProperty(value = "Phone number.")


  public String getPhoneNbr() {
    return phoneNbr;
  }

  public void setPhoneNbr(String phoneNbr) {
    this.phoneNbr = phoneNbr;
  }

  public Location baseDivisionCode(Integer baseDivisionCode) {
    this.baseDivisionCode = baseDivisionCode;
    return this;
  }

  /**
   * Base division code.
   * @return baseDivisionCode
  */
  @ApiModelProperty(value = "Base division code.")


  public Integer getBaseDivisionCode() {
    return baseDivisionCode;
  }

  public void setBaseDivisionCode(Integer baseDivisionCode) {
    this.baseDivisionCode = baseDivisionCode;
  }

  public Location homeStoreNbr(Integer homeStoreNbr) {
    this.homeStoreNbr = homeStoreNbr;
    return this;
  }

  /**
   * Home store number.
   * @return homeStoreNbr
  */
  @ApiModelProperty(value = "Home store number.")


  public Integer getHomeStoreNbr() {
    return homeStoreNbr;
  }

  public void setHomeStoreNbr(Integer homeStoreNbr) {
    this.homeStoreNbr = homeStoreNbr;
  }

  public Location isSalesCompable(Boolean isSalesCompable) {
    this.isSalesCompable = isSalesCompable;
    return this;
  }

  /**
   * Boolean for sales compable.
   * @return isSalesCompable
  */
  @ApiModelProperty(value = "Boolean for sales compable.")


  public Boolean getIsSalesCompable() {
    return isSalesCompable;
  }

  public void setIsSalesCompable(Boolean isSalesCompable) {
    this.isSalesCompable = isSalesCompable;
  }

  public Location isOpenSunday(Boolean isOpenSunday) {
    this.isOpenSunday = isOpenSunday;
    return this;
  }

  /**
   * Boolean to check if open on Sunday.
   * @return isOpenSunday
  */
  @ApiModelProperty(value = "Boolean to check if open on Sunday.")


  public Boolean getIsOpenSunday() {
    return isOpenSunday;
  }

  public void setIsOpenSunday(Boolean isOpenSunday) {
    this.isOpenSunday = isOpenSunday;
  }

  public Location merchandiseMajorZoneNbr(Integer merchandiseMajorZoneNbr) {
    this.merchandiseMajorZoneNbr = merchandiseMajorZoneNbr;
    return this;
  }

  /**
   * Merchandise major zone number.
   * @return merchandiseMajorZoneNbr
  */
  @ApiModelProperty(value = "Merchandise major zone number.")


  public Integer getMerchandiseMajorZoneNbr() {
    return merchandiseMajorZoneNbr;
  }

  public void setMerchandiseMajorZoneNbr(Integer merchandiseMajorZoneNbr) {
    this.merchandiseMajorZoneNbr = merchandiseMajorZoneNbr;
  }

  public Location merchandiseSubZoneNbr(Integer merchandiseSubZoneNbr) {
    this.merchandiseSubZoneNbr = merchandiseSubZoneNbr;
    return this;
  }

  /**
   * Merchandise sub zone number.
   * @return merchandiseSubZoneNbr
  */
  @ApiModelProperty(value = "Merchandise sub zone number.")


  public Integer getMerchandiseSubZoneNbr() {
    return merchandiseSubZoneNbr;
  }

  public void setMerchandiseSubZoneNbr(Integer merchandiseSubZoneNbr) {
    this.merchandiseSubZoneNbr = merchandiseSubZoneNbr;
  }

  public Location expansionOpenDate(LocalDate expansionOpenDate) {
    this.expansionOpenDate = expansionOpenDate;
    return this;
  }

  /**
   * Expansion open date.
   * @return expansionOpenDate
  */
  @ApiModelProperty(value = "Expansion open date.")

  @Valid

  public LocalDate getExpansionOpenDate() {
    return expansionOpenDate;
  }

  public void setExpansionOpenDate(LocalDate expansionOpenDate) {
    this.expansionOpenDate = expansionOpenDate;
  }

  public Location expansionSize(Integer expansionSize) {
    this.expansionSize = expansionSize;
    return this;
  }

  /**
   * Expansion size.
   * @return expansionSize
  */
  @ApiModelProperty(value = "Expansion size.")


  public Integer getExpansionSize() {
    return expansionSize;
  }

  public void setExpansionSize(Integer expansionSize) {
    this.expansionSize = expansionSize;
  }

  public Location grossSize(Integer grossSize) {
    this.grossSize = grossSize;
    return this;
  }

  /**
   * Gross size.
   * @return grossSize
  */
  @ApiModelProperty(value = "Gross size.")


  public Integer getGrossSize() {
    return grossSize;
  }

  public void setGrossSize(Integer grossSize) {
    this.grossSize = grossSize;
  }

  public Location lastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  /**
   * Last updated user.
   * @return lastUpdatedUser
  */
  @ApiModelProperty(value = "Last updated user.")


  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public void setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
  }

  public Location marketName(String marketName) {
    this.marketName = marketName;
    return this;
  }

  /**
   * Market name.
   * @return marketName
  */
  @ApiModelProperty(value = "Market name.")


  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  public Location regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

  /**
   * Region name.
   * @return regionName
  */
  @ApiModelProperty(value = "Region name.")


  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Location latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude.
   * @return latitude
  */
  @ApiModelProperty(value = "Latitude.")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Location longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude.
   * @return longitude
  */
  @ApiModelProperty(value = "Longitude.")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Location formatDescription(String formatDescription) {
    this.formatDescription = formatDescription;
    return this;
  }

  /**
   * Format description.
   * @return formatDescription
  */
  @ApiModelProperty(value = "Format description.")


  public String getFormatDescription() {
    return formatDescription;
  }

  public void setFormatDescription(String formatDescription) {
    this.formatDescription = formatDescription;
  }

  public Location divisions(List<Division> divisions) {
    this.divisions = divisions;
    return this;
  }

  public Location addDivisionsItem(Division divisionsItem) {
    if (this.divisions == null) {
      this.divisions = new ArrayList<>();
    }
    this.divisions.add(divisionsItem);
    return this;
  }

  /**
   * List of Divisions.
   * @return divisions
  */
  @ApiModelProperty(value = "List of Divisions.")

  @Valid

  public List<Division> getDivisions() {
    return divisions;
  }

  public void setDivisions(List<Division> divisions) {
    this.divisions = divisions;
  }

  public Location associates(List<Associates> associates) {
    this.associates = associates;
    return this;
  }

  public Location addAssociatesItem(Associates associatesItem) {
    if (this.associates == null) {
      this.associates = new ArrayList<>();
    }
    this.associates.add(associatesItem);
    return this;
  }

  /**
   * List of associates.
   * @return associates
  */
  @ApiModelProperty(value = "List of associates.")

  @Valid

  public List<Associates> getAssociates() {
    return associates;
  }

  public void setAssociates(List<Associates> associates) {
    this.associates = associates;
  }

  public Location mainWarehouse(Integer mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
    return this;
  }

  /**
   * Main warehouse.
   * @return mainWarehouse
  */
  @ApiModelProperty(value = "Main warehouse.")


  public Integer getMainWarehouse() {
    return mainWarehouse;
  }

  public void setMainWarehouse(Integer mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  public Location lastUpdatedDate(LocalDate lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Last updated date.
   * @return lastUpdatedDate
  */
  @ApiModelProperty(value = "Last updated date.")

  @Valid

  public LocalDate getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public Location centerManaged(Integer centerManaged) {
    this.centerManaged = centerManaged;
    return this;
  }

  /**
   * Center managed.
   * @return centerManaged
  */
  @ApiModelProperty(value = "Center managed.")


  public Integer getCenterManaged() {
    return centerManaged;
  }

  public void setCenterManaged(Integer centerManaged) {
    this.centerManaged = centerManaged;
  }

  public Location lastUpdatedTimestamp(LocalDate lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * Last updated timestamp.
   * @return lastUpdatedTimestamp
  */
  @ApiModelProperty(value = "Last updated timestamp.")

  @Valid

  public LocalDate getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(LocalDate lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.locationNbr, location.locationNbr) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.openDate, location.openDate) &&
        Objects.equals(this.closeDate, location.closeDate) &&
        Objects.equals(this.streetAddress, location.streetAddress) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.stateProvinceCode, location.stateProvinceCode) &&
        Objects.equals(this.stateProvinceId, location.stateProvinceId) &&
        Objects.equals(this.stateProvince, location.stateProvince) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.timeZoneId, location.timeZoneId) &&
        Objects.equals(this.timeZoneCode, location.timeZoneCode) &&
        Objects.equals(this.glnNumbers, location.glnNumbers) &&
        Objects.equals(this.timeZoneDSTObservable, location.timeZoneDSTObservable) &&
        Objects.equals(this.logisticalCountryCode, location.logisticalCountryCode) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.typeCode, location.typeCode) &&
        Objects.equals(this.statusCode, location.statusCode) &&
        Objects.equals(this.status, location.status) &&
        Objects.equals(this.buID, location.buID) &&
        Objects.equals(this.tempStoreFlag, location.tempStoreFlag) &&
        Objects.equals(this.tempStoreNumber, location.tempStoreNumber) &&
        Objects.equals(this.dcSupportTypeCode, location.dcSupportTypeCode) &&
        Objects.equals(this.languageCode, location.languageCode) &&
        Objects.equals(this.bannerCode, location.bannerCode) &&
        Objects.equals(this.bannerDesc, location.bannerDesc) &&
        Objects.equals(this.currencyCode, location.currencyCode) &&
        Objects.equals(this.replenishmentTypeCode, location.replenishmentTypeCode) &&
        Objects.equals(this.phoneNbr, location.phoneNbr) &&
        Objects.equals(this.baseDivisionCode, location.baseDivisionCode) &&
        Objects.equals(this.homeStoreNbr, location.homeStoreNbr) &&
        Objects.equals(this.isSalesCompable, location.isSalesCompable) &&
        Objects.equals(this.isOpenSunday, location.isOpenSunday) &&
        Objects.equals(this.merchandiseMajorZoneNbr, location.merchandiseMajorZoneNbr) &&
        Objects.equals(this.merchandiseSubZoneNbr, location.merchandiseSubZoneNbr) &&
        Objects.equals(this.expansionOpenDate, location.expansionOpenDate) &&
        Objects.equals(this.expansionSize, location.expansionSize) &&
        Objects.equals(this.grossSize, location.grossSize) &&
        Objects.equals(this.lastUpdatedUser, location.lastUpdatedUser) &&
        Objects.equals(this.marketName, location.marketName) &&
        Objects.equals(this.regionName, location.regionName) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.formatDescription, location.formatDescription) &&
        Objects.equals(this.divisions, location.divisions) &&
        Objects.equals(this.associates, location.associates) &&
        Objects.equals(this.mainWarehouse, location.mainWarehouse) &&
        Objects.equals(this.lastUpdatedDate, location.lastUpdatedDate) &&
        Objects.equals(this.centerManaged, location.centerManaged) &&
        Objects.equals(this.lastUpdatedTimestamp, location.lastUpdatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationNbr, name, openDate, closeDate, streetAddress, city, stateProvinceCode, stateProvinceId, stateProvince, postalCode, country, timeZoneId, timeZoneCode, glnNumbers, timeZoneDSTObservable, logisticalCountryCode, type, typeCode, statusCode, status, buID, tempStoreFlag, tempStoreNumber, dcSupportTypeCode, languageCode, bannerCode, bannerDesc, currencyCode, replenishmentTypeCode, phoneNbr, baseDivisionCode, homeStoreNbr, isSalesCompable, isOpenSunday, merchandiseMajorZoneNbr, merchandiseSubZoneNbr, expansionOpenDate, expansionSize, grossSize, lastUpdatedUser, marketName, regionName, latitude, longitude, formatDescription, divisions, associates, mainWarehouse, lastUpdatedDate, centerManaged, lastUpdatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationNbr: ").append(toIndentedString(locationNbr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    stateProvinceId: ").append(toIndentedString(stateProvinceId)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    glnNumbers: ").append(toIndentedString(glnNumbers)).append("\n");
    sb.append("    timeZoneDSTObservable: ").append(toIndentedString(timeZoneDSTObservable)).append("\n");
    sb.append("    logisticalCountryCode: ").append(toIndentedString(logisticalCountryCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    buID: ").append(toIndentedString(buID)).append("\n");
    sb.append("    tempStoreFlag: ").append(toIndentedString(tempStoreFlag)).append("\n");
    sb.append("    tempStoreNumber: ").append(toIndentedString(tempStoreNumber)).append("\n");
    sb.append("    dcSupportTypeCode: ").append(toIndentedString(dcSupportTypeCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    bannerCode: ").append(toIndentedString(bannerCode)).append("\n");
    sb.append("    bannerDesc: ").append(toIndentedString(bannerDesc)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    replenishmentTypeCode: ").append(toIndentedString(replenishmentTypeCode)).append("\n");
    sb.append("    phoneNbr: ").append(toIndentedString(phoneNbr)).append("\n");
    sb.append("    baseDivisionCode: ").append(toIndentedString(baseDivisionCode)).append("\n");
    sb.append("    homeStoreNbr: ").append(toIndentedString(homeStoreNbr)).append("\n");
    sb.append("    isSalesCompable: ").append(toIndentedString(isSalesCompable)).append("\n");
    sb.append("    isOpenSunday: ").append(toIndentedString(isOpenSunday)).append("\n");
    sb.append("    merchandiseMajorZoneNbr: ").append(toIndentedString(merchandiseMajorZoneNbr)).append("\n");
    sb.append("    merchandiseSubZoneNbr: ").append(toIndentedString(merchandiseSubZoneNbr)).append("\n");
    sb.append("    expansionOpenDate: ").append(toIndentedString(expansionOpenDate)).append("\n");
    sb.append("    expansionSize: ").append(toIndentedString(expansionSize)).append("\n");
    sb.append("    grossSize: ").append(toIndentedString(grossSize)).append("\n");
    sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    formatDescription: ").append(toIndentedString(formatDescription)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
    sb.append("    associates: ").append(toIndentedString(associates)).append("\n");
    sb.append("    mainWarehouse: ").append(toIndentedString(mainWarehouse)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    centerManaged: ").append(toIndentedString(centerManaged)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

