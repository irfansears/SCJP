package tests;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import https.www_journaldev_com.com.journaldev.employee.data.EmpRequest;
import https.www_journaldev_com.com.journaldev.employee.data.EmpResponse;

public class Unmarshelling {

	public static void main(String[] args) {

		try {

			File file = new File("C:\\Users\\Admin\\Desktop\\JAVAProg\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(EmpRequest.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			EmpRequest customer = (EmpRequest) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.getName());
			System.out.println(customer.getId());
			

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

		
		try {

			File file = new File("C:\\Users\\Admin\\Desktop\\JAVAProg\\EmpResponse.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(EmpRequest.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			EmpResponse customer = (EmpResponse) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.getName());
			System.out.println(customer.getId());
			System.out.println(customer.getGender());
			System.out.println(customer.getSalary());
			

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	}

}
