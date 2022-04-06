/*
 * InfluxDB OSS API Service
 * The InfluxDB v2 API provides a programmatic interface for all interactions with InfluxDB. Access the InfluxDB API using the `/api/v2/` endpoint. 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.Identifier;
import com.influxdb.client.domain.StringLiteral;
import java.io.IOException;

/**
 * Declares a package import
 */

public class ImportDeclaration {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AS = "as";
  @SerializedName(SERIALIZED_NAME_AS)
  private Identifier as = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private StringLiteral path = null;

  public ImportDeclaration type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of AST node
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ImportDeclaration as(Identifier as) {
    this.as = as;
    return this;
  }

   /**
   * Get as
   * @return as
  **/
  public Identifier getAs() {
    return as;
  }

  public void setAs(Identifier as) {
    this.as = as;
  }

  public ImportDeclaration path(StringLiteral path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  public StringLiteral getPath() {
    return path;
  }

  public void setPath(StringLiteral path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDeclaration importDeclaration = (ImportDeclaration) o;
    return Objects.equals(this.type, importDeclaration.type) &&
        Objects.equals(this.as, importDeclaration.as) &&
        Objects.equals(this.path, importDeclaration.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, as, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDeclaration {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    as: ").append(toIndentedString(as)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

