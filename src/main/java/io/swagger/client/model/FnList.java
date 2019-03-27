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
import io.swagger.client.model.Fn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FnList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-27T15:47:31.669Z")
public class FnList {
  @SerializedName("next_cursor")
  private String nextCursor = null;

  @SerializedName("items")
  private List<Fn> items = new ArrayList<Fn>();

   /**
   * Cursor to send with subsequent request to receive the next page, if non-empty.
   * @return nextCursor
  **/
  @ApiModelProperty(value = "Cursor to send with subsequent request to receive the next page, if non-empty.")
  public String getNextCursor() {
    return nextCursor;
  }

  public FnList items(List<Fn> items) {
    this.items = items;
    return this;
  }

  public FnList addItemsItem(Fn itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Fn> getItems() {
    return items;
  }

  public void setItems(List<Fn> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FnList fnList = (FnList) o;
    return Objects.equals(this.nextCursor, fnList.nextCursor) &&
        Objects.equals(this.items, fnList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextCursor, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FnList {\n");
    
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

