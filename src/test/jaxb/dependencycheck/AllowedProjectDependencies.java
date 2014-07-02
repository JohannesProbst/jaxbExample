package test.jaxb.dependencycheck;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="allowedProjectDependencies")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllowedProjectDependencies {

	@XmlElementWrapper (name="projectDependencies")
	@XmlElement (name="dependency")
	private ArrayList<ProjectDependency> list= new ArrayList<ProjectDependency>();

	//getter and setter
	public ArrayList<ProjectDependency> getList() {
		return list;
	}
	
	
	public void setList(ArrayList<ProjectDependency> list) {
		this.list = list;
	}
	
	@Override
	public String toString(){
		String result="";
		int i=1;
		if(!list.isEmpty()){
			for(ProjectDependency proDp: list){
				result+=i++ +"." +"Element: " + proDp.toString()+ " ";
			}
		return result;
		}
		else{
			return ("List is empty - no elements included in the allowed-projectDependencies-list!");
		}
	}
	
	
}
