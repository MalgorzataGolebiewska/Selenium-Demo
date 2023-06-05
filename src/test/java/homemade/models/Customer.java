package homemade.models;

import homemade.utils.SeleniumHelper;

public class Customer {

    private String firstName;
    private String lastName;
    private String companyName;
    private String country;
    private String address1;
    private String address2;
    private String cityName;
    private String postCode;
    private String phone;
    private String email;
    private String orderComments;
    private String contactUsMessage;
    private String commentTextSection;
    private String websiteCommentSection;

    public Customer() {
        this.firstName = "Pepino";
        this.lastName = "Testowy";
        this.companyName = "Tester&Tester";
        this.country = "Poland";
        this.address1 = "Testowa 11";
        this.address2 = "Apt. 1";
        this.cityName = "Seul";
        this.postCode = "12-121";
        this.phone = "123456789";
        this.email = "test1@test.pl";
        this.orderComments = "no comments";
        this.contactUsMessage = "test test test";
        this.commentTextSection = SeleniumHelper.generateRandomText(200);
        this.websiteCommentSection = "www.testowylink.pl";
    }

    //TODO zamienić gettery i settery na @Getter i @Setter z biblioteki Lombok
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhone() {
        return phone;
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

    public String getContactUsMessage() {
        return contactUsMessage;
    }

    public String getCommentTextSection() {
        return commentTextSection;
    }

    public String getWebsiteCommentSection() {
        return websiteCommentSection;
    }

}
