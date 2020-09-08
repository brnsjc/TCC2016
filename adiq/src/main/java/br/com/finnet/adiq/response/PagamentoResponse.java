
package br.com.finnet.adiq.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConstructorBinding;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payment",
    "cardInfo",
    "sellerInfo",
    "customer",
    "sellers"
})
@Data
@AllArgsConstructor
@ConstructorBinding
public class PagamentoResponse {

    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("cardInfo")
    private CardInfo cardInfo;
    @JsonProperty("sellerInfo")
    private SellerInfo sellerInfo;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("sellers")
    private List<Seller> sellers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @JsonProperty("cardInfo")
    public CardInfo getCardInfo() {
        return cardInfo;
    }

    @JsonProperty("cardInfo")
    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    @JsonProperty("sellerInfo")
    public SellerInfo getSellerInfo() {
        return sellerInfo;
    }

    @JsonProperty("sellerInfo")
    public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("sellers")
    public List<Seller> getSellers() {
        return sellers;
    }

    @JsonProperty("sellers")
    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
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
