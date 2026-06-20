package services;

import java.util.ArrayList;
import java.util.List;

import entities.Transacao;

public class GerenciadorFinanceiro {

	 private List<Transacao> listaDeTransacoes = new ArrayList<>();
	
	 
	 public void adicionarTransacao(Transacao transacao) {
		 listaDeTransacoes.add(transacao); 
	 }
	 
	 
	 public void listarTransacoes() {
		 
		 if(listaDeTransacoes.isEmpty()) {
			 System.out.println("Nenhuma transacao cadastrada. ");
			 return;
			 
		 }
		 
		 for(Transacao t : listaDeTransacoes) {
			 
			 System.out.println("------------------------");
			 System.out.println("Descricao: " + t.getDescricao());
			 System.out.println("Valor: " + t.getValor());
			 System.out.println("Tipo: " + t.getTipo());
			 System.out.println("Categoria: " + t.getCategoria());
			 
	 
			 
		 }
		 
	 }
	 
	 public double calcularSaldo() {
		 
		 double saldo = 0.0;
		 
		 
		 for(Transacao t : listaDeTransacoes) {
			 
			 
			 if(t.getTipo().equalsIgnoreCase("Receita")) {
				 saldo += t.getValor();
				 
			 }else {
				 saldo -= t.getValor();
			 }
		 }
		 
		 
		 return saldo;
		 
	 }
	 
	 public double totalReceitas() {
		 
		 
		 double total = 0.0;
		 
		 
		 for(Transacao t :listaDeTransacoes) {
			 
			 
			 if(t.getTipo().equalsIgnoreCase("RECEITA")) {
				 total += t.getValor();
			 }
		 }
		 return total;
	 }
	 
	 public double totalDespesas() {
		 
		 double total = 0.0;
		 
		 
		 for(Transacao t : listaDeTransacoes) {
			 total += t.getValor();
		 }
		 return total;
	 }
	 
	 public void buscarPorCategoria(String categoria) {
		 
		 boolean encontrou = false;
		 
		 for(Transacao t : listaDeTransacoes) {
			 
			 if(t.getCategoria().equalsIgnoreCase(categoria)) {
				 
				 System.out.println("-----------------------");
				 System.out.println("Descricao: " + t.getDescricao());
				 System.out.println("Valor: " + t.getValor());
				 System.out.println("Tipo: " + t.getTipo());
				 System.out.println("Categoria:  " + t.getCategoria());
				 
				 
				 encontrou = true;
			 }
		 }
		 
		 if(!encontrou) {
			 System.out.println("Nenhuma transacao encontrada.");
		 }
	 }
	 
	 public void removerPorDescricao(String descricao) {
		 
		 
		 Transacao removida = null;
		 
		 for(Transacao t : listaDeTransacoes) {
			 
			 
			 if(t.getDescricao().equalsIgnoreCase(descricao)) {
				 removida = t;
				 break;
			 }
		 }
	 
	 if(removida != null) {
		 
		 listaDeTransacoes.remove(removida);
		 System.out.println("Transação removida com sucesso!");
	 }else {
		 
		 System.out.println("Transação não encontrada");
	 }
	 
	 }
	
}
