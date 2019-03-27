/*
 * fn
 * The open source serverless platform.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Trigger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-27T15:47:31.669Z")
public class Trigger {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("fn_id")
  private String fnId = null;

  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("annotations")
  private Map<String, Object> annotations = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

   /**
   * Unique Trigger identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Unique Trigger identifier.")
  public String getId() {
    return id;
  }

  public Trigger name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique name for this trigger, used to identify this trigger.
   * @return name
  **/
  @ApiModelProperty(value = "Unique name for this trigger, used to identify this trigger.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Trigger type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Class of trigger, e.g. schedule, http, queue
   * @return type
  **/
  @ApiModelProperty(value = "Class of trigger, e.g. schedule, http, queue")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Trigger source(String source) {
    this.source = source;
    return this;
  }

   /**
   * URI path for this trigger. e.g. &#x60;sayHello&#x60;, &#x60;say/hello&#x60;
   * @return source
  **/
  @ApiModelProperty(value = "URI path for this trigger. e.g. `sayHello`, `say/hello`")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

   /**
   * Opaque, unique Function identifier
   * @return fnId
  **/
  @ApiModelProperty(value = "Opaque, unique Function identifier")
  public String getFnId() {
    return fnId;
  }

   /**
   * Opaque, unique Application identifier
   * @return appId
  **/
  @ApiModelProperty(value = "Opaque, unique Application identifier")
  public String getAppId() {
    return appId;
  }

  public Trigger annotations(Map<String, Object> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Trigger putAnnotationsItem(String key, Object annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, Object>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Trigger annotations - this is a map of annotations attached to this trigger, keys must not exceed 128 bytes and must consist of non-whitespace printable ascii characters, and the seralized representation of individual values must not exeed 512 bytes.
   * @return annotations
  **/
  @ApiModelProperty(value = "Trigger annotations - this is a map of annotations attached to this trigger, keys must not exceed 128 bytes and must consist of non-whitespace printable ascii characters, and the seralized representation of individual values must not exeed 512 bytes.")
  public Map<String, Object> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, Object> annotations) {
    this.annotations = annotations;
  }

   /**
   * Time when trigger was created. Always in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Time when trigger was created. Always in UTC.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Most recent time that trigger was updated. Always in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Most recent time that trigger was updated. Always in UTC.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.id, trigger.id) &&
        Objects.equals(this.name, trigger.name) &&
        Objects.equals(this.type, trigger.type) &&
        Objects.equals(this.source, trigger.source) &&
        Objects.equals(this.fnId, trigger.fnId) &&
        Objects.equals(this.appId, trigger.appId) &&
        Objects.equals(this.annotations, trigger.annotations) &&
        Objects.equals(this.createdAt, trigger.createdAt) &&
        Objects.equals(this.updatedAt, trigger.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, source, fnId, appId, annotations, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trigger {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    fnId: ").append(toIndentedString(fnId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

