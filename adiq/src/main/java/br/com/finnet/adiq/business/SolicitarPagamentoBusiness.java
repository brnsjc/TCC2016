package br.com.finnet.adiq.business;

import java.util.Objects;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.EntityResponse;

import br.com.finnet.adiq.feign.client.CancelarPagamento;
import br.com.finnet.adiq.feign.client.ConsultarPagamento;
import br.com.finnet.adiq.feign.client.SolicitarPagamento;
import br.com.finnet.adiq.response.CancelarPagamentoResponse;
import br.com.finnet.adiq.response.ConsultaPagamentoResponse;
import br.com.finnet.adiq.response.PagamentoResponse;

@Component
public class SolicitarPagamentoBusiness {
	
	private SolicitarPagamento solicitarPagamento;
	private ConsultarPagamento consultarPagamento;
	private CancelarPagamento cancelarPagamento;
	
	public PagamentoResponse solicitarPagamento() {
		
		PagamentoResponse pagamento = new PagamentoResponse();
		
		return solicitarPagamento.solicitarPagamento(pagamento);
		
	}
	
	public ConsultaPagamentoResponse consultarPagamento(Long id) {
		
		return consultarPagamento.solicitarPagamento(id);
	}
	
	public CancelarPagamento cancelarPagamento(long id, 
			long idCancelamento, long idCancelamentoHeader) {
	
		return cancelarPagamento.cancelarPagamento(id, idCancelamento, idCancelamentoHeader);
		
		
		
	}
}
