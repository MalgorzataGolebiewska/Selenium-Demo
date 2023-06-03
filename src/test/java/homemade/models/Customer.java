package homemade.models;

import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer {

    private String firstName = "Pepino";
    private String lastName = "Testowy";
    private String companyName = "Tester&Tester";
    private String country = "Poland";
    private String address1 = "Testowa 11";
    private String address2 = "Apt. 1";
    private String cityName = "Seul";
    private String postCode = "12-121";
    private String phone = "123456789";
    private String email = "test1@test.pl";
    private String orderComments = "no comments";
    private String contactUsMessage = "test test test";

    private String commentTextSection = SeleniumHelper.generateRandomText(200);
    private String websiteCommentSection = "www.testowylink.pl";



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderComments() {
        return orderComments;
    }

    public void setOrderComments(String orderComments) {
        this.orderComments = orderComments;
    }

    public String getContactUsMessage() {
        return contactUsMessage;
    }

    public void setContactUsMessage(String contactUsMessage) {
        this.contactUsMessage = contactUsMessage;
    }

    public String getCommentTextSection() {
        return commentTextSection;
    }

    public void setCommentTextSection(String commentTextSection) {
        this.commentTextSection = commentTextSection;
    }

    public String getWebsiteCommentSection() {
        return websiteCommentSection;
    }

    public void setWebsiteCommentSection(String websiteCommentSection) {
        this.websiteCommentSection = websiteCommentSection;
    }
}
