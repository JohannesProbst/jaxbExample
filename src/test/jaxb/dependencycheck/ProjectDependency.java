package test.jaxb.dependencycheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement (name="ProjectDependency")
@XmlType//
public class ProjectDependency {

	@XmlAttribute
	private String key;
	private String versionRange;
	private License license;
	
	//non-argument constructor
	public ProjectDependency() {
	    this.key = "";
	    this.versionRange = "";
	    this.license = null;
	  }
	
	//constructor
	public ProjectDependency(String title, String versionRange, License license) {
	    this.key = title;
	    this.versionRange = versionRange;
	    this.license = license;
	  }
	
	//getter and setter
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVersionRange() {
		return versionRange;
	}
	public void setVersionRange(String versionRange) {
		this.versionRange = versionRange;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	
	@Override
    public String toString() {
        return "Dependency [key=" + key + ", versionRang=" + versionRange + ", license=" + license + "]";
	}
	
}
