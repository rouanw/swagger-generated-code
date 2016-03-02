package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class View  {
  
  @SerializedName("contentType")
  private String contentType = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
