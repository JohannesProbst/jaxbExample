package test.jaxb.dependencycheck;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum SourceType {

	CLOSED,
	OPENSOURCE_COPYLEFT,
	OPENSOURCE_NO_COPYLEFT;
	
	public static List<String> getSourceTypes() {
	    List<String> types = new ArrayList<String>();

	    for (SourceType type : SourceType.values()) {
	      types.add(type.name());
	    }
	    return types;
	}
}
