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
 * Store manager details.
 */
@ApiModel(description = "Store manager details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class StoreManagerResponse   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("role")
  private String role;

  @JsonProperty("email")
  private String email;

  @JsonProperty("locationNbr")
  private Integer locationNbr;

  @JsonProperty("fullName")
  private String fullName;

  public StoreManagerResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Store manager first name.
   * @return firstName
  */
  @ApiModelProperty(value = "Store manager first name.")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StoreManagerResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Store manager last name.
   * @return lastName
  */
  @ApiModelProperty(value = "Store manager last name.")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public StoreManagerResponse role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Store manager role.
   * @return role
  */
  @ApiModelProperty(value = "Store manager role.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public StoreManagerResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Store manager email.
   * @return email
  */
  @ApiModelProperty(value = "Store manager email.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StoreManagerResponse locationNbr(Integer locationNbr) {
    this.locationNbr = locationNbr;
    return this;
  }

  /**
   * Store manager location number.
   * @return locationNbr
  */
  @ApiModelProperty(value = "Store manager location number.")


  public Integer getLocationNbr() {
    return locationNbr;
  }

  public void setLocationNbr(Integer locationNbr) {
    this.locationNbr = locationNbr;
  }

  public StoreManagerResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Store manager full name.
   * @return fullName
  */
  @ApiModelProperty(value = "Store manager full name.")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreManagerResponse storeManagerResponse = (StoreManagerResponse) o;
    return Objects.equals(this.firstName, storeManagerResponse.firstName) &&
        Objects.equals(this.lastName, storeManagerResponse.lastName) &&
        Objects.equals(this.role, storeManagerResponse.role) &&
        Objects.equals(this.email, storeManagerResponse.email) &&
        Objects.equals(this.locationNbr, storeManagerResponse.locationNbr) &&
        Objects.equals(this.fullName, storeManagerResponse.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, role, email, locationNbr, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreManagerResponse {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    locationNbr: ").append(toIndentedString(locationNbr)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

