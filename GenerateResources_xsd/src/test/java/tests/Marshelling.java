package tests;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import https.www_journaldev_com.com.journaldev.employee.data.EmpRequest;
import https.www_journaldev_com.com.journaldev.employee.data.EmpResponse;

public class Marshelling {

	public static void main(String[] args) {

		EmpRequest emp= new EmpRequest();
		emp.setName("Irfan");
		emp.setId(1273);
		
		try {

			File file = new File("C:\\Users\\Admin\\Desktop\\JAVAProg\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(EmpRequest.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(emp, file);
			jaxbMarshaller.marshal(emp, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
		
		/*EmpResponse emp1= new EmpResponse();
		emp1.setName("Irfan");
		emp1.setId(1273);
		emp1.setGender("Male");
		emp1.setSalary("500");
		
		try {

			File file = new File("C:\\Users\\Admin\\Desktop\\JAVAProg\\EmpResponse.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(EmpRequest.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(emp1, file);
			jaxbMarshaller.marshal(emp1, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }*/
	}

}
