package br.com.finnet.adiq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import br.com.finnet.adiq.business.SolicitarPagamentoBusiness;
import br.com.finnet.adiq.feign.client.CancelarPagamento;
import br.com.finnet.adiq.response.CancelarPagamentoResponse;
import br.com.finnet.adiq.response.ConsultaPagamentoResponse;
import br.com.finnet.adiq.response.PagamentoResponse;

@Service
public class PagamentoService {

	@Autowired
	SolicitarPagamentoBusiness pagamentoBusiness;
	
	public PagamentoResponse solicitarPagamento() {
		
		return pagamentoBusiness.solicitarPagamento();
	}
	
	public ConsultaPagamentoResponse consultarPagamento(long id) {
		
		return pagamentoBusiness.consultarPagamento(id);
		
	}
	
	public CancelarPagamento cancelarPagamento(long id, 
			long idCancelamento, long idCancelamentoHeader) {
		
				return pagamentoBusiness.cancelarPagamento(id, idCancelamento, idCancelamentoHeader);
		
		
	}
	
}
