
public class person implements Cloneable {
private String name;
private Address ad;
	@Override
	public Object clone() throws CloneNotSupportedException {
		person result=(person)super.clone();
		result.ad=(Address)ad.clone();
		 return result ;
		 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}

}
