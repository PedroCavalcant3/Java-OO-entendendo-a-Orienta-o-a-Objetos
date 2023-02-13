
public class CriaConta {
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(50);
		System.out.println(contaDoPedro.saldo);
		Conta contaDoRiva = new Conta();
		contaDoRiva.deposita(1000);
		System.out.println(contaDoRiva.saldo);
		contaDoPedro.saca(20);
		System.out.println(contaDoPedro.saldo);
		contaDoRiva.transfere(400, contaDoPedro);
		System.out.println(contaDoRiva.saldo);
		System.out.println(contaDoPedro.saldo);
		
	}

}
