package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Animal  {
  
  @SerializedName("noise")
  private String noise = null;
  @SerializedName("species")
  private String species = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNoise() {
    return noise;
  }
  public void setNoise(String noise) {
    this.noise = noise;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSpecies() {
    return species;
  }
  public void setSpecies(String species) {
    this.species = species;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    
    sb.append("  noise: ").append(noise).append("\n");
    sb.append("  species: ").append(species).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
