
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
    "transactionType",
    "amount",
    "currencyCode",
    "productType",
    "installments",
    "captureType",
    "recurrent"
})
public class Payment {

    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("productType")
    private String productType;
    @JsonProperty("installments")
    private Integer installments;
    @JsonProperty("captureType")
    private String captureType;
    @JsonProperty("recurrent")
    private Boolean recurrent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("installments")
    public Integer getInstallments() {
        return installments;
    }

    @JsonProperty("installments")
    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    @JsonProperty("captureType")
    public String getCaptureType() {
        return captureType;
    }

    @JsonProperty("captureType")
    public void setCaptureType(String captureType) {
        this.captureType = captureType;
    }

    @JsonProperty("recurrent")
    public Boolean getRecurrent() {
        return recurrent;
    }

    @JsonProperty("recurrent")
    public void setRecurrent(Boolean recurrent) {
        this.recurrent = recurrent;
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
