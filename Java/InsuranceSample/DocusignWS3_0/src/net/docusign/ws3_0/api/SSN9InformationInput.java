/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
 */
package net.docusign.ws3_0.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSN9InformationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSN9InformationInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSN9Information" type="{http://www.docusign.net/API/3.0}SSN9Information" minOccurs="0"/>
 *         &lt;element name="DisplayLevel" type="{http://www.docusign.net/API/3.0}DisplayLevelCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSN9InformationInput", propOrder = {
    "ssn9Information",
    "displayLevel"
})
public class SSN9InformationInput {

    @XmlElement(name = "SSN9Information")
    protected SSN9Information ssn9Information;
    @XmlElement(name = "DisplayLevel")
    protected DisplayLevelCode displayLevel;

    /**
     * Gets the value of the ssn9Information property.
     * 
     * @return
     *     possible object is
     *     {@link SSN9Information }
     *     
     */
    public SSN9Information getSSN9Information() {
        return ssn9Information;
    }

    /**
     * Sets the value of the ssn9Information property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSN9Information }
     *     
     */
    public void setSSN9Information(SSN9Information value) {
        this.ssn9Information = value;
    }

    /**
     * Gets the value of the displayLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayLevelCode }
     *     
     */
    public DisplayLevelCode getDisplayLevel() {
        return displayLevel;
    }

    /**
     * Sets the value of the displayLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayLevelCode }
     *     
     */
    public void setDisplayLevel(DisplayLevelCode value) {
        this.displayLevel = value;
    }

}
