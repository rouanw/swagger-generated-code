package io.swagger.client.model;

import io.swagger.client.model.View;
import java.util.Map;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ModelAndView  {
  
  @SerializedName("empty")
  private Boolean empty = null;
  @SerializedName("model")
  private Object model = null;
  @SerializedName("modelMap")
  private Map<String, Object> modelMap = null;
  @SerializedName("reference")
  private Boolean reference = null;
  @SerializedName("view")
  private View view = null;
  @SerializedName("viewName")
  private String viewName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getModelMap() {
    return modelMap;
  }
  public void setModelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("  empty: ").append(empty).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  modelMap: ").append(modelMap).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  view: ").append(view).append("\n");
    sb.append("  viewName: ").append(viewName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
