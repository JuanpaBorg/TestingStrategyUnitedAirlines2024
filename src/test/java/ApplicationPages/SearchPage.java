package ApplicationPages;

import WebConnector.webconnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SearchPage {
	webconnector wc=new webconnector();
	private WebDriver driver;
	@FindBy(xpath = "//*[@id=\"flights-booking-id-1-input\"]")
	private WebElement originInput;
	@FindBy(id = "//*[@id=\"flights-booking-id-2-input\"]")
	private WebElement destinationInput;
	@FindBy(id = "//*[@id=\"headlessui-popover-button-21\"]/div/div/div/div/div/div/button")
	private WebElement departureDateInput;
	@FindBy(id = "//*[@id=\"headlessui-popover-button-26\"]/div/div/div/div/div/div/button")
	private WebElement returnDateInput;
	@FindBy(id = "//*[@id=\"main\"]/div[1]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/button")
	private WebElement searchButton;
	@FindBys(@FindBy(xpath = "//*[@id=\"main\"]/div[27]/div/div/div/div/div/div/div[2]/table/tbody"))
	private WebElement searchResultsTable;
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterOrigin(String origin) {
		originInput.sendKeys(origin);
	}
	public void enterDestination(String destination) {
		destinationInput.sendKeys(destination);
	}
	public void enterDepartureDate(String departureDate) {
		departureDateInput.sendKeys(departureDate);
	}
	public void enterReturnDate(String returnDate) {
		returnDateInput.sendKeys(returnDate);
	}
	public void clickSearchButton() {
		searchButton.click();
	}

	public WebElement getOriginInput() {
		return originInput;
	}
	public WebElement getDestinationInput() {
		return destinationInput;
	}
	public WebElement getDepartureDateInput() {
		return departureDateInput;
	}
	public WebElement getReturnDateInput() {
		return returnDateInput;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public String getOriginInputText() {
		return getOriginInput().getText();
	}
	public String getDestinationInputText() {
		return getDestinationInput().getText();
	}
	public String getDepartureDateInputText() {
		return getDepartureDateInput().getText();
	}
	public String getReturnDateInputText() {
		return getReturnDateInput().getText();
	}
	public String getSearchButtonText() {
		return getSearchButton().getText();
	}

	public String getOriginInputInnerHTML() {
		return getOriginInput().getAttribute("innerHTML");
	}
	public String getDestinationInputInnerHTML() {
		return getDestinationInput().getAttribute("innerHTML");
	}
	public String getDepartureDateInputInnerHTML() {
		return getDepartureDateInput().getAttribute("innerHTML");
	}
	public String getReturnDateInputInnerHTML() {
		return getReturnDateInput().getAttribute("innerHTML");
	}
	public String getSearchButtonInnerHTML() {
		return getSearchButton().getAttribute("innerHTML");
	}

	public String getOriginInputInnerContents() {
		return getOriginInput().getAttribute("innerText");
	}
	public String getDestinationInputInnerContents() {
		return getDestinationInput().getAttribute("innerText");
	}
	public String getDepartureDateInputInnerContents() {
		return getDepartureDateInput().getAttribute("innerText");
	}
	public String getReturnDateInputInnerContents() {
		return getReturnDateInput().getAttribute("innerText");
	}
	public String getSearchButtonInnerContents() {
		return getSearchButton().getAttribute("innerText");
	}

	public boolean isOriginInputVisible() {
		return getOriginInput().isDisplayed();
	}
	public boolean isDestinationInputVisible() {
		return getDestinationInput().isDisplayed();
	}
	public boolean isDepartureDateInputVisible() {
		return getDepartureDateInput().isDisplayed();
	}
	public boolean isReturnDateInputVisible() {
		return getReturnDateInput().isDisplayed();
	}
	public boolean isSearchButtonVisible() {
		return getSearchButton().isDisplayed();
	}
	public WebElement getSearchResultsTable() {
		return searchResultsTable;
	}
	public List<WebElement> getSearchResultRows() {
		return getSearchResultsTable().findElements(By.tagName("tr"));
	}

	public List<WebElement> getSearchResultColumns(WebElement row) {
		return row.findElements(By.tagName("td"));
	}
	public boolean areResultsDisplayed() {
		return searchResultsTable.isDisplayed();
	}


	public WebElement getOriginInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(0);
	}

	public WebElement getDestinationInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(1);
	}
	public WebElement getFareTypeInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(2);
	}
	public WebElement getDepartureDateInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(3);

	}
	public WebElement getReturnDateInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(3); // Assuming Return Date is the fourth column
	}


	public WebElement getPriceInRow(WebElement row) {
		List<WebElement> columns = getSearchResultColumns(row);
		return columns.get(5); // Assuming Price is the sixth column
	}

	public void searchForFlights(String origin, String destination, String departureDate, String returnDate) {
		enterOrigin(origin);
		enterDestination(destination);
		enterDepartureDate(departureDate);
		enterReturnDate(returnDate);
		clickSearchButton();
	}
}