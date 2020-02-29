package principiosegregacaointerfaceerrado;
public class PrincipioSegregacaoInterfaceErrado {
    public static void main(String[] args) {
    
        ClientePessoaFisica pessoaf01 = new ClientePessoaFisica("João Martins", "674.547.260-03");
        ClientePessoaJuridica pessoaj01 = new ClientePessoaJuridica("AVIVA LTDA", "67.117.913/0001-63");
        
        System.out.println("Nome PF: "+pessoaf01.getNome());
        System.out.println("CPF PF: "+pessoaf01.getCpf());
        
        System.out.println("Razão Social PJ: "+pessoaj01.getRazaoSocial());
        System.out.println("CNPJ PJ: "+pessoaj01.getCnpj());
        
    }
    
}
