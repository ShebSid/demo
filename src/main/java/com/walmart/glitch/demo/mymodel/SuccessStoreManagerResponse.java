package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.StoreManagerResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the base response class for Store manager which contains 3 things.  - **data** --- List of complete Store manager object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated
 */
@ApiModel(description = "This is the base response class for Store manager which contains 3 things.  - **data** --- List of complete Store manager object  - **success** --- Boolean field indicating if the response was successfully fetched or not  - **timestamp** --- The timestamp at which the response was generated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class SuccessStoreManagerResponse   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("data")
  @Valid
  private List<StoreManagerResponse> data = null;

  public SuccessStoreManagerResponse success(Boolean success) {
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

  public SuccessStoreManagerResponse timestamp(OffsetDateTime timestamp) {
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

  public SuccessStoreManagerResponse data(List<StoreManagerResponse> data) {
    this.data = data;
    return this;
  }

  public SuccessStoreManagerResponse addDataItem(StoreManagerResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of complete Store manager object.
   * @return data
  */
  @ApiModelProperty(value = "List of complete Store manager object.")

  @Valid

  public List<StoreManagerResponse> getData() {
    return data;
  }

  public void setData(List<StoreManagerResponse> data) {
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
    SuccessStoreManagerResponse successStoreManagerResponse = (SuccessStoreManagerResponse) o;
    return Objects.equals(this.success, successStoreManagerResponse.success) &&
        Objects.equals(this.timestamp, successStoreManagerResponse.timestamp) &&
        Objects.equals(this.data, successStoreManagerResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, timestamp, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessStoreManagerResponse {\n");
    
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

