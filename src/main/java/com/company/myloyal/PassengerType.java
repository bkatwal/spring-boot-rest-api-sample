//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.09 at 09:59:48 PM GMT 
//


package com.company.myloyal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="passengerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFANT"/>
 *     &lt;enumeration value="CHILDREN"/>
 *     &lt;enumeration value="ADULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "passengerType", namespace = "http://company.com/myloyal/domain")
@XmlEnum
public enum PassengerType {

    INFANT,
    CHILDREN,
    ADULT;

    public String value() {
        return name();
    }

    public static PassengerType fromValue(String v) {
        return valueOf(v);
    }

}
