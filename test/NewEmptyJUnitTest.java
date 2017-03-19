/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UtilisateurDao;
import entite.OperationDetail;
import java.util.Date;
import metier.OperationDetailMetier;
import metier.UtilisateurMetier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author phuong
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
//    @Test
//    public void testDao(){
//        ListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        UtilisateurDao m=(UtilisateurDao)bf.getBean("utilisateurDao");
//
//        m.findAll().forEach(u -> System.out.println(u.getUsername() + " " + u.getMotdepasse() + " " + u.getEnabled()));
//    }
//    
//    @Test
//    public void test() {
//        // TODO code application logic here
//        ListableBeanFactory bf;
//        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        UtilisateurMetier metier=(UtilisateurMetier)bf.getBean("utilisateurMetier");
//        metier.lister();
//    }
//    
//    @Test
//    public void testCreer(){
//        ListableBeanFactory bf;
//        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
//        OperationDetail opt = new OperationDetail(null, 2000, null, null, new Date(117,2,10), null, "Phuong", null);
//        System.out.println(metier.creer(opt, "Phuong", null).getId());
//    }
    
    
//    @Test
//    public void testModifier(){
//        ListableBeanFactory bf;
//        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
//        OperationDetail opt = new OperationDetail("test 3", 1000, null, 200.0, new Date(217, 2, 10), null, "Phuong", null);
//        opt.setId(102);
//        metier.modifier(opt, "Phuong", null);
//    }
    
    @Test
    public void testSupprimer(){
        ListableBeanFactory bf; 
        bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        OperationDetailMetier metier=(OperationDetailMetier)bf.getBean("operationDetailMetier");
        System.out.println(metier.supprimer(104, "Phuong", null));
    }
    
//    @Test
//    public void testCXF() {
//        try {
//            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//            factory.getInInterceptors().add(new LoggingInInterceptor());
//            factory.getOutInterceptors().add(new LoggingOutInterceptor());
//            factory.setServiceClass(ICalculService.class);
//            factory.setAddress("http://localhost:8080/GestionDeBudget_Webservice/CalculService/ICalculService?wsdl");
//            ICalculService client = (ICalculService) factory.create();
//            int i = 4;
//            int j = 5;
//            int result = client.add(i, j);
//            System.out.println("Result 2 = " + result);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
}
