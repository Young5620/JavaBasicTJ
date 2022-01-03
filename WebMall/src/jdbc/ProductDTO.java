package jdbc;

public class ProductDTO {

	private String pid;
	private String pname;
	private String pdesc;
	private String pprice;
	private String pfilen;
	
	public ProductDTO(String pid, String pname, String pdesc, String pprice, String pfilen) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.pprice = pprice;
		this.pfilen = pfilen;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPfilen() {
		return pfilen;
	}

	public void setPfilen(String pfilen) {
		this.pfilen = pfilen;
	}
	
	
	
	
}
