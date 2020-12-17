package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.ErrorModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the base error response class for Location domain which contains 3 things.  - error --- List of errors  - success --- Boolean field indicating if the response was successfully fetched or not  - timestamp --- The timestamp at which the response was generated
 */
@ApiModel(description = "This is the base error response class for Location domain which contains 3 things.  - error --- List of errors  - success --- Boolean field indicating if the response was successfully fetched or not  - timestamp --- The timestamp at which the response was generated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class ErrorResponse   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("timeStamp")
  private OffsetDateTime timeStamp;

  @JsonProperty("error")
  private ErrorModel error;

  public ErrorResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Boolean field indicating if the error response was successfully fetched or not.
   * @return success
  */
  @ApiModelProperty(value = "Boolean field indicating if the error response was successfully fetched or not.")


  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ErrorResponse timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * The timestamp at which the response was generated.
   * @return timeStamp
  */
  @ApiModelProperty(value = "The timestamp at which the response was generated.")

  @Valid

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ErrorResponse error(ErrorModel error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorModel getError() {
    return error;
  }

  public void setError(ErrorModel error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.success, errorResponse.success) &&
        Objects.equals(this.timeStamp, errorResponse.timeStamp) &&
        Objects.equals(this.error, errorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, timeStamp, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

