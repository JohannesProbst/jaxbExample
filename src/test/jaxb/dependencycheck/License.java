package test.jaxb.dependencycheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class License {

	@XmlAttribute private String id;
	@XmlTransient private String title;
	@XmlTransient private String description;
	@XmlTransient private String url;
	@XmlTransient private SourceType sourceType;
	@XmlTransient private boolean commercial;
	
	//getter and setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SourceType getSourceType() {
		return sourceType;
	}
	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}
	public boolean isCommercial() {
		return commercial;
	}
	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	
	@Override
    public String toString() {
        return "License [id=" + id + ", title=" + title + ", description=" + description + ", url=" + url 
        		+ ", sourceType=" + sourceType + ",commercial="+ commercial + "]";
	}
}
