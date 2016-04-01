
package uk.gov.ons.ctp.response.kirona.drs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmbUpdateOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbUpdateOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}command">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theOrder" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}order"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmbUpdateOrder", propOrder = {
    "sessionId",
    "theOrder"
})
public class XmbUpdateOrder
    extends Command
{

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected Order theOrder;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the theOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getTheOrder() {
        return theOrder;
    }

    /**
     * Sets the value of the theOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setTheOrder(Order value) {
        this.theOrder = value;
    }

}