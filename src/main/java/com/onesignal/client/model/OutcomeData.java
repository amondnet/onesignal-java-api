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
 * OutcomeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T22:09:10.481Z[Etc/UTC]")
public class OutcomeData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  /**
   * Gets or Sets aggregation
   */
  @JsonAdapter(AggregationEnum.Adapter.class)
  public enum AggregationEnum {
    SUM("sum"),
    
    COUNT("count");

    private String value;

    AggregationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AggregationEnum fromValue(String value) {
      for (AggregationEnum b : AggregationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AggregationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AggregationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AggregationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private AggregationEnum aggregation;

  public OutcomeData() { 
  }

  public OutcomeData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OutcomeData value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  public OutcomeData aggregation(AggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeData outcomeData = (OutcomeData) o;
    return Objects.equals(this.id, outcomeData.id) &&
        Objects.equals(this.value, outcomeData.value) &&
        Objects.equals(this.aggregation, outcomeData.aggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, aggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("value");
    openapiFields.add("aggregation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("aggregation");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutcomeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutcomeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutcomeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutcomeData.class));

       return (TypeAdapter<T>) new TypeAdapter<OutcomeData>() {
           @Override
           public void write(JsonWriter out, OutcomeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutcomeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutcomeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutcomeData
  * @throws IOException if the JSON string is invalid with respect to OutcomeData
  */
  public static OutcomeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutcomeData.class);
  }

 /**
  * Convert an instance of OutcomeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

