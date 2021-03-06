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

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.9
 * Mon Sep 27 16:58:56 EEST 2010
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "APIService", 
                  wsdlLocation = "https://demo.docusign.net/api/3.0/api.asmx?WSDL",
                  targetNamespace = "http://www.docusign.net/API/3.0") 
public class APIService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.docusign.net/API/3.0", "APIService");
    public final static QName APIServiceSoap12 = new QName("http://www.docusign.net/API/3.0", "APIServiceSoap12");
    public final static QName APIServiceSoap = new QName("http://www.docusign.net/API/3.0", "APIServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://demo.docusign.net/api/3.0/api.asmx?WSDL");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from https://demo.docusign.net/api/3.0/api.asmx?WSDL");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public APIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public APIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public APIService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap12")
    public APIServiceSoap getAPIServiceSoap12() {
        return super.getPort(APIServiceSoap12, APIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap12")
    public APIServiceSoap getAPIServiceSoap12(WebServiceFeature... features) {
        return super.getPort(APIServiceSoap12, APIServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap")
    public APIServiceSoap getAPIServiceSoap() {
        return super.getPort(APIServiceSoap, APIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap")
    public APIServiceSoap getAPIServiceSoap(WebServiceFeature... features) {
        return super.getPort(APIServiceSoap, APIServiceSoap.class, features);
    }

}
