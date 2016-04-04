package org.wso2.carbon.appmgt.rest.api.publisher.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;






public class ErrorDTO {
  
  private Long code = null;
  private String message = null;
  private String description = null;
  private String moreInfo = null;
  private List<ErrorListItemDTO> error = new ArrayList<ErrorListItemDTO>();

  
  /**
   **/
  public ErrorDTO code(Long code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public Long getCode() {
    return code;
  }
  public void setCode(Long code) {
    this.code = code;
  }

  
  /**
   * Error message.
   **/
  public ErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * A detail description about the error message.\n
   **/
  public ErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A detail description about the error message.\n")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Preferably an url with more details about the error.\n
   **/
  public ErrorDTO moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  
  @ApiModelProperty(value = "Preferably an url with more details about the error.\n")
  @JsonProperty("moreInfo")
  public String getMoreInfo() {
    return moreInfo;
  }
  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  
  /**
   * If there are more than one error list them out. \nFor example, list out validation errors by each field.\n
   **/
  public ErrorDTO error(List<ErrorListItemDTO> error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(value = "If there are more than one error list them out. \nFor example, list out validation errors by each field.\n")
  @JsonProperty("error")
  public List<ErrorListItemDTO> getError() {
    return error;
  }
  public void setError(List<ErrorListItemDTO> error) {
    this.error = error;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDTO error = (ErrorDTO) o;
    return Objects.equals(code, error.code) &&
        Objects.equals(message, error.message) &&
        Objects.equals(description, error.description) &&
        Objects.equals(moreInfo, error.moreInfo) &&
        Objects.equals(error, error.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description, moreInfo, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
