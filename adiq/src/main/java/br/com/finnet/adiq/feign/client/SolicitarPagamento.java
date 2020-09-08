package br.com.finnet.adiq.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.finnet.adiq.response.PagamentoResponse;

@FeignClient(name = "payment", url = "https://ecommerce-hml.adiq.io")
public interface SolicitarPagamento {
	
	@PostMapping(value = "/v1/payments")
	public PagamentoResponse solicitarPagamento(@RequestBody PagamentoResponse pagamento);

}
