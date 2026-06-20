package entities;

public class Transacao  	{


	private String descricao;
	private double valor;
	private String tipo;
	private String categoria;
	
	
	public Transacao(String descricao , double valor ,String tipo, String categoria) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
		this.categoria = categoria;
	}
	
	// Metodos GET(para ler) e SET (para modificar)
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
		
	
    public double getValor() {
    	return valor;
    }
    public void setValor(double valor) {
    	this.valor = valor;
    }
    public String getTipo() {
    	return tipo;
    }
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }
    
    
    public String getCategoria() {
    	return categoria;
    }
    
    public void setCategoria(String categoria) {
    	this.categoria = categoria;
    }
    
}

