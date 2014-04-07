//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.27 at 06:23:03 PM EEST 
//


package gr.ntua.ivml.mint.uim.messages.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserExistsAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserExistsAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="UserExistsCommand" type="{}UserExistsCommand"/>
 *         &lt;element name="UserExistsResponse" type="{}UserExistsResponse"/>
 *         &lt;element name="error" type="{}ErrorResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserExistsAction", propOrder = {
    "userExistsCommand",
    "userExistsResponse",
    "error"
})
public class UserExistsAction {

    @XmlElement(name = "UserExistsCommand")
    protected UserExistsCommand userExistsCommand;
    @XmlElement(name = "UserExistsResponse")
    protected UserExistsResponse userExistsResponse;
    protected ErrorResponse error;

    /**
     * Gets the value of the userExistsCommand property.
     * 
     * @return
     *     possible object is
     *     {@link UserExistsCommand }
     *     
     */
    public UserExistsCommand getUserExistsCommand() {
        return userExistsCommand;
    }

    /**
     * Sets the value of the userExistsCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserExistsCommand }
     *     
     */
    public void setUserExistsCommand(UserExistsCommand value) {
        this.userExistsCommand = value;
    }

    /**
     * Gets the value of the userExistsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserExistsResponse }
     *     
     */
    public UserExistsResponse getUserExistsResponse() {
        return userExistsResponse;
    }

    /**
     * Sets the value of the userExistsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserExistsResponse }
     *     
     */
    public void setUserExistsResponse(UserExistsResponse value) {
        this.userExistsResponse = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setError(ErrorResponse value) {
        this.error = value;
    }

}
