package pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import packagepojo.Bankexample;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Bankexample b=(Bankexample)bf.getBean("studentbean");
		b.show();
	}

}
