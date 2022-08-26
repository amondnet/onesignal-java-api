/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * DeletePlayerBadRequestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T22:09:10.481Z[Etc/UTC]")
public class DeletePlayerBadRequestResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ERORRS = "erorrs";
  @SerializedName(SERIALIZED_NAME_ERORRS)
  private List<Boolean> erorrs = null;

  public DeletePlayerBadRequestResponse() { 
  }

  public DeletePlayerBadRequestResponse erorrs(List<Boolean> erorrs) {
    
    this.erorrs = erorrs;
    return this;
  }

  public DeletePlayerBadRequestResponse addErorrsItem(Boolean erorrsItem) {
    if (this.erorrs == null) {
      this.erorrs = new ArrayList<>();
    }
    this.erorrs.add(erorrsItem);
    return this;
  }

   /**
   * Get erorrs
   * @return erorrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Boolean> getErorrs() {
    return erorrs;
  }


  public void setErorrs(List<Boolean> erorrs) {
    this.erorrs = erorrs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePlayerBadRequestResponse deletePlayerBadRequestResponse = (DeletePlayerBadRequestResponse) o;
    return Objects.equals(this.erorrs, deletePlayerBadRequestResponse.erorrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erorrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePlayerBadRequestResponse {\n");
    sb.append("    erorrs: ").append(toIndentedString(erorrs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("erorrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeletePlayerBadRequestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeletePlayerBadRequestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeletePlayerBadRequestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeletePlayerBadRequestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeletePlayerBadRequestResponse>() {
           @Override
           public void write(JsonWriter out, DeletePlayerBadRequestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeletePlayerBadRequestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeletePlayerBadRequestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeletePlayerBadRequestResponse
  * @throws IOException if the JSON string is invalid with respect to DeletePlayerBadRequestResponse
  */
  public static DeletePlayerBadRequestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeletePlayerBadRequestResponse.class);
  }

 /**
  * Convert an instance of DeletePlayerBadRequestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

