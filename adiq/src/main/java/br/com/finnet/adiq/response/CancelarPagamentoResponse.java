
package br.com.finnet.adiq.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "sellers",
    "merchantId"
})
public class CancelarPagamentoResponse {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("sellers")
    private List<Seller> sellers = null;
    @JsonProperty("merchantId")
    private String merchantId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("sellers")
    public List<Seller> getSellers() {
        return sellers;
    }

    @JsonProperty("sellers")
    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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
