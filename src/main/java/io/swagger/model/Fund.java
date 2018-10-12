package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Fund
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T18:54:41.253Z")
@Entity
@Getter
@Setter
public class Fund implements Serializable {
  @JsonProperty("id")
  @Id
//  @GeneratedValue
  private Integer id ;

  @JsonProperty("fundName")
  @Size(min=3, message="FundName should have atleast 3 characters")
  @ApiModelProperty(notes="FundName should have atleast 3 characters")
  @Column(unique = true)
  private String fundName ;


  @JsonProperty("categoryId")
  @NotNull
  private Integer categoryId ;

  @Size(min=3, message="FundManagerName should have atleast 3 characters")
  @ApiModelProperty(notes="FundManagerName should have atleast 3 characters")
  @JsonProperty("fundMangerName")
  private String fundMangerName ;

  @Size(min=3, message="LongName should have atleast 3 characters")
  @ApiModelProperty(notes="LongName should have atleast 3 characters")
  @JsonProperty("longName")
  private String longName ;

  @Size(min=3, message="ShortName should have atleast 3 characters")
  @ApiModelProperty(notes="ShortName should have atleast 3 characters")
  @JsonProperty("shortName")
  private String shortName ;

  @JsonProperty("cusipID")
  private String cusipID ;

//  public Fund id(Integer id) {
//    this.id = id;
//    return this;
//  }
//
//  /**
//   * Get id
//   * @return id
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public Integer getId() {
//    return id;
//  }
//
//  public void setId(Integer id) {
//    this.id = id;
//  }
//
//  public Fund fundName(String fundName) {
//    this.fundName = fundName;
//    return this;
//  }
//
//  /**
//   * Get fundName
//   * @return fundName
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public String getFundName() {
//    return fundName;
//  }
//
//  public void setFundName(String fundName) {
//    this.fundName = fundName;
//  }
//
//  public Fund categoryId(Integer categoryId) {
//    this.categoryId = categoryId;
//    return this;
//  }
//
//  /**
//   * Get categoryId
//   * @return categoryId
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public Integer getCategoryId() {
//    return categoryId;
//  }
//
//  public void setCategoryId(Integer categoryId) {
//    this.categoryId = categoryId;
//  }
//
//  public Fund fundMangerName(String fundMangerName) {
//    this.fundMangerName = fundMangerName;
//    return this;
//  }
//
//  /**
//   * Get fundMangerName
//   * @return fundMangerName
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public String getFundMangerName() {
//    return fundMangerName;
//  }
//
//  public void setFundMangerName(String fundMangerName) {
//    this.fundMangerName = fundMangerName;
//  }
//
//  public Fund longName(String longName) {
//    this.longName = longName;
//    return this;
//  }
//
//  /**
//   * Get longName
//   * @return longName
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public String getLongName() {
//    return longName;
//  }
//
//  public void setLongName(String longName) {
//    this.longName = longName;
//  }
//
//  public Fund shortName(String shortName) {
//    this.shortName = shortName;
//    return this;
//  }
//
//  /**
//   * Get shortName
//   * @return shortName
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public String getShortName() {
//    return shortName;
//  }
//
//  public void setShortName(String shortName) {
//    this.shortName = shortName;
//  }
//
//  public Fund cusipID(String cusipID) {
//    this.cusipID = cusipID;
//    return this;
//  }
//
//  /**
//   * Get cusipID
//   * @return cusipID
//  **/
//  @ApiModelProperty(value = "")
//
//
//  public String getCusipID() {
//    return cusipID;
//  }
//
//  public void setCusipID(String cusipID) {
//    this.cusipID = cusipID;
//  }
//
//
//  @Override
//  public boolean equals(java.lang.Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    Fund fund = (Fund) o;
//    return Objects.equals(this.id, fund.id) &&
//        Objects.equals(this.fundName, fund.fundName) &&
//        Objects.equals(this.categoryId, fund.categoryId) &&
//        Objects.equals(this.fundMangerName, fund.fundMangerName) &&
//        Objects.equals(this.longName, fund.longName) &&
//        Objects.equals(this.shortName, fund.shortName) &&
//        Objects.equals(this.cusipID, fund.cusipID);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(id, fundName, categoryId, fundMangerName, longName, shortName, cusipID);
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class Fund {\n");
//
//    sb.append("    id: ").append(toIndentedString(id)).append("\n");
//    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
//    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
//    sb.append("    fundMangerName: ").append(toIndentedString(fundMangerName)).append("\n");
//    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
//    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
//    sb.append("    cusipID: ").append(toIndentedString(cusipID)).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }
//
//  /**
//   * Convert the given object to string with each line indented by 4 spaces
//   * (except the first line).
//   */
//  private String toIndentedString(java.lang.Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
}

