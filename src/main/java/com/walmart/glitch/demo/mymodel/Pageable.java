package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.Sort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Metadata information representing pagination properties.
 */
@ApiModel(description = "Metadata information representing pagination properties.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class Pageable   {
  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("pageNumber")
  private Integer pageNumber;

  @JsonProperty("offset")
  private Long offset;

  @JsonProperty("sort")
  private Sort sort;

  @JsonProperty("paged")
  private Boolean paged;

  @JsonProperty("unpaged")
  private Boolean unpaged;

  public Pageable pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Specifies number of records per page.
   * @return pageSize
  */
  @ApiModelProperty(value = "Specifies number of records per page.")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Pageable pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Represents zero based index of page to fetch. If offset is provided, that too will be considered.
   * @return pageNumber
  */
  @ApiModelProperty(value = "Represents zero based index of page to fetch. If offset is provided, that too will be considered.")


  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Pageable offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Zero based index of number of records to skip from start. If not mentioned, it is considered zero.
   * @return offset
  */
  @ApiModelProperty(value = "Zero based index of number of records to skip from start. If not mentioned, it is considered zero.")


  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Pageable sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @ApiModelProperty(value = "")

  @Valid

  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public Pageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

  /**
   * Boolean to represent paged information.
   * @return paged
  */
  @ApiModelProperty(value = "Boolean to represent paged information.")


  public Boolean getPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public Pageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  /**
   * Boolean to represent if the pagination is enabled or not.
   * @return unpaged
  */
  @ApiModelProperty(value = "Boolean to represent if the pagination is enabled or not.")


  public Boolean getUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.pageSize, pageable.pageSize) &&
        Objects.equals(this.pageNumber, pageable.pageNumber) &&
        Objects.equals(this.offset, pageable.offset) &&
        Objects.equals(this.sort, pageable.sort) &&
        Objects.equals(this.paged, pageable.paged) &&
        Objects.equals(this.unpaged, pageable.unpaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, offset, sort, paged, unpaged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
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

