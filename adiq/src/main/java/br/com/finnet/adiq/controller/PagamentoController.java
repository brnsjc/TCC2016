package br.com.finnet.adiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.finnet.adiq.feign.client.CancelarPagamento;
import br.com.finnet.adiq.response.CancelarPagamentoResponse;
import br.com.finnet.adiq.response.ConsultaPagamentoResponse;
import br.com.finnet.adiq.response.PagamentoResponse;
import br.com.finnet.adiq.service.PagamentoService;
import feign.Headers;
import feign.Param;

@RestController(value = "pagamento")
@Controller(value = "/api/v1")
public class PagamentoController {
	
	@Autowired
	PagamentoService pagamentoService;
	
	@PostMapping(value = "/solicitar-pagamento")
	public PagamentoResponse solicitarPagamento(){
		
		return pagamentoService.solicitarPagamento();
		
		//EntityResponse<PagamentoResponse>;
	}
	
	@GetMapping(value = "/consultar-pagamento/{id}")
	public ConsultaPagamentoResponse consultarPagamento(@PathVariable long id){
		
		return pagamentoService.consultarPagamento(id);
		
	}
	@PutMapping(value = "/cancelar-pagamento/{idCancelamento}")
	public CancelarPagamento cancelarPagamento(@PathVariable(value = "idCancelamento") long id, 
			@RequestParam(value="idCancelamento", required=false) long idCancelamento,
			@RequestHeader(value="idCancelamento", required=false) long idCancelamentoHeader) {
		
		
		return pagamentoService.cancelarPagamento(id,idCancelamento,idCancelamentoHeader);
				
	}

}
