package aula8;

public class Pessoa {
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;

	//region Construtores
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento){
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	public Pessoa(){
		super();
	}
	////#endregion
}
    