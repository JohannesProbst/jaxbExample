package test.jaxb.main;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import test.jaxb.dependencycheck.AllowedProjectDependencies;
import test.jaxb.dependencycheck.License;
import test.jaxb.dependencycheck.ProjectDependency;
import test.jaxb.dependencycheck.SourceType;
import test.jaxb.handler.JaxbXmlHandler;

public class JaxbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper for multiple record data
		AllowedProjectDependencies allowedPds= new AllowedProjectDependencies();
		
		//creating two ProjectDependencies and their licenses and add them to the list
		License license0= new License();
		license0.setId("Apache-2.0");
		license0.setTitle("Apache License, Version");
		license0.setDescription("");
		license0.setUrl("http://orf.at");
		license0.setSourceType(SourceType.OPENSOURCE_NO_COPYLEFT);
		license0.setCommercial(false);
		
		ProjectDependency projectDependency0= new ProjectDependency("title0", "versionRange0.0", license0);
		allowedPds.getList().add(projectDependency0);
		
		License license1= new License();
		license1.setId("Bla-1.5");
		license1.setTitle("Bla License, Version 1");
		license1.setDescription("");
		license1.setUrl("http://bla.com");
		license1.setSourceType(SourceType.CLOSED);
		license1.setCommercial(true);
		
		ProjectDependency projectDependency1= new ProjectDependency("title1", "versionRange1.1", license1);
		allowedPds.getList().add(projectDependency1);
		
		
		try{
			//Marshalling: Writing Java object to Xml file
			JaxbXmlHandler.marshal(/*projectDependency0*/allowedPds, new File("ProjectDependency1.xml"));
			
			//Unmarshalling: Converting Xml content to Java objects
			//ProjectDependency projectDependency2 = JaxbXmlHandler.unmarshal(new File("ProjectDependency.xml"));
			AllowedProjectDependencies allowedPds2 = JaxbXmlHandler.unmarshal(new File("ProjectDependency1.xml"));
            //System.out.println(projectDependency2);
			System.out.println(allowedPds2);
            
		}catch(IOException e){
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}
	}

}
