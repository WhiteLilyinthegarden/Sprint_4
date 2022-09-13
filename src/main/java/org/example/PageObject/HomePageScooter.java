package org.example.pageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePageScooter {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    // Картинка-логотип самоката.
    private final By logoMain = By.className("Header_Logo__23yGT");
    // Логотип "Яндекс".
    private final By logoYandex = By.className("Header_LogoYandex__3TSOI");
    // Логотип "Самокат".
    private final By logoScooter = By.className("Header_LogoScooter__3lsAR");
    // Логотип "Учебный тренажер".
    private final By logoDisclaimer = By.className("Header_Disclaimer__3VEni");
    // App Cookie Consent
    private final By appCookieConsent = By.className("App_CookieConsent__1yUIN");
    // Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
    private final By appCookieText = By.className("App_CookieText__1sbqp");
    // Кнопка "да все привыкли"
    private final By appCookieButton = By.className("App_CookieButton__3cvqF");
    // Заголовок "Самокат на пару дней".
    private final By homeHeader = By.className("Home_Header__iJKdX");
    // Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
    private final By homeSubHeaderStartPage = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='Привезём его прямо к вашей двери,']");
    // Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    private final By homeSubHeaderWhenScrollDown = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']");
    // Кнопка "Заказать" в хедере страницы.
    private final By btnHeaderOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    // Элемент "Статус заказа" в хедере страницы.
    private final By btnHeaderStatus = By.className("Header_Link__1TAG7");
    // Поле ввода номера заказа - Появляется после клика по кнопке "Статус заказа"
    private final By inputOrderNumber = By.cssSelector("input[class='Input_Input__1iN_Z Header_Input__xIoUq']");
    // Кнопка "Go" - Появляется после клака по кнопке "Статус заказа"
    private final By btnGo = By.cssSelector("button[class='Button_Button__ra12g Header_Button__28dPO']");
    // Картинка "Самокат" blueprint.
    private final By imgBlueprint = By.xpath(".//img[@src='/assets/blueprint.png']");
    // Картинка "Самокат" scooter.
    private final By imgScooter = By.xpath(".//img[@src='/assets/scooter.png']");
    // Элемент-блок с параметрами самоката (скорость, расстояние, вес).
    private final By tableParameter = By.xpath(".Home_Table__2kPxP");
    // Блок с характеристиками
    private final By tableParameterRow = By.xpath(".Home_Row__jdQW2");

    // Модель Toxic PRO
    private final By tableElementModelToxicPro = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()=' Модель Toxic PRO']");
    // Максимальная скорость
    private final By tableElementMaxSpeed = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='Максимальная скорость']");
    // 40 км/ч
    private final By tableElementMaxSpeedValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='40 км/ч']");
    // Проедет без подзарядки
    private final By tableElementWithoutCharge = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='Проедет без поздарядки']");
    // 80 км
    private final By tableElementWithoutChargeValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='80 км']");
    // Выдерживает вес
    private final By tableElementWeight = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='Выдерживает вес']");
    // 120 кг


    private final By tableElementWeightValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='120 кг']");
    // Подзаголовок "Как это работает"
    private final By subHeaderHowItWorks = By.xpath(".//div[text()='Как это работает']");
    // Элемент "Кружок с цифрой 1 внутри"
    private final By circleWithNumberOne = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='1']");
    // Элемент "Кружок с цифрой 2 внутри".
    private final By circleWithNumberTwo = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='2']");
    // Элемент "Кружок с цифрой 3 внутри".
    private final By circleWithNumberThree = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='3']");
    // Элемент "Кружок с цифрой 4 внутри".
    private final By circleWithNumberFour = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp Home_Lineless__2-Rxp' and text()='4']");

    // Шаг 1 "Заказываете самокат"
    private final By orderingAScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='Заказываете самокат']");
    // Описание Шага 1 "Выбираете, когда и куда привезти". !!!
    private final By additionalDiscriptionOfOrderingAScooter = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    // Шаг 2 "Курьер привозит самокат".
    private final By courierBringsAScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='Курьер привозит самокат']");
    // Описание Шага 2 "А вы — оплачиваете аренду"
    private final By additionalDiscriptionOfCourierBringsAScooter = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='А вы — оплачиваете аренду']");
    // Шаг 3 "Катаетесь".
    private final By riding = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='Катаетесь']");
    // Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    private final By additionalDiscriptionOfRiding = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='Сколько часов аренды осталось — видно на сайте']");
    // Шаг 4 "Курьер забирает самокат".
    private final By courierPicksUpTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='Курьер забирает самокат']");
    // Описание Шага 4 "Когда аренда заканчивается".
    private final By additionalDiscriptionOfCourierPicksUpTheScooter = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='Когда аренда заканчивается']");
    // Кнопка "Заказать" в нижней части страницы.
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    // Вопросы о важном
    private final By subHeaderForScroll = By.xpath(".//div[text()='Вопросы о важном']");
    // Блок вопросов:
    private final By ImportantQuestions = By.className("accordion");
    // Вопрос №1 "Сколько это стоит и как оплатить"
    private final By questionHowMuchDoesItCoast = By.id("accordion__heading-0");
    // Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой.".
    private final By answerTheQuestionHowMuchDoesItCoast = By.id("accordion__panel-0");
    // Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
    private final By questionIWantSeveralScooterAtOnce = By.id("accordion__heading-1");
    // Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    private final By answerTheQuestionIWantSeveralScooterAtOnce = By.id("accordion__panel-1");
    // Вопрос №3 "Как рассчитывается время аренды?"
    private final By questionHowTheRentalTimeIsCalculated = By.id("accordion__heading-2");
    // Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    private final By answerTheQuestionHowTheRentalTimeIsCalculated = By.id("accordion__panel-2");
    // Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
    private final By questionIsItPossibleToOrderAScooterRightForToday = By.id("accordion__heading-3");
    // Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    private final By answerTheQuestionIsItPossibleToOrderAScooterRightForToday = By.id("accordion__panel-3");
    // Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By questionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__heading-4");
    // Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    private final By answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__panel-4");
    // Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
    private final By questionYouBringTheChargingAlongWithTheScooter = By.id("accordion__heading-5");
    // Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.""
    private final By answerTheQuestionYouBringTheChargingAlongWithTheScooter = By.id("accordion__panel-5");
    // Вопрос №7 "Можно ли отменить заказ?"
    private final By questionIsItPossibleToCancelTheOrder = By.id("accordion__heading-6");
    // Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    private final By answerTheQuestionIsItPossibleToCancelTheOrder = By.id("accordion__panel-6");
    // Вопрос №8 "Я жизу за МКАДом, привезёте?"
    private final By questionILeaveBehindTheMKADWillYouBringMe = By.id("accordion__heading-7");
    // Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    private final By answerTheQuestionILeaveBehindTheMKADWillYouBringMe = By.id("accordion__panel-7");


    public void scrollSubHeaderForScroll(WebDriver driver) {
        WebElement element = driver.findElement(subHeaderForScroll);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickQuestionHowMuchDoesItCoast(WebDriver driver) {
        driver.findElement(questionHowMuchDoesItCoast).click();
    }

    public String getTextOfAnswerTheQuestionHowMuchDoesItCoast(WebDriver driver) {
        return driver.findElement(answerTheQuestionHowMuchDoesItCoast).getText();
    }

    public String textOfAnswerTheQuestionHowMuchDoesItCoast(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionHowMuchDoesItCoast(driver);
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionHowMuchDoesItCoast));
        return getTextOfAnswerTheQuestionHowMuchDoesItCoast(driver);
    }

    public void clickQuestionIWantSeveralScooterAtOnce(WebDriver driver) {
        driver.findElement(questionIWantSeveralScooterAtOnce).click();
    }

    public String getTextOfAnswerTheQuestionIWantSeveralScooterAtOnce(WebDriver driver) {
        return driver.findElement(answerTheQuestionIWantSeveralScooterAtOnce).getText();
    }

    public String textOfAnswerTheQuestionIWantSeveralScooterAtOnce(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionIWantSeveralScooterAtOnce(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIWantSeveralScooterAtOnce));
        return getTextOfAnswerTheQuestionIWantSeveralScooterAtOnce(driver);
    }

    public void clickQuestionHowTheRentalTimeIsCalculated(WebDriver driver) {
        driver.findElement(questionHowTheRentalTimeIsCalculated).click();
    }

    public String getTextOfAnswerTheQuestionHowTheRentalTimeIsCalculated(WebDriver driver) {
        return driver.findElement(answerTheQuestionHowTheRentalTimeIsCalculated).getText();
    }

    public String textOfAnswerTheQuestionHowTheRentalTimeIsCalculated(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionHowTheRentalTimeIsCalculated(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionHowTheRentalTimeIsCalculated));
        return getTextOfAnswerTheQuestionHowTheRentalTimeIsCalculated(driver);
    }

    public void clickQuestionIsItPossibleToOrderAScooterRightForToday(WebDriver driver) {
        driver.findElement(questionIsItPossibleToOrderAScooterRightForToday).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday(WebDriver driver) {
        return driver.findElement(answerTheQuestionIsItPossibleToOrderAScooterRightForToday).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionIsItPossibleToOrderAScooterRightForToday(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToOrderAScooterRightForToday));
        return getTextOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday(driver);
    }

    public void clickQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(WebDriver driver) {
        driver.findElement(questionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(WebDriver driver) {
        return driver.findElement(answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier));
        return getTextOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(driver);
    }

    public void clickQuestionYouBringTheChargingAlongWithTheScooter(WebDriver driver) {
        driver.findElement(questionYouBringTheChargingAlongWithTheScooter).click();
    }

    public String getTextOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter(WebDriver driver) {
        return driver.findElement(answerTheQuestionYouBringTheChargingAlongWithTheScooter).getText();
    }

    public String textOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionYouBringTheChargingAlongWithTheScooter(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionYouBringTheChargingAlongWithTheScooter));
        return getTextOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter(driver);
    }

    public void clickQuestionIsItPossibleToCancelTheOrder(WebDriver driver) {
        driver.findElement(questionIsItPossibleToCancelTheOrder).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToCancelTheOrder(WebDriver driver) {
        return driver.findElement(answerTheQuestionIsItPossibleToCancelTheOrder).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToCancelTheOrder(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionIsItPossibleToCancelTheOrder(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToCancelTheOrder));
        return getTextOfAnswerTheQuestionIsItPossibleToCancelTheOrder(driver);
    }

    public void clickQuestionILeaveBehindTheMKADWillYouBringMe(WebDriver driver) {
        driver.findElement(questionILeaveBehindTheMKADWillYouBringMe).click();
    }

    public String getTextOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe(WebDriver driver) {
        return driver.findElement(answerTheQuestionILeaveBehindTheMKADWillYouBringMe).getText();
    }

    public String textOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionILeaveBehindTheMKADWillYouBringMe(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionILeaveBehindTheMKADWillYouBringMe));
        return getTextOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe(driver);

    }

    public OrderScooterPage clickBtnHeaderOrder(WebDriver driver) {
        driver.findElement(btnHeaderOrder).click();
        return new OrderScooterPage(driver);
    }

    public OrderScooterPage clickBtnMiddleOrder(WebDriver driver) {
        WebElement element = driver.findElement(btnMiddleOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return new OrderScooterPage(driver);
    }

}
