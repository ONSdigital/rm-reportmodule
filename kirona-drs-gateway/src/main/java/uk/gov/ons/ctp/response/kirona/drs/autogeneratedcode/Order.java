
package uk.gov.ons.ctp.response.kirona.drs.autogeneratedcode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}entity">
 *       &lt;sequence>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="earliestBookingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderCommentsExtended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}orderStatus" minOccurs="0"/>
 *         &lt;element name="subcontract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tertiaryOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theBookingCodes" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}bookingCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="theBookings" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}booking" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="theBusinessData" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}businessData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="theLocation" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}location"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "contactName",
    "contract",
    "earliestBookingDate",
    "locationID",
    "message",
    "orderComments",
    "orderCommentsExtended",
    "orderId",
    "phone",
    "primaryOrderNumber",
    "priority",
    "reasonCode",
    "secondaryOrderNumber",
    "status",
    "subcontract",
    "targetDate",
    "tertiaryOrderNumber",
    "theBookingCodes",
    "theBookings",
    "theBusinessData",
    "theLocation",
    "userId"
})
public class Order
    extends Entity
{

    protected String contactName;
    @XmlElement(required = true)
    protected String contract;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestBookingDate;
    @XmlElement(required = true)
    protected String locationID;
    @XmlElement(defaultValue = "false")
    protected boolean message;
    @XmlElement(required = true)
    protected String orderComments;
    protected String orderCommentsExtended;
    protected int orderId;
    protected String phone;
    @XmlElement(required = true)
    protected String primaryOrderNumber;
    @XmlElement(required = true)
    protected String priority;
    protected String reasonCode;
    protected String secondaryOrderNumber;
    protected OrderStatus status;
    protected String subcontract;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetDate;
    protected String tertiaryOrderNumber;
    protected List<BookingCode> theBookingCodes;
    protected List<Booking> theBookings;
    protected List<BusinessData> theBusinessData;
    @XmlElement(required = true)
    protected Location theLocation;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the earliestBookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestBookingDate() {
        return earliestBookingDate;
    }

    /**
     * Sets the value of the earliestBookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestBookingDate(XMLGregorianCalendar value) {
        this.earliestBookingDate = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the message property.
     * 
     */
    public boolean isMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     */
    public void setMessage(boolean value) {
        this.message = value;
    }

    /**
     * Gets the value of the orderComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderComments() {
        return orderComments;
    }

    /**
     * Sets the value of the orderComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderComments(String value) {
        this.orderComments = value;
    }

    /**
     * Gets the value of the orderCommentsExtended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCommentsExtended() {
        return orderCommentsExtended;
    }

    /**
     * Sets the value of the orderCommentsExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCommentsExtended(String value) {
        this.orderCommentsExtended = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the primaryOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrderNumber() {
        return primaryOrderNumber;
    }

    /**
     * Sets the value of the primaryOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrderNumber(String value) {
        this.primaryOrderNumber = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the secondaryOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryOrderNumber() {
        return secondaryOrderNumber;
    }

    /**
     * Sets the value of the secondaryOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryOrderNumber(String value) {
        this.secondaryOrderNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setStatus(OrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the subcontract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcontract() {
        return subcontract;
    }

    /**
     * Sets the value of the subcontract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcontract(String value) {
        this.subcontract = value;
    }

    /**
     * Gets the value of the targetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDate() {
        return targetDate;
    }

    /**
     * Sets the value of the targetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDate(XMLGregorianCalendar value) {
        this.targetDate = value;
    }

    /**
     * Gets the value of the tertiaryOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryOrderNumber() {
        return tertiaryOrderNumber;
    }

    /**
     * Sets the value of the tertiaryOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryOrderNumber(String value) {
        this.tertiaryOrderNumber = value;
    }

    /**
     * Gets the value of the theBookingCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theBookingCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheBookingCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCode }
     * 
     * 
     */
    public List<BookingCode> getTheBookingCodes() {
        if (theBookingCodes == null) {
            theBookingCodes = new ArrayList<BookingCode>();
        }
        return this.theBookingCodes;
    }

    /**
     * Gets the value of the theBookings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theBookings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheBookings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Booking }
     * 
     * 
     */
    public List<Booking> getTheBookings() {
        if (theBookings == null) {
            theBookings = new ArrayList<Booking>();
        }
        return this.theBookings;
    }

    /**
     * Gets the value of the theBusinessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theBusinessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessData }
     * 
     * 
     */
    public List<BusinessData> getTheBusinessData() {
        if (theBusinessData == null) {
            theBusinessData = new ArrayList<BusinessData>();
        }
        return this.theBusinessData;
    }

    /**
     * Gets the value of the theLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getTheLocation() {
        return theLocation;
    }

    /**
     * Sets the value of the theLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setTheLocation(Location value) {
        this.theLocation = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}