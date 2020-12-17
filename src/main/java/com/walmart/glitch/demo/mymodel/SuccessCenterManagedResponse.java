package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.CenterManagedResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the base response class for Center managed which contains 3 things.  - **data** --- Complete Center managed object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated
 */
@ApiModel(description = "This is the base response class for Center managed which contains 3 things.  - **data** --- Complete Center managed object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class SuccessCenterManagedResponse   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("data")
  private CenterManagedResponse data;

  public SuccessCenterManagedResponse success(Boolean success) {
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

  public SuccessCenterManagedResponse timestamp(OffsetDateTime timestamp) {
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

  public SuccessCenterManagedResponse data(CenterManagedResponse data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public CenterManagedResponse getData() {
    return data;
  }

  public void setData(CenterManagedResponse data) {
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
    SuccessCenterManagedResponse successCenterManagedResponse = (SuccessCenterManagedResponse) o;
    return Objects.equals(this.success, successCenterManagedResponse.success) &&
        Objects.equals(this.timestamp, successCenterManagedResponse.timestamp) &&
        Objects.equals(this.data, successCenterManagedResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, timestamp, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessCenterManagedResponse {\n");
    
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

