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
"paymentId",
"statusDescription",
"transactionDate"
})
public class ConsultaPagamentoResponse {

	@JsonProperty("paymentId")
	private String paymentId;
	@JsonProperty("statusDescription")
	private String statusDescription;
	@JsonProperty("transactionDate")
	private String transactionDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("paymentId")
	public String getPaymentId() {
	return paymentId;
	}

	@JsonProperty("paymentId")
	public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
	}

	@JsonProperty("statusDescription")
	public String getStatusDescription() {
	return statusDescription;
	}

	@JsonProperty("statusDescription")
	public void setStatusDescription(String statusDescription) {
	this.statusDescription = statusDescription;
	}

	@JsonProperty("transactionDate")
	public String getTransactionDate() {
	return transactionDate;
	}

	@JsonProperty("transactionDate")
	public void setTransactionDate(String transactionDate) {
	this.transactionDate = transactionDate;
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
