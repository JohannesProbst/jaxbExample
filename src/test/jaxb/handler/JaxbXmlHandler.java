package test.jaxb.handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import test.jaxb.dependencycheck.AllowedProjectDependencies;
//import test.jaxb.dependencycheck.ProjectDependency;

public class JaxbXmlHandler {

	// Export: Marshalling
    public static void marshal(/*ProjectDependency projectdp*/AllowedProjectDependencies list, File selectedFile)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(AllowedProjectDependencies.class/*ProjectDependency.class*/);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(list, writer);
        writer.close();
    }
 
    // Import: Unmarshalling
    public static AllowedProjectDependencies/*ProjectDependency*/ unmarshal(File importFile) throws JAXBException {
    	//ProjectDependency projectdp = null;
    	AllowedProjectDependencies allowedPds= null;
        JAXBContext context;
 
        context = JAXBContext.newInstance(/*ProjectDependency.class*/AllowedProjectDependencies.class);
        Unmarshaller um = context.createUnmarshaller();
        //projectdp = (ProjectDependency) um.unmarshal(importFile);
        allowedPds= (AllowedProjectDependencies) um.unmarshal(importFile);
 
        //return projectdp;
        return allowedPds;
    }
	
}
