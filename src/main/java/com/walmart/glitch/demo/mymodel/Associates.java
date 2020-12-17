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
 * Associates details.
 */
@ApiModel(description = "Associates details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class Associates   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("role")
  private String role;

  @JsonProperty("email")
  private String email;

  @JsonProperty("fullName")
  private String fullName;

  public Associates firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Associate first name.
   * @return firstName
  */
  @ApiModelProperty(value = "Associate first name.")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Associates lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Associate last name.
   * @return lastName
  */
  @ApiModelProperty(value = "Associate last name.")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Associates role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Associate role.
   * @return role
  */
  @ApiModelProperty(value = "Associate role.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Associates email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Associate name.
   * @return email
  */
  @ApiModelProperty(value = "Associate name.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Associates fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Associate full name.
   * @return fullName
  */
  @ApiModelProperty(value = "Associate full name.")


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
    Associates associates = (Associates) o;
    return Objects.equals(this.firstName, associates.firstName) &&
        Objects.equals(this.lastName, associates.lastName) &&
        Objects.equals(this.role, associates.role) &&
        Objects.equals(this.email, associates.email) &&
        Objects.equals(this.fullName, associates.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, role, email, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Associates {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

