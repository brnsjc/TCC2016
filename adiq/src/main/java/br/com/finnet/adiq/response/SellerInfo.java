
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
    "orderNumber",
    "softDescriptor",
    "dynamicMcc",
    "urlSite3DS",
    "code3DS",
    "cavvUcaf",
    "eci",
    "xid",
    "programProtocol"
})
public class SellerInfo {

    @JsonProperty("orderNumber")
    private String orderNumber;
    @JsonProperty("softDescriptor")
    private String softDescriptor;
    @JsonProperty("dynamicMcc")
    private Integer dynamicMcc;
    @JsonProperty("urlSite3DS")
    private String urlSite3DS;
    @JsonProperty("code3DS")
    private String code3DS;
    @JsonProperty("cavvUcaf")
    private String cavvUcaf;
    @JsonProperty("eci")
    private String eci;
    @JsonProperty("xid")
    private String xid;
    @JsonProperty("programProtocol")
    private String programProtocol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("softDescriptor")
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    @JsonProperty("softDescriptor")
    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    @JsonProperty("dynamicMcc")
    public Integer getDynamicMcc() {
        return dynamicMcc;
    }

    @JsonProperty("dynamicMcc")
    public void setDynamicMcc(Integer dynamicMcc) {
        this.dynamicMcc = dynamicMcc;
    }

    @JsonProperty("urlSite3DS")
    public String getUrlSite3DS() {
        return urlSite3DS;
    }

    @JsonProperty("urlSite3DS")
    public void setUrlSite3DS(String urlSite3DS) {
        this.urlSite3DS = urlSite3DS;
    }

    @JsonProperty("code3DS")
    public String getCode3DS() {
        return code3DS;
    }

    @JsonProperty("code3DS")
    public void setCode3DS(String code3DS) {
        this.code3DS = code3DS;
    }

    @JsonProperty("cavvUcaf")
    public String getCavvUcaf() {
        return cavvUcaf;
    }

    @JsonProperty("cavvUcaf")
    public void setCavvUcaf(String cavvUcaf) {
        this.cavvUcaf = cavvUcaf;
    }

    @JsonProperty("eci")
    public String getEci() {
        return eci;
    }

    @JsonProperty("eci")
    public void setEci(String eci) {
        this.eci = eci;
    }

    @JsonProperty("xid")
    public String getXid() {
        return xid;
    }

    @JsonProperty("xid")
    public void setXid(String xid) {
        this.xid = xid;
    }

    @JsonProperty("programProtocol")
    public String getProgramProtocol() {
        return programProtocol;
    }

    @JsonProperty("programProtocol")
    public void setProgramProtocol(String programProtocol) {
        this.programProtocol = programProtocol;
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
