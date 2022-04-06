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
import java.io.IOException;

/**
 * RoutesSystem
 */

public class RoutesSystem {
  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private String metrics;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_HEALTH = "health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private String health;

  public RoutesSystem metrics(String metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  public String getMetrics() {
    return metrics;
  }

  public void setMetrics(String metrics) {
    this.metrics = metrics;
  }

  public RoutesSystem debug(String debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  public String getDebug() {
    return debug;
  }

  public void setDebug(String debug) {
    this.debug = debug;
  }

  public RoutesSystem health(String health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  public String getHealth() {
    return health;
  }

  public void setHealth(String health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutesSystem routesSystem = (RoutesSystem) o;
    return Objects.equals(this.metrics, routesSystem.metrics) &&
        Objects.equals(this.debug, routesSystem.debug) &&
        Objects.equals(this.health, routesSystem.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, debug, health);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesSystem {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

