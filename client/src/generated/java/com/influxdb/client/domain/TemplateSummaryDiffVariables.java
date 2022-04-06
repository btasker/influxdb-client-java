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
import com.influxdb.client.domain.TemplateKind;
import com.influxdb.client.domain.TemplateSummaryDiffVariablesNewOld;
import java.io.IOException;

/**
 * TemplateSummaryDiffVariables
 */

public class TemplateSummaryDiffVariables {
  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private TemplateKind kind = null;

  public static final String SERIALIZED_NAME_STATE_STATUS = "stateStatus";
  @SerializedName(SERIALIZED_NAME_STATE_STATUS)
  private String stateStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEMPLATE_META_NAME = "templateMetaName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_META_NAME)
  private String templateMetaName;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private TemplateSummaryDiffVariablesNewOld _new = null;

  public static final String SERIALIZED_NAME_OLD = "old";
  @SerializedName(SERIALIZED_NAME_OLD)
  private TemplateSummaryDiffVariablesNewOld old = null;

  public TemplateSummaryDiffVariables kind(TemplateKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  public TemplateKind getKind() {
    return kind;
  }

  public void setKind(TemplateKind kind) {
    this.kind = kind;
  }

  public TemplateSummaryDiffVariables stateStatus(String stateStatus) {
    this.stateStatus = stateStatus;
    return this;
  }

   /**
   * Get stateStatus
   * @return stateStatus
  **/
  public String getStateStatus() {
    return stateStatus;
  }

  public void setStateStatus(String stateStatus) {
    this.stateStatus = stateStatus;
  }

  public TemplateSummaryDiffVariables id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TemplateSummaryDiffVariables templateMetaName(String templateMetaName) {
    this.templateMetaName = templateMetaName;
    return this;
  }

   /**
   * Get templateMetaName
   * @return templateMetaName
  **/
  public String getTemplateMetaName() {
    return templateMetaName;
  }

  public void setTemplateMetaName(String templateMetaName) {
    this.templateMetaName = templateMetaName;
  }

  public TemplateSummaryDiffVariables _new(TemplateSummaryDiffVariablesNewOld _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  public TemplateSummaryDiffVariablesNewOld getNew() {
    return _new;
  }

  public void setNew(TemplateSummaryDiffVariablesNewOld _new) {
    this._new = _new;
  }

  public TemplateSummaryDiffVariables old(TemplateSummaryDiffVariablesNewOld old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  public TemplateSummaryDiffVariablesNewOld getOld() {
    return old;
  }

  public void setOld(TemplateSummaryDiffVariablesNewOld old) {
    this.old = old;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSummaryDiffVariables templateSummaryDiffVariables = (TemplateSummaryDiffVariables) o;
    return Objects.equals(this.kind, templateSummaryDiffVariables.kind) &&
        Objects.equals(this.stateStatus, templateSummaryDiffVariables.stateStatus) &&
        Objects.equals(this.id, templateSummaryDiffVariables.id) &&
        Objects.equals(this.templateMetaName, templateSummaryDiffVariables.templateMetaName) &&
        Objects.equals(this._new, templateSummaryDiffVariables._new) &&
        Objects.equals(this.old, templateSummaryDiffVariables.old);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, stateStatus, id, templateMetaName, _new, old);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSummaryDiffVariables {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    stateStatus: ").append(toIndentedString(stateStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateMetaName: ").append(toIndentedString(templateMetaName)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
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

