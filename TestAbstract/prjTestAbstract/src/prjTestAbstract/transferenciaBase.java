package prjTestAbstract;

public abstract class transferenciaBase{
	
	Double monto = 0.00;
	String cuentaOrigen = "";
	String cuentaDestino = "";
	
	
	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public Boolean paso001Transferencia()
	{
		System.out.print("Ejecutando paso 001");
		
		return true;
	}
	
	public Boolean paso002Transferencia()
	{
		System.out.print("Ejecutando paso 002");
		
		return true;
	}

	public Boolean paso003Transferencia()
	{
		System.out.print("Ejecutando paso 003");
		
		return true;
	}
	

}
