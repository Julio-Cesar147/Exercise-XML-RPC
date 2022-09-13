package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// Julio Cesar Gutierrez Rojas 4A

public class CEjercice3 {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {

        Scanner scn = new Scanner(System.in);

        System.out.println("Este programita suma los numeros que esten entre dos numeros, los cuales se van a ingresar");
        System.out.println("Ingresa el numero 1");
        int num1 = scn.nextInt();
        System.out.println("Ingresa el numero 2");
        int num2 = scn.nextInt();

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        XmlRpcClient client = new XmlRpcClient();
        config.setServerURL(new URL("http://localhost:1200"));
        client.setConfig(config);
        Object [] data = {num1, num2};
        Integer response = (Integer) client.execute("Methods.ej3", data);
        System.out.println(response);
    }
}
