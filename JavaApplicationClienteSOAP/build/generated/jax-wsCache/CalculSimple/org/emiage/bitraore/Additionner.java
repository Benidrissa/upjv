
package org.emiage.bitraore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nombreB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionner", propOrder = {
    "nombreA",
    "nombreB"
})
public class Additionner {

    protected double nombreA;
    protected double nombreB;

    /**
     * Gets the value of the nombreA property.
     * 
     */
    public double getNombreA() {
        return nombreA;
    }

    /**
     * Sets the value of the nombreA property.
     * 
     */
    public void setNombreA(double value) {
        this.nombreA = value;
    }

    /**
     * Gets the value of the nombreB property.
     * 
     */
    public double getNombreB() {
        return nombreB;
    }

    /**
     * Sets the value of the nombreB property.
     * 
     */
    public void setNombreB(double value) {
        this.nombreB = value;
    }

}
