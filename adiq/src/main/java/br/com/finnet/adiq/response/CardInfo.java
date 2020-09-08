
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
    "vaultId",
    "numberToken",
    "cardholderName",
    "securityCode",
    "brand",
    "expirationMonth",
    "expirationYear"
})
public class CardInfo {

    @JsonProperty("vaultId")
    private String vaultId;
    @JsonProperty("numberToken")
    private String numberToken;
    @JsonProperty("cardholderName")
    private String cardholderName;
    @JsonProperty("securityCode")
    private String securityCode;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("expirationMonth")
    private String expirationMonth;
    @JsonProperty("expirationYear")
    private String expirationYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vaultId")
    public String getVaultId() {
        return vaultId;
    }

    @JsonProperty("vaultId")
    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @JsonProperty("numberToken")
    public String getNumberToken() {
        return numberToken;
    }

    @JsonProperty("numberToken")
    public void setNumberToken(String numberToken) {
        this.numberToken = numberToken;
    }

    @JsonProperty("cardholderName")
    public String getCardholderName() {
        return cardholderName;
    }

    @JsonProperty("cardholderName")
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    @JsonProperty("securityCode")
    public String getSecurityCode() {
        return securityCode;
    }

    @JsonProperty("securityCode")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("expirationMonth")
    public String getExpirationMonth() {
        return expirationMonth;
    }

    @JsonProperty("expirationMonth")
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    @JsonProperty("expirationYear")
    public String getExpirationYear() {
        return expirationYear;
    }

    @JsonProperty("expirationYear")
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
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
