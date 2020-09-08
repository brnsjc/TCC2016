package br.com.finnet.adiq.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "payment-cancelar", url = "https://ecommerce-hml.adiq.io")
public interface CancelarPagamento {

	@PutMapping(value = "/v1/payments/{paymentId}/cancel")
	public CancelarPagamento cancelarPagamento(@PathVariable(value = "idCancelamento") long id, 
			@RequestParam(value="idCancelamento", required=false) long idCancelamento,
			@RequestHeader(value="idCancelamento", required=false) long idCancelamentoHeader);
}
