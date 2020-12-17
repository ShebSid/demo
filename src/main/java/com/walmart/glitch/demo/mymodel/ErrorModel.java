package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error details object.
 */
@ApiModel(description = "Error details object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class ErrorModel   {
  @JsonProperty("errorCode")
  private Integer errorCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("details")
  @Valid
  private List<String> details = null;

  public ErrorModel errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code.
   * @return errorCode
  */
  @ApiModelProperty(value = "Error code.")


  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message summary.
   * @return message
  */
  @ApiModelProperty(value = "Error message summary.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorModel details(List<String> details) {
    this.details = details;
    return this;
  }

  public ErrorModel addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Detailed error description.
   * @return details
  */
  @ApiModelProperty(value = "Detailed error description.")


  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.errorCode, errorModel.errorCode) &&
        Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.details, errorModel.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

