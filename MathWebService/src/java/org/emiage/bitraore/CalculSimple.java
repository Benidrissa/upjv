/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emiage.bitraore;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author benidrissa
 */
@WebService(serviceName = "CalculSimple")
public class CalculSimple {
    /**
     * Web service operation
     * additionne deux nombres
     */
    @WebMethod(operationName = "additionner")
    public Double additionner(@WebParam(name = "nombreA") double nombreA, @WebParam(name = "nombreB") double nombreB) {
        return nombreA+nombreB;
    }

    /**
     * Web service operation
     * retourne la liste des facteurs premier d'un entier
     */
    @WebMethod(operationName = "decomposer")
    public List decomposer(@WebParam(name = "entier") int entier) {
        List l = new ArrayList();
        int i=2;
        while(i<=entier){
            if(entier%i==0){
                l.add(i);
                entier = entier/i;
            }else{
                i++;
            }
        }
        return l;
    }

    /**
     * Web service operation: indique si un nombre est premier ou pas
     */
    @WebMethod(operationName = "premier")
    public boolean premier(@WebParam(name = "entier") int entier) {
        return decomposer(entier).size()==1;
    }
    
    public static void main(String[] args){
        CalculSimple cs = new CalculSimple();
        System.out.println("premier 8 ?"+cs.premier(8));
        System.out.println("premier 5 ?"+cs.premier(5));
        System.out.println("Decomposer 8 ?"+cs.decomposer(8));
        System.out.println("Decomposer 362880 ?"+cs.decomposer(362880));
    }
}
