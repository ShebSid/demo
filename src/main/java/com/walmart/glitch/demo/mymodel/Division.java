package com.walmart.glitch.demo.mymodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.walmart.glitch.demo.mymodel.Department;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Division details.
 */
@ApiModel(description = "Division details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-17T23:35:14.636+05:30[Asia/Kolkata]")

public class Division   {
  @JsonProperty("divisionNbr")
  private Integer divisionNbr;

  @JsonProperty("divisionDesc")
  private String divisionDesc;

  @JsonProperty("typeCode")
  private Integer typeCode;

  @JsonProperty("type")
  private String type;

  @JsonProperty("openDate")
  private LocalDate openDate;

  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("regionCode")
  private Integer regionCode;

  @JsonProperty("subRegionCode")
  private Integer subRegionCode;

  @JsonProperty("marketCode")
  private Integer marketCode;

  @JsonProperty("baseDivisionCode")
  private Integer baseDivisionCode;

  @JsonProperty("subDivisionCode")
  private String subDivisionCode;

  @JsonProperty("subDivisionName")
  private String subDivisionName;

  @JsonProperty("businessUnitOrgAreaCode")
  private Integer businessUnitOrgAreaCode;

  @JsonProperty("lastUpdatedTimestamp")
  private LocalDate lastUpdatedTimestamp;

  @JsonProperty("lastUpdatedUser")
  private String lastUpdatedUser;

  @JsonProperty("storeCode3")
  private String storeCode3;

  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("taxReportCode")
  private Integer taxReportCode;

  @JsonProperty("reportCode")
  private String reportCode;

  @JsonProperty("deleteCode")
  private String deleteCode;

  @JsonProperty("shrinkPctCost")
  private Integer shrinkPctCost;

  @JsonProperty("shrinkRetailPct")
  private Integer shrinkRetailPct;

  @JsonProperty("departments")
  @Valid
  private List<Department> departments = null;

  public Division divisionNbr(Integer divisionNbr) {
    this.divisionNbr = divisionNbr;
    return this;
  }

  /**
   * Division number.
   * @return divisionNbr
  */
  @ApiModelProperty(value = "Division number.")


  public Integer getDivisionNbr() {
    return divisionNbr;
  }

  public void setDivisionNbr(Integer divisionNbr) {
    this.divisionNbr = divisionNbr;
  }

  public Division divisionDesc(String divisionDesc) {
    this.divisionDesc = divisionDesc;
    return this;
  }

  /**
   * Division description.
   * @return divisionDesc
  */
  @ApiModelProperty(value = "Division description.")


  public String getDivisionDesc() {
    return divisionDesc;
  }

  public void setDivisionDesc(String divisionDesc) {
    this.divisionDesc = divisionDesc;
  }

  public Division typeCode(Integer typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Division type code.
   * @return typeCode
  */
  @ApiModelProperty(value = "Division type code.")


  public Integer getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(Integer typeCode) {
    this.typeCode = typeCode;
  }

  public Division type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Division type.
   * @return type
  */
  @ApiModelProperty(value = "Division type.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Division openDate(LocalDate openDate) {
    this.openDate = openDate;
    return this;
  }

  /**
   * Open date.
   * @return openDate
  */
  @ApiModelProperty(value = "Open date.")

  @Valid

  public LocalDate getOpenDate() {
    return openDate;
  }

  public void setOpenDate(LocalDate openDate) {
    this.openDate = openDate;
  }

  public Division statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status code.
   * @return statusCode
  */
  @ApiModelProperty(value = "Status code.")


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Division regionCode(Integer regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Region code.
   * @return regionCode
  */
  @ApiModelProperty(value = "Region code.")


  public Integer getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(Integer regionCode) {
    this.regionCode = regionCode;
  }

  public Division subRegionCode(Integer subRegionCode) {
    this.subRegionCode = subRegionCode;
    return this;
  }

  /**
   * Sub region code.
   * @return subRegionCode
  */
  @ApiModelProperty(value = "Sub region code.")


  public Integer getSubRegionCode() {
    return subRegionCode;
  }

  public void setSubRegionCode(Integer subRegionCode) {
    this.subRegionCode = subRegionCode;
  }

  public Division marketCode(Integer marketCode) {
    this.marketCode = marketCode;
    return this;
  }

  /**
   * Market code.
   * @return marketCode
  */
  @ApiModelProperty(value = "Market code.")


  public Integer getMarketCode() {
    return marketCode;
  }

  public void setMarketCode(Integer marketCode) {
    this.marketCode = marketCode;
  }

  public Division baseDivisionCode(Integer baseDivisionCode) {
    this.baseDivisionCode = baseDivisionCode;
    return this;
  }

  /**
   * Base division code.
   * @return baseDivisionCode
  */
  @ApiModelProperty(value = "Base division code.")


  public Integer getBaseDivisionCode() {
    return baseDivisionCode;
  }

  public void setBaseDivisionCode(Integer baseDivisionCode) {
    this.baseDivisionCode = baseDivisionCode;
  }

  public Division subDivisionCode(String subDivisionCode) {
    this.subDivisionCode = subDivisionCode;
    return this;
  }

  /**
   * Sub division code.
   * @return subDivisionCode
  */
  @ApiModelProperty(value = "Sub division code.")


  public String getSubDivisionCode() {
    return subDivisionCode;
  }

  public void setSubDivisionCode(String subDivisionCode) {
    this.subDivisionCode = subDivisionCode;
  }

  public Division subDivisionName(String subDivisionName) {
    this.subDivisionName = subDivisionName;
    return this;
  }

  /**
   * Sub division name.
   * @return subDivisionName
  */
  @ApiModelProperty(value = "Sub division name.")


  public String getSubDivisionName() {
    return subDivisionName;
  }

  public void setSubDivisionName(String subDivisionName) {
    this.subDivisionName = subDivisionName;
  }

  public Division businessUnitOrgAreaCode(Integer businessUnitOrgAreaCode) {
    this.businessUnitOrgAreaCode = businessUnitOrgAreaCode;
    return this;
  }

  /**
   * Business unit organization area code.
   * @return businessUnitOrgAreaCode
  */
  @ApiModelProperty(value = "Business unit organization area code.")


  public Integer getBusinessUnitOrgAreaCode() {
    return businessUnitOrgAreaCode;
  }

  public void setBusinessUnitOrgAreaCode(Integer businessUnitOrgAreaCode) {
    this.businessUnitOrgAreaCode = businessUnitOrgAreaCode;
  }

  public Division lastUpdatedTimestamp(LocalDate lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * Last updated timestamp.
   * @return lastUpdatedTimestamp
  */
  @ApiModelProperty(value = "Last updated timestamp.")

  @Valid

  public LocalDate getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public void setLastUpdatedTimestamp(LocalDate lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }

  public Division lastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  /**
   * Last updated user.
   * @return lastUpdatedUser
  */
  @ApiModelProperty(value = "Last updated user.")


  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public void setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
  }

  public Division storeCode3(String storeCode3) {
    this.storeCode3 = storeCode3;
    return this;
  }

  /**
   * Store code 3.
   * @return storeCode3
  */
  @ApiModelProperty(value = "Store code 3.")


  public String getStoreCode3() {
    return storeCode3;
  }

  public void setStoreCode3(String storeCode3) {
    this.storeCode3 = storeCode3;
  }

  public Division companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Company code.
   * @return companyCode
  */
  @ApiModelProperty(value = "Company code.")


  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public Division taxReportCode(Integer taxReportCode) {
    this.taxReportCode = taxReportCode;
    return this;
  }

  /**
   * Tax report code.
   * @return taxReportCode
  */
  @ApiModelProperty(value = "Tax report code.")


  public Integer getTaxReportCode() {
    return taxReportCode;
  }

  public void setTaxReportCode(Integer taxReportCode) {
    this.taxReportCode = taxReportCode;
  }

  public Division reportCode(String reportCode) {
    this.reportCode = reportCode;
    return this;
  }

  /**
   * Report code.
   * @return reportCode
  */
  @ApiModelProperty(value = "Report code.")


  public String getReportCode() {
    return reportCode;
  }

  public void setReportCode(String reportCode) {
    this.reportCode = reportCode;
  }

  public Division deleteCode(String deleteCode) {
    this.deleteCode = deleteCode;
    return this;
  }

  /**
   * Delete code.
   * @return deleteCode
  */
  @ApiModelProperty(value = "Delete code.")


  public String getDeleteCode() {
    return deleteCode;
  }

  public void setDeleteCode(String deleteCode) {
    this.deleteCode = deleteCode;
  }

  public Division shrinkPctCost(Integer shrinkPctCost) {
    this.shrinkPctCost = shrinkPctCost;
    return this;
  }

  /**
   * Shrink packet cost.
   * @return shrinkPctCost
  */
  @ApiModelProperty(value = "Shrink packet cost.")


  public Integer getShrinkPctCost() {
    return shrinkPctCost;
  }

  public void setShrinkPctCost(Integer shrinkPctCost) {
    this.shrinkPctCost = shrinkPctCost;
  }

  public Division shrinkRetailPct(Integer shrinkRetailPct) {
    this.shrinkRetailPct = shrinkRetailPct;
    return this;
  }

  /**
   * Shrink retail packet.
   * @return shrinkRetailPct
  */
  @ApiModelProperty(value = "Shrink retail packet.")


  public Integer getShrinkRetailPct() {
    return shrinkRetailPct;
  }

  public void setShrinkRetailPct(Integer shrinkRetailPct) {
    this.shrinkRetailPct = shrinkRetailPct;
  }

  public Division departments(List<Department> departments) {
    this.departments = departments;
    return this;
  }

  public Division addDepartmentsItem(Department departmentsItem) {
    if (this.departments == null) {
      this.departments = new ArrayList<>();
    }
    this.departments.add(departmentsItem);
    return this;
  }

  /**
   * List of all departments for a division.
   * @return departments
  */
  @ApiModelProperty(value = "List of all departments for a division.")

  @Valid

  public List<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Division division = (Division) o;
    return Objects.equals(this.divisionNbr, division.divisionNbr) &&
        Objects.equals(this.divisionDesc, division.divisionDesc) &&
        Objects.equals(this.typeCode, division.typeCode) &&
        Objects.equals(this.type, division.type) &&
        Objects.equals(this.openDate, division.openDate) &&
        Objects.equals(this.statusCode, division.statusCode) &&
        Objects.equals(this.regionCode, division.regionCode) &&
        Objects.equals(this.subRegionCode, division.subRegionCode) &&
        Objects.equals(this.marketCode, division.marketCode) &&
        Objects.equals(this.baseDivisionCode, division.baseDivisionCode) &&
        Objects.equals(this.subDivisionCode, division.subDivisionCode) &&
        Objects.equals(this.subDivisionName, division.subDivisionName) &&
        Objects.equals(this.businessUnitOrgAreaCode, division.businessUnitOrgAreaCode) &&
        Objects.equals(this.lastUpdatedTimestamp, division.lastUpdatedTimestamp) &&
        Objects.equals(this.lastUpdatedUser, division.lastUpdatedUser) &&
        Objects.equals(this.storeCode3, division.storeCode3) &&
        Objects.equals(this.companyCode, division.companyCode) &&
        Objects.equals(this.taxReportCode, division.taxReportCode) &&
        Objects.equals(this.reportCode, division.reportCode) &&
        Objects.equals(this.deleteCode, division.deleteCode) &&
        Objects.equals(this.shrinkPctCost, division.shrinkPctCost) &&
        Objects.equals(this.shrinkRetailPct, division.shrinkRetailPct) &&
        Objects.equals(this.departments, division.departments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divisionNbr, divisionDesc, typeCode, type, openDate, statusCode, regionCode, subRegionCode, marketCode, baseDivisionCode, subDivisionCode, subDivisionName, businessUnitOrgAreaCode, lastUpdatedTimestamp, lastUpdatedUser, storeCode3, companyCode, taxReportCode, reportCode, deleteCode, shrinkPctCost, shrinkRetailPct, departments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Division {\n");
    
    sb.append("    divisionNbr: ").append(toIndentedString(divisionNbr)).append("\n");
    sb.append("    divisionDesc: ").append(toIndentedString(divisionDesc)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    subRegionCode: ").append(toIndentedString(subRegionCode)).append("\n");
    sb.append("    marketCode: ").append(toIndentedString(marketCode)).append("\n");
    sb.append("    baseDivisionCode: ").append(toIndentedString(baseDivisionCode)).append("\n");
    sb.append("    subDivisionCode: ").append(toIndentedString(subDivisionCode)).append("\n");
    sb.append("    subDivisionName: ").append(toIndentedString(subDivisionName)).append("\n");
    sb.append("    businessUnitOrgAreaCode: ").append(toIndentedString(businessUnitOrgAreaCode)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
    sb.append("    storeCode3: ").append(toIndentedString(storeCode3)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    taxReportCode: ").append(toIndentedString(taxReportCode)).append("\n");
    sb.append("    reportCode: ").append(toIndentedString(reportCode)).append("\n");
    sb.append("    deleteCode: ").append(toIndentedString(deleteCode)).append("\n");
    sb.append("    shrinkPctCost: ").append(toIndentedString(shrinkPctCost)).append("\n");
    sb.append("    shrinkRetailPct: ").append(toIndentedString(shrinkRetailPct)).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments)).append("\n");
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

