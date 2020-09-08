
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
    "id",
    "description",
    "amount",
    "ratePercent",
    "rateAmount"
})
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("ratePercent")
    private Integer ratePercent;
    @JsonProperty("rateAmount")
    private Integer rateAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("ratePercent")
    public Integer getRatePercent() {
        return ratePercent;
    }

    @JsonProperty("ratePercent")
    public void setRatePercent(Integer ratePercent) {
        this.ratePercent = ratePercent;
    }

    @JsonProperty("rateAmount")
    public Integer getRateAmount() {
        return rateAmount;
    }

    @JsonProperty("rateAmount")
    public void setRateAmount(Integer rateAmount) {
        this.rateAmount = rateAmount;
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
