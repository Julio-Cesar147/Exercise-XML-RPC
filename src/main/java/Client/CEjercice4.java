package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

// Julio Cesar Gutierrez Rojas 4A

public class CEjercice4 {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {

        Scanner scn = new Scanner(System.in);

        int[] enteros = new int[5];
        for (int i = 0; i < enteros.length; i++){
            System.out.println("Ingresa un numero");
            enteros [i] = scn.nextInt();
        }


        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        XmlRpcClient client = new XmlRpcClient();
        config.setServerURL(new URL("http://localhost:1200"));
        client.setConfig(config);
        Object[] data = {enteros};
        Integer[] response = (Integer[]) client.execute("Methods.ej4", data);
        System.out.println(response);
    }
}
