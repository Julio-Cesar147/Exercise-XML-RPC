package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// Julio Cesar Gutierrez Rojas 4A

public class CEjercice2 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa el nombre del producto");
        String name = scn.nextLine();
        System.out.println("Ingresa el numero 1");
        double nu1 = scn.nextDouble();
        System.out.println("Ingresa el numero 2");
        double nu2 = scn.nextDouble();
        System.out.println("Ingresa el numero 3");
        double nu3 = scn.nextDouble();


        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        XmlRpcClient client = new XmlRpcClient();
        config.setServerURL(new URL("http://localhost:1200"));
        client.setConfig(config);
        Object [] data = {name,nu1, nu2, nu3};
        String response = (String) client.execute("Methods.ej2", data);
        System.out.println(response);
        //System.out.println("Hola " + data[0] + "Tu Imc ES " + response);
    }
}
