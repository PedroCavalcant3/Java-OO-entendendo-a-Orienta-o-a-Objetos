class Conta{
	double saldo;
	int agencia;
	int numero;
	 String titular;
	 
	 public void deposita(double valor) {
		 this.saldo += valor;
		 
	 }
	 
	 public boolean saca(double valor){
		 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 return true;
		 }else {
			 return false;
		 }
	 }
	 public boolean transfere(double valor,Conta destino) {
		 if(this.saca(valor)){ // verifica se a referencia da conta tem a quantia se sim, retira o valor
			 destino.deposita(valor); // deposita o valor tirado na referencia da conta destino que é identificada pelo output java ao imprimir a conta do pedro
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	 
}