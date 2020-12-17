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
 * Center managed object.
 */
@ApiModel(description = "Center managed object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class CenterManagedResponse   {
  @JsonProperty("totalStores")
  private Integer totalStores;

  @JsonProperty("storeNumberList")
  @Valid
  private List<Integer> storeNumberList = null;

  public CenterManagedResponse totalStores(Integer totalStores) {
    this.totalStores = totalStores;
    return this;
  }

  /**
   * Total stores.
   * @return totalStores
  */
  @ApiModelProperty(value = "Total stores.")


  public Integer getTotalStores() {
    return totalStores;
  }

  public void setTotalStores(Integer totalStores) {
    this.totalStores = totalStores;
  }

  public CenterManagedResponse storeNumberList(List<Integer> storeNumberList) {
    this.storeNumberList = storeNumberList;
    return this;
  }

  public CenterManagedResponse addStoreNumberListItem(Integer storeNumberListItem) {
    if (this.storeNumberList == null) {
      this.storeNumberList = new ArrayList<>();
    }
    this.storeNumberList.add(storeNumberListItem);
    return this;
  }

  /**
   * List of store numbers.
   * @return storeNumberList
  */
  @ApiModelProperty(value = "List of store numbers.")


  public List<Integer> getStoreNumberList() {
    return storeNumberList;
  }

  public void setStoreNumberList(List<Integer> storeNumberList) {
    this.storeNumberList = storeNumberList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CenterManagedResponse centerManagedResponse = (CenterManagedResponse) o;
    return Objects.equals(this.totalStores, centerManagedResponse.totalStores) &&
        Objects.equals(this.storeNumberList, centerManagedResponse.storeNumberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalStores, storeNumberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CenterManagedResponse {\n");
    
    sb.append("    totalStores: ").append(toIndentedString(totalStores)).append("\n");
    sb.append("    storeNumberList: ").append(toIndentedString(storeNumberList)).append("\n");
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

