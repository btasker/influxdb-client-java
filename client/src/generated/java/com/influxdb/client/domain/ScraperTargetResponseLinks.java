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
 * ScraperTargetResponseLinks
 */

public class ScraperTargetResponseLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private String members;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private String owners;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

   /**
   * URI of resource.
   * @return self
  **/
  public String getSelf() {
    return self;
  }

   /**
   * URI of resource.
   * @return members
  **/
  public String getMembers() {
    return members;
  }

   /**
   * URI of resource.
   * @return owners
  **/
  public String getOwners() {
    return owners;
  }

   /**
   * URI of resource.
   * @return bucket
  **/
  public String getBucket() {
    return bucket;
  }

   /**
   * URI of resource.
   * @return organization
  **/
  public String getOrganization() {
    return organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScraperTargetResponseLinks scraperTargetResponseLinks = (ScraperTargetResponseLinks) o;
    return Objects.equals(this.self, scraperTargetResponseLinks.self) &&
        Objects.equals(this.members, scraperTargetResponseLinks.members) &&
        Objects.equals(this.owners, scraperTargetResponseLinks.owners) &&
        Objects.equals(this.bucket, scraperTargetResponseLinks.bucket) &&
        Objects.equals(this.organization, scraperTargetResponseLinks.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, members, owners, bucket, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScraperTargetResponseLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

