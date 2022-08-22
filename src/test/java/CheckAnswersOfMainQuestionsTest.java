import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pageObject.HomePageScooter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAnswersOfMainQuestionsTest extends BaseTest {

    @Before
    public void runBrowserAndURL() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get(HomePageScooter.URL);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void checkDropDownMenuOfTheQuestionHowMuchDoesItCoast(){
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowMuchDoesItCoast(driver);
        Assert.assertEquals("Текст вопроса №1 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIWantSeveralScooterAtOnce(){
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIWantSeveralScooterAtOnce(driver);
        Assert.assertEquals("Текст вопроса №2 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionHowTheRentalTimeIsCalculated() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowTheRentalTimeIsCalculated(driver);
        Assert.assertEquals("Текст вопроса №3 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToOrderAScooterRightForToday() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday(driver);
        Assert.assertEquals("Текст вопроса №4 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier(driver);
        Assert.assertEquals("Текст вопроса №5 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionYouBringTheChargingAlongWithTheScooter() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter(driver);
        Assert.assertEquals("Текст вопроса №6 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToCancelTheOrder() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToCancelTheOrder(driver);
        Assert.assertEquals("Текст вопроса №7 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionILeaveBehindTheMKADWillYouBringMe() {
        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe(driver);
        Assert.assertEquals("Текст вопроса №8 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    }
