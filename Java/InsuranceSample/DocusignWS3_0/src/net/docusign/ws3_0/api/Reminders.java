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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reminders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reminders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReminderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReminderDelay" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ReminderFrequency" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reminders", propOrder = {
    "reminderEnabled",
    "reminderDelay",
    "reminderFrequency"
})
public class Reminders {

    @XmlElement(name = "ReminderEnabled")
    protected boolean reminderEnabled;
    @XmlElement(name = "ReminderDelay")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reminderDelay;
    @XmlElement(name = "ReminderFrequency")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reminderFrequency;

    /**
     * Gets the value of the reminderEnabled property.
     * 
     */
    public boolean isReminderEnabled() {
        return reminderEnabled;
    }

    /**
     * Sets the value of the reminderEnabled property.
     * 
     */
    public void setReminderEnabled(boolean value) {
        this.reminderEnabled = value;
    }

    /**
     * Gets the value of the reminderDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderDelay() {
        return reminderDelay;
    }

    /**
     * Sets the value of the reminderDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderDelay(BigInteger value) {
        this.reminderDelay = value;
    }

    /**
     * Gets the value of the reminderFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderFrequency() {
        return reminderFrequency;
    }

    /**
     * Sets the value of the reminderFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderFrequency(BigInteger value) {
        this.reminderFrequency = value;
    }

}
