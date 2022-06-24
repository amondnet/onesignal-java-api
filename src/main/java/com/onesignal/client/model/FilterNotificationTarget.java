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
 * FilterNotificationTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T20:14:48.185Z[Etc/UTC]")
public class FilterNotificationTarget {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LAST_SESSION = "last_session";
  @SerializedName(SERIALIZED_NAME_LAST_SESSION)
  private String lastSession;

  public static final String SERIALIZED_NAME_FIRST_SESSION = "first_session";
  @SerializedName(SERIALIZED_NAME_FIRST_SESSION)
  private String firstSession;

  public static final String SERIALIZED_NAME_SESSION_COUNT = "session_count";
  @SerializedName(SERIALIZED_NAME_SESSION_COUNT)
  private String sessionCount;

  public static final String SERIALIZED_NAME_SESSION_TIME = "session_time";
  @SerializedName(SERIALIZED_NAME_SESSION_TIME)
  private String sessionTime;

  public static final String SERIALIZED_NAME_AMOUNT_SPENT = "amount_spent";
  @SerializedName(SERIALIZED_NAME_AMOUNT_SPENT)
  private String amountSpent;

  public static final String SERIALIZED_NAME_BOUGHT_SKU = "bought_sku";
  @SerializedName(SERIALIZED_NAME_BOUGHT_SKU)
  private String boughtSku;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public FilterNotificationTarget() { 
  }

  public FilterNotificationTarget lastSession(String lastSession) {
    
    this.lastSession = lastSession;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot; or \&quot;&lt;\&quot; hours_ago &#x3D; number of hours before or after the users last session. Example: \&quot;1.1\&quot; 
   * @return lastSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\" or \"<\" hours_ago = number of hours before or after the users last session. Example: \"1.1\" ")

  public String getLastSession() {
    return lastSession;
  }


  public void setLastSession(String lastSession) {
    this.lastSession = lastSession;
  }


  public FilterNotificationTarget firstSession(String firstSession) {
    
    this.firstSession = firstSession;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot; or \&quot;&lt;\&quot; hours_ago &#x3D; number of hours before or after the users first session. Example: \&quot;1.1\&quot; 
   * @return firstSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\" or \"<\" hours_ago = number of hours before or after the users first session. Example: \"1.1\" ")

  public String getFirstSession() {
    return firstSession;
  }


  public void setFirstSession(String firstSession) {
    this.firstSession = firstSession;
  }


  public FilterNotificationTarget sessionCount(String sessionCount) {
    
    this.sessionCount = sessionCount;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; number sessions. Example: \&quot;1\&quot; 
   * @return sessionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\", \"=\" or \"!=\" value = number sessions. Example: \"1\" ")

  public String getSessionCount() {
    return sessionCount;
  }


  public void setSessionCount(String sessionCount) {
    this.sessionCount = sessionCount;
  }


  public FilterNotificationTarget sessionTime(String sessionTime) {
    
    this.sessionTime = sessionTime;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; Time in seconds the user has been in your app. Example: \&quot;3600\&quot; 
   * @return sessionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\", \"=\" or \"!=\" value = Time in seconds the user has been in your app. Example: \"3600\" ")

  public String getSessionTime() {
    return sessionTime;
  }


  public void setSessionTime(String sessionTime) {
    this.sessionTime = sessionTime;
  }


  public FilterNotificationTarget amountSpent(String amountSpent) {
    
    this.amountSpent = amountSpent;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, or \&quot;&#x3D;\&quot; value &#x3D; Amount in USD a user has spent on IAP (In App Purchases). Example: \&quot;0.99\&quot; 
   * @return amountSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\", or \"=\" value = Amount in USD a user has spent on IAP (In App Purchases). Example: \"0.99\" ")

  public String getAmountSpent() {
    return amountSpent;
  }


  public void setAmountSpent(String amountSpent) {
    this.amountSpent = amountSpent;
  }


  public FilterNotificationTarget boughtSku(String boughtSku) {
    
    this.boughtSku = boughtSku;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot; or \&quot;&#x3D;\&quot; key &#x3D; SKU purchased in your app as an IAP (In App Purchases). Example: \&quot;com.domain.100coinpack\&quot; value &#x3D; value of SKU to compare to. Example: \&quot;0.99\&quot; 
   * @return boughtSku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\" or \"=\" key = SKU purchased in your app as an IAP (In App Purchases). Example: \"com.domain.100coinpack\" value = value of SKU to compare to. Example: \"0.99\" ")

  public String getBoughtSku() {
    return boughtSku;
  }


  public void setBoughtSku(String boughtSku) {
    this.boughtSku = boughtSku;
  }


  public FilterNotificationTarget tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;exists\&quot;, \&quot;not_exists\&quot;, \&quot;time_elapsed_gt\&quot; (paid plan only) or \&quot;time_elapsed_lt\&quot; (paid plan only) See Time Operators key &#x3D; Tag key to compare. value &#x3D; Tag value to compare. Not required for \&quot;exists\&quot; or \&quot;not_exists\&quot;. Example: See Formatting Filters 
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\", \"=\", \"!=\", \"exists\", \"not_exists\", \"time_elapsed_gt\" (paid plan only) or \"time_elapsed_lt\" (paid plan only) See Time Operators key = Tag key to compare. value = Tag value to compare. Not required for \"exists\" or \"not_exists\". Example: See Formatting Filters ")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public FilterNotificationTarget language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; 2 character language code. Example: \&quot;en\&quot;. For a list of all language codes see Language &amp; Localization. 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \"=\" or \"!=\" value = 2 character language code. Example: \"en\". For a list of all language codes see Language & Localization. ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public FilterNotificationTarget appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; app version. Example: \&quot;1.0.0\&quot; 
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \">\", \"<\", \"=\" or \"!=\" value = app version. Example: \"1.0.0\" ")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public FilterNotificationTarget location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * radius &#x3D; in meters lat &#x3D; latitude long &#x3D; longitude 
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "radius = in meters lat = latitude long = longitude ")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public FilterNotificationTarget email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * value &#x3D; email address Only for sending Push Notifications Use this for targeting push subscribers associated with an email set with all SDK setEmail methods To send emails to specific email addresses use include_email_tokens parameter 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "value = email address Only for sending Push Notifications Use this for targeting push subscribers associated with an email set with all SDK setEmail methods To send emails to specific email addresses use include_email_tokens parameter ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public FilterNotificationTarget country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * relation &#x3D; \&quot;&#x3D;\&quot; value &#x3D; 2-digit Country code Example: \&quot;field\&quot;: \&quot;country\&quot;, \&quot;relation\&quot;: \&quot;&#x3D;\&quot;, \&quot;value\&quot;, \&quot;US\&quot; 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "relation = \"=\" value = 2-digit Country code Example: \"field\": \"country\", \"relation\": \"=\", \"value\", \"US\" ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterNotificationTarget filterNotificationTarget = (FilterNotificationTarget) o;
    return Objects.equals(this.lastSession, filterNotificationTarget.lastSession) &&
        Objects.equals(this.firstSession, filterNotificationTarget.firstSession) &&
        Objects.equals(this.sessionCount, filterNotificationTarget.sessionCount) &&
        Objects.equals(this.sessionTime, filterNotificationTarget.sessionTime) &&
        Objects.equals(this.amountSpent, filterNotificationTarget.amountSpent) &&
        Objects.equals(this.boughtSku, filterNotificationTarget.boughtSku) &&
        Objects.equals(this.tag, filterNotificationTarget.tag) &&
        Objects.equals(this.language, filterNotificationTarget.language) &&
        Objects.equals(this.appVersion, filterNotificationTarget.appVersion) &&
        Objects.equals(this.location, filterNotificationTarget.location) &&
        Objects.equals(this.email, filterNotificationTarget.email) &&
        Objects.equals(this.country, filterNotificationTarget.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSession, firstSession, sessionCount, sessionTime, amountSpent, boughtSku, tag, language, appVersion, location, email, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterNotificationTarget {\n");
    sb.append("    lastSession: ").append(toIndentedString(lastSession)).append("\n");
    sb.append("    firstSession: ").append(toIndentedString(firstSession)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    sessionTime: ").append(toIndentedString(sessionTime)).append("\n");
    sb.append("    amountSpent: ").append(toIndentedString(amountSpent)).append("\n");
    sb.append("    boughtSku: ").append(toIndentedString(boughtSku)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("last_session");
    openapiFields.add("first_session");
    openapiFields.add("session_count");
    openapiFields.add("session_time");
    openapiFields.add("amount_spent");
    openapiFields.add("bought_sku");
    openapiFields.add("tag");
    openapiFields.add("language");
    openapiFields.add("app_version");
    openapiFields.add("location");
    openapiFields.add("email");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterNotificationTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterNotificationTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterNotificationTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterNotificationTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterNotificationTarget>() {
           @Override
           public void write(JsonWriter out, FilterNotificationTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterNotificationTarget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilterNotificationTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterNotificationTarget
  * @throws IOException if the JSON string is invalid with respect to FilterNotificationTarget
  */
  public static FilterNotificationTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterNotificationTarget.class);
  }

 /**
  * Convert an instance of FilterNotificationTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

