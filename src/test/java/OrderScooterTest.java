import org.example.pageObject.HomePageScooter;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;


public class OrderScooterTest extends BaseTest {

    @Test
    public void clickBtnHeaderOrderAndfillInTheSectionForWhomTheScooterAndAboutRent() {
        //Данные для формы 1
        String name = "Иван";
        String surname = "Иванович";
        String address = "Москва";
        int stationNumber = 21;
        String phone = "89870000007";
        //Данные для формы 2
        String dayOfArrival = "16.08.2022";
        String comment = "Пишите в Ватсап";
        int amountOfDays = 1;
        //всего 2, n-1
        int colorNumber = 0;

        String expectedResult = "Заказ оформлен";
        HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnHeaderOrder(driver).orderScooter(name, surname, address, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        MatcherAssert.assertThat("Заголовок окна успешного оформления заказа не соответвует ожидаемому. Ожидаемый заголовок: Заказ оформлен", actualResult, containsString(expectedResult));
    }

    @Test
    public void clickBtnMiddleOrderfillInTheSectionForWhomTheScooterAndAboutRentWithOtherDetails() {
        //Данные для формы 1
        String name = "Андрей";
        String surname = "Андреевич";
        String address = "Казань";
        int stationNumber = 3;
        String phone = "923477426651";
        //Данные для формы 2
        String dayOfArrival = "15.09.2022";
        String comment = "Пишите сообщение, если не взял трубку";
        int amountOfDays = 3;
        //всего 2, n-1
        int colorNumber = 1;

        String expectedResult = "Заказ оформлен";
        HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnMiddleOrder(driver).orderScooter(name, surname, address, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        MatcherAssert.assertThat("Заголовок окна успешного оформления заказа не соответвует ожидаемому. Ожидаемый заголовок: Заказ оформлен", actualResult, containsString(expectedResult));
    }

}