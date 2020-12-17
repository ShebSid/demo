package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Store manager creation request payload.
 */
@ApiModel(description = "Store manager creation request payload.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class StoreManagerRequest   {
  @JsonProperty("locationNumber")
  private Integer locationNumber;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("managerRole")
  private String managerRole;

  public StoreManagerRequest locationNumber(Integer locationNumber) {
    this.locationNumber = locationNumber;
    return this;
  }

  /**
   * Location number.
   * @return locationNumber
  */
  @ApiModelProperty(value = "Location number.")


  public Integer getLocationNumber() {
    return locationNumber;
  }

  public void setLocationNumber(Integer locationNumber) {
    this.locationNumber = locationNumber;
  }

  public StoreManagerRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Standard country code. Example US = USA, CA = Canada.
   * @return countryCode
  */
  @ApiModelProperty(value = "Standard country code. Example US = USA, CA = Canada.")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public StoreManagerRequest managerRole(String managerRole) {
    this.managerRole = managerRole;
    return this;
  }

  /**
   * Manager role.
   * @return managerRole
  */
  @ApiModelProperty(value = "Manager role.")


  public String getManagerRole() {
    return managerRole;
  }

  public void setManagerRole(String managerRole) {
    this.managerRole = managerRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreManagerRequest storeManagerRequest = (StoreManagerRequest) o;
    return Objects.equals(this.locationNumber, storeManagerRequest.locationNumber) &&
        Objects.equals(this.countryCode, storeManagerRequest.countryCode) &&
        Objects.equals(this.managerRole, storeManagerRequest.managerRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationNumber, countryCode, managerRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreManagerRequest {\n");
    
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    managerRole: ").append(toIndentedString(managerRole)).append("\n");
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

