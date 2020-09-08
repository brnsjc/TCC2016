
package br.com.finnet.adiq.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "documentType",
    "documentNumber",
    "firstName",
    "lastName",
    "email",
    "phoneNumber",
    "mobilePhoneNumber",
    "address",
    "complement",
    "city",
    "state",
    "zipCode",
    "ipAddress",
    "country"
})
public class Customer {

    @JsonProperty("documentType")
    private String documentType;
    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("mobilePhoneNumber")
    private String mobilePhoneNumber;
    @JsonProperty("address")
    private String address;
    @JsonProperty("complement")
    private String complement;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("ipAddress")
    private String ipAddress;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("documentType")
    public String getDocumentType() {
        return documentType;
    }

    @JsonProperty("documentType")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("mobilePhoneNumber")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @JsonProperty("mobilePhoneNumber")
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("complement")
    public String getComplement() {
        return complement;
    }

    @JsonProperty("complement")
    public void setComplement(String complement) {
        this.complement = complement;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("ipAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
