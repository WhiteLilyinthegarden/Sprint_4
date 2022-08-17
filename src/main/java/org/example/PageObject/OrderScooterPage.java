package org.example.PageObject;

import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderScooterPage {

    // Первая форма
    // Поле Имя
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    // Поле Фамилия
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле Адрес
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле Станция метро
    private final By inputSubway = By.xpath(".//input[@placeholder='* Станция метро']");
    // Список станций
    private final By subwayPanel = By.cssSelector(".select-search");
    // Поле Номер телефона
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка Далее формы
    private final By btnNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    // Вторая форма
    // Поле Когда привезти самокат
    private final By inputWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Поле Коментарий для клиента
    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Поле Срок аренды
    private final By rentalPeriod = By.className("Dropdown-root");
    // Список Срок аренды
    private final By rentalPeriodOptions = By.className("Dropdown-option");
    // Чек бокс Цвет самоката
    private final By scooterColorChekboxes = By.className("Checkbox_Label__3wxSf");
    // Кнопка заказа в центре страницы
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    // Кнопка ДА в окошке Хотите оформить заказ?
    private final By btnYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Окошко Заказ оформлен
    private final By orderIsProcessed = By.xpath(".//div[text()='Заказ оформлен']");

    // Задать станцию метро
    public void setSubway(WebDriver driver, int stationNumber) {
        driver.findElement(inputSubway).click();
        WebElement element = driver.findElement(By.cssSelector("button[value = '" + stationNumber + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //Заполнить поля раздела "Для кого самокат"
    public void completeFormOfTheSectionForWhomTheScooter(WebDriver driver, String name, String surname, String address, int stationNumber, String phone) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputSurname).sendKeys(surname);
        driver.findElement(inputAddress).sendKeys(address);
        setSubway(driver, stationNumber);
        driver.findElement(inputPhone).sendKeys(phone);
    }

    // Завершить заказ
    public void finishOrderFormOfTheSectionForWhomTheScooter(WebDriver driver, String name, String surname, String address, int stationNumber, String phone) {
        completeFormOfTheSectionForWhomTheScooter(driver, name, surname, address, stationNumber, phone);
        driver.findElement(btnNext).click();
    }

    //Выбрать значение из списка Срок аренды n-1
    public void selectRentalPeriodOption(WebDriver driver, int amountOfDays) {
        driver.findElement(rentalPeriod).click();
        List<WebElement> elements = driver.findElements(rentalPeriodOptions);
        WebElement element = elements.get(amountOfDays);
        element.click();


    }

    // Кликнуть по чебкосу цвета (один из двух): 0 = черный, 1 = серый
    public void clickRentalPeriod(WebDriver driver, int colorNumber) {
        List<WebElement> elements = driver.findElements(scooterColorChekboxes);
        WebElement element = elements.get(colorNumber);
        element.click();
    }

    // Заполняем Про аренду
    public void completeFormAboutRent(WebDriver driver, String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        driver.findElement(inputWhen).sendKeys(dayOfArrival);
        driver.findElement(inputWhen).sendKeys(Keys.ESCAPE);
        driver.findElement(inputComment).sendKeys(comment);
        selectRentalPeriodOption(driver, amountOfDays);
        clickRentalPeriod(driver, colorNumber);
    }

    // Заказать
    public void finishOrderFormAboutRent(WebDriver driver, String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        completeFormAboutRent(driver, dayOfArrival, comment, amountOfDays, colorNumber);
        driver.findElement(btnMiddleOrder).click();
    }

    //Заказать скутер
    public String orderScooter(WebDriver driver, String name, String surname, String address, int stationNumber, String phone,
                               String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        finishOrderFormOfTheSectionForWhomTheScooter(driver, name, surname, address, stationNumber, phone);
        finishOrderFormAboutRent(driver, dayOfArrival, comment, amountOfDays, colorNumber);
        //Баг в chrome: хром не может кликнуть по кнопке "Да", вместо этого он просто наводится на неё
        driver.findElement(btnYes).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String actualResult = driver.findElement(orderIsProcessed).getText();
        return actualResult;
    }


}

