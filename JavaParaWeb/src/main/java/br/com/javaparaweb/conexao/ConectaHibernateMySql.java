package br.com.javaparaweb.conexao;

import  org.hibernate.Session;

public class ConectaHibernateMySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session sessao = null;
		sessao = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Conectou 666 !");
		sessao.close();
	}
}
