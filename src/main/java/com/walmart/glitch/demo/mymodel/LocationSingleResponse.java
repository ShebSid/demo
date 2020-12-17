package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the base response class for Location which contains 3 things.  - **data** --- Complete Location object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated
 */
@ApiModel(description = "This is the base response class for Location which contains 3 things.  - **data** --- Complete Location object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class LocationSingleResponse   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("data")
  private Location data;

  public LocationSingleResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Boolean field indicating if the response was successfully fetched or not.
   * @return success
  */
  @ApiModelProperty(value = "Boolean field indicating if the response was successfully fetched or not.")


  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public LocationSingleResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp at which the response was generated.
   * @return timestamp
  */
  @ApiModelProperty(value = "The timestamp at which the response was generated.")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public LocationSingleResponse data(Location data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getData() {
    return data;
  }

  public void setData(Location data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationSingleResponse locationSingleResponse = (LocationSingleResponse) o;
    return Objects.equals(this.success, locationSingleResponse.success) &&
        Objects.equals(this.timestamp, locationSingleResponse.timestamp) &&
        Objects.equals(this.data, locationSingleResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, timestamp, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSingleResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
