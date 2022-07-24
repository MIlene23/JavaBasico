package aula8;

public class servico {

    public static void main(String[] args) {

        Pessoa pFisica = new Pessoa();

        pFisica.setTipoDocumento.valueOf(TipoDocumento.class, "CPF");
        pFisica.setNumeroDocumento(pFisica.getTipoDocumento().gerarNumeroTeste());

        System.out.println(pFisica);

        pJuridica.setTipoDocumento.valueOf(TipoDocumento.class, "CNPJ");
        pJuridica.setNumeroDocumento(pJuridica.getTipoDocumento().gerarNumeroTeste);
        System.out.println(pJuridica);
    }

}