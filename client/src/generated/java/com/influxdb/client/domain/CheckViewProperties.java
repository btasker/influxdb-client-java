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
import com.influxdb.client.domain.Check;
import com.influxdb.client.domain.DashboardColor;
import com.influxdb.client.domain.DashboardQuery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckViewProperties
 */

public class CheckViewProperties extends ViewProperties {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CHECK("check");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.CHECK;

  /**
   * Gets or Sets shape
   */
  @JsonAdapter(ShapeEnum.Adapter.class)
  public enum ShapeEnum {
    CHRONOGRAF_V2("chronograf-v2");

    private String value;

    ShapeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShapeEnum fromValue(String text) {
      for (ShapeEnum b : ShapeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShapeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShapeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShapeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShapeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SHAPE = "shape";
  @SerializedName(SERIALIZED_NAME_SHAPE)
  private ShapeEnum shape = ShapeEnum.CHRONOGRAF_V2;

  public static final String SERIALIZED_NAME_CHECK_I_D = "checkID";
  @SerializedName(SERIALIZED_NAME_CHECK_I_D)
  private String checkID;

  public static final String SERIALIZED_NAME_CHECK = "check";
  @SerializedName(SERIALIZED_NAME_CHECK)
  private Check check = null;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<DashboardQuery> queries = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLORS = "colors";
  @SerializedName(SERIALIZED_NAME_COLORS)
  private List<DashboardColor> colors = new ArrayList<>();

  public static final String SERIALIZED_NAME_LEGEND_COLORIZE_ROWS = "legendColorizeRows";
  @SerializedName(SERIALIZED_NAME_LEGEND_COLORIZE_ROWS)
  private Boolean legendColorizeRows;

  public static final String SERIALIZED_NAME_LEGEND_HIDE = "legendHide";
  @SerializedName(SERIALIZED_NAME_LEGEND_HIDE)
  private Boolean legendHide;

  public static final String SERIALIZED_NAME_LEGEND_OPACITY = "legendOpacity";
  @SerializedName(SERIALIZED_NAME_LEGEND_OPACITY)
  private Float legendOpacity;

  public static final String SERIALIZED_NAME_LEGEND_ORIENTATION_THRESHOLD = "legendOrientationThreshold";
  @SerializedName(SERIALIZED_NAME_LEGEND_ORIENTATION_THRESHOLD)
  private Integer legendOrientationThreshold;

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

   /**
   * Get shape
   * @return shape
  **/
  public ShapeEnum getShape() {
    return shape;
  }

  public CheckViewProperties checkID(String checkID) {
    this.checkID = checkID;
    return this;
  }

   /**
   * Get checkID
   * @return checkID
  **/
  public String getCheckID() {
    return checkID;
  }

  public void setCheckID(String checkID) {
    this.checkID = checkID;
  }

  public CheckViewProperties check(Check check) {
    this.check = check;
    return this;
  }

   /**
   * Get check
   * @return check
  **/
  public Check getCheck() {
    return check;
  }

  public void setCheck(Check check) {
    this.check = check;
  }

  public CheckViewProperties queries(List<DashboardQuery> queries) {
    this.queries = queries;
    return this;
  }

  public CheckViewProperties addQueriesItem(DashboardQuery queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  public List<DashboardQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<DashboardQuery> queries) {
    this.queries = queries;
  }

  public CheckViewProperties colors(List<DashboardColor> colors) {
    this.colors = colors;
    return this;
  }

  public CheckViewProperties addColorsItem(DashboardColor colorsItem) {
    this.colors.add(colorsItem);
    return this;
  }

   /**
   * Colors define color encoding of data into a visualization
   * @return colors
  **/
  public List<DashboardColor> getColors() {
    return colors;
  }

  public void setColors(List<DashboardColor> colors) {
    this.colors = colors;
  }

  public CheckViewProperties legendColorizeRows(Boolean legendColorizeRows) {
    this.legendColorizeRows = legendColorizeRows;
    return this;
  }

   /**
   * Get legendColorizeRows
   * @return legendColorizeRows
  **/
  public Boolean getLegendColorizeRows() {
    return legendColorizeRows;
  }

  public void setLegendColorizeRows(Boolean legendColorizeRows) {
    this.legendColorizeRows = legendColorizeRows;
  }

  public CheckViewProperties legendHide(Boolean legendHide) {
    this.legendHide = legendHide;
    return this;
  }

   /**
   * Get legendHide
   * @return legendHide
  **/
  public Boolean getLegendHide() {
    return legendHide;
  }

  public void setLegendHide(Boolean legendHide) {
    this.legendHide = legendHide;
  }

  public CheckViewProperties legendOpacity(Float legendOpacity) {
    this.legendOpacity = legendOpacity;
    return this;
  }

   /**
   * Get legendOpacity
   * @return legendOpacity
  **/
  public Float getLegendOpacity() {
    return legendOpacity;
  }

  public void setLegendOpacity(Float legendOpacity) {
    this.legendOpacity = legendOpacity;
  }

  public CheckViewProperties legendOrientationThreshold(Integer legendOrientationThreshold) {
    this.legendOrientationThreshold = legendOrientationThreshold;
    return this;
  }

   /**
   * Get legendOrientationThreshold
   * @return legendOrientationThreshold
  **/
  public Integer getLegendOrientationThreshold() {
    return legendOrientationThreshold;
  }

  public void setLegendOrientationThreshold(Integer legendOrientationThreshold) {
    this.legendOrientationThreshold = legendOrientationThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckViewProperties checkViewProperties = (CheckViewProperties) o;
    return Objects.equals(this.type, checkViewProperties.type) &&
        Objects.equals(this.shape, checkViewProperties.shape) &&
        Objects.equals(this.checkID, checkViewProperties.checkID) &&
        Objects.equals(this.check, checkViewProperties.check) &&
        Objects.equals(this.queries, checkViewProperties.queries) &&
        Objects.equals(this.colors, checkViewProperties.colors) &&
        Objects.equals(this.legendColorizeRows, checkViewProperties.legendColorizeRows) &&
        Objects.equals(this.legendHide, checkViewProperties.legendHide) &&
        Objects.equals(this.legendOpacity, checkViewProperties.legendOpacity) &&
        Objects.equals(this.legendOrientationThreshold, checkViewProperties.legendOrientationThreshold) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shape, checkID, check, queries, colors, legendColorizeRows, legendHide, legendOpacity, legendOrientationThreshold, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckViewProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    checkID: ").append(toIndentedString(checkID)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    legendColorizeRows: ").append(toIndentedString(legendColorizeRows)).append("\n");
    sb.append("    legendHide: ").append(toIndentedString(legendHide)).append("\n");
    sb.append("    legendOpacity: ").append(toIndentedString(legendOpacity)).append("\n");
    sb.append("    legendOrientationThreshold: ").append(toIndentedString(legendOrientationThreshold)).append("\n");
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

