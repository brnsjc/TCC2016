package br.com.finnet.adiq.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.finnet.adiq.response.ConsultaPagamentoResponse;

@FeignClient(name = "payment-consulta", url = "https://ecommerce-hml.adiq.io")
public interface ConsultarPagamento {

	@GetMapping(value = "/v1/payments/{paymentId}")
	public ConsultaPagamentoResponse solicitarPagamento(@RequestParam Long paymentId);
}
