/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationclientesoap;

/**
 *
 * @author benidrissa
 */
public class JavaApplicationClienteSOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Appel distant de Decomposer(642880): "+decomposer(642880));
    }

    private static java.util.List<java.lang.Object> decomposer(int entier) {
        org.emiage.bitraore.CalculSimple_Service service = new org.emiage.bitraore.CalculSimple_Service();
        org.emiage.bitraore.CalculSimple port = service.getCalculSimplePort();
        return port.decomposer(entier);
    }
    
}
