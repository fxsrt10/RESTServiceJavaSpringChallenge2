package hello;

public class Purchase {
	public long id;
    private String propertyState;
    private String propertyCity;
	

	private String propertyCounty;
    private String propertyZip;
    private String sponsorOriginator;
    private String mortgageNumber;
    private String sponsorName;
    private String sponsorNumber;
    private String downpaymentSource;
    private String nonProfitNumber;
    
    private String productType;
    private String loanPurpose;
    private String propertyType;
    private Float interestRate;
    private Double origMortgageAmount;
    private String endorsementYear;
    private String endorsementMonth;
    
    public void setId(long id) {
		this.id = id;
	}
	public void setPropertyState(String propertyState) {
		this.propertyState = propertyState;
	}
	public void setPropertyCounty(String propertyCounty) {
		this.propertyCounty = propertyCounty;
	}
	public void setPropertyZip(String propertyZip) {
		this.propertyZip = propertyZip;
	}
	public void setSponsorOriginator(String sponsorOriginator) {
		this.sponsorOriginator = sponsorOriginator;
	}
	public void setMortgageNumber(String mortgageNumber) {
		this.mortgageNumber = mortgageNumber;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public void setSponsorNumber(String sponsorNumber) {
		this.sponsorNumber = sponsorNumber;
	}
	public void setDownpaymentSource(String downpaymentSource) {
		this.downpaymentSource = downpaymentSource;
	}
	public void setNonProfitNumber(String nonProfitNumber) {
		this.nonProfitNumber = nonProfitNumber;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	public void setOrigMortgageAmount(Double origMortgageAmount) {
		this.origMortgageAmount = origMortgageAmount;
	}
	public void setEndorsementYear(String endorsementYear) {
		this.endorsementYear = endorsementYear;
	}
	public void setEndorsementMonth(String endorsementMonth) {
		this.endorsementMonth = endorsementMonth;
	}

	
    public String getPropertyCity() {
		return propertyCity;
	}
	public void setPropertyCity(String propertyCity) {
		this.propertyCity = propertyCity;
	}
	public long getId() {
		return id;
	}
	public String getPropertyState() {
		return propertyState;
	}
	public String getPropertyCounty() {
		return propertyCounty;
	}
	public String getPropertyZip() {
		return propertyZip;
	}
	public String getSponsorOriginator() {
		return sponsorOriginator;
	}
	public String getMortgageNumber() {
		return mortgageNumber;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public String getSponsorNumber() {
		return sponsorNumber;
	}
	public String getDownpaymentSource() {
		return downpaymentSource;
	}
	public String getNonProfitNumber() {
		return nonProfitNumber;
	}
	public String getProductType() {
		return productType;
	}
	public String getLoanPurpose() {
		return loanPurpose;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public Float getInterestRate() {
		return interestRate;
	}
	public Double getOrigMortgageAmount() {
		return origMortgageAmount;
	}
	public String getEndorsementYear() {
		return endorsementYear;
	}
	public String getEndorsementMonth() {
		return endorsementMonth;
	}
	public Purchase(){		
	}
	
	
    
}
