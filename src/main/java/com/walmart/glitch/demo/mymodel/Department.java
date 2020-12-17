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
 * Department details.
 */
@ApiModel(description = "Department details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class Department   {
  @JsonProperty("departmentNbr")
  private Integer departmentNbr;

  @JsonProperty("departmentDesc")
  private String departmentDesc;

  public Department departmentNbr(Integer departmentNbr) {
    this.departmentNbr = departmentNbr;
    return this;
  }

  /**
   * Department number.
   * @return departmentNbr
  */
  @ApiModelProperty(value = "Department number.")


  public Integer getDepartmentNbr() {
    return departmentNbr;
  }

  public void setDepartmentNbr(Integer departmentNbr) {
    this.departmentNbr = departmentNbr;
  }

  public Department departmentDesc(String departmentDesc) {
    this.departmentDesc = departmentDesc;
    return this;
  }

  /**
   * Department description.
   * @return departmentDesc
  */
  @ApiModelProperty(value = "Department description.")


  public String getDepartmentDesc() {
    return departmentDesc;
  }

  public void setDepartmentDesc(String departmentDesc) {
    this.departmentDesc = departmentDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(this.departmentNbr, department.departmentNbr) &&
        Objects.equals(this.departmentDesc, department.departmentDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentNbr, departmentDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    
    sb.append("    departmentNbr: ").append(toIndentedString(departmentNbr)).append("\n");
    sb.append("    departmentDesc: ").append(toIndentedString(departmentDesc)).append("\n");
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

