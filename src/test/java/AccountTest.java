import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    @DisplayName("Корректное имя")
    public void checkNameToEmbossValidNameReturnTrue() {

        step("Проверить корректное имя");
        Account account = new Account("Тимоти Шаламе");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertTrue(isPrintable);
    }

    @Test
    @DisplayName("Имя 2 символа")
    public void checkNameToEmbossLessThanThreeCharsNameReturnFalse() {

        step("Проверить имя 2 символа");
        Account account = new Account("Ти");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Test
    @DisplayName("Имя 3 символа")
    public void checkNameToEmbossThreeCharsNameReturnTrue() {

        step("Проверить имя 3 символа");
        Account account = new Account("Т м");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertTrue(isPrintable);
    }

    @Test
    @DisplayName("Имя 19 символов")
    public void checkNameToEmbossNineteenCharsNameReturnTrue() {

        step("Проверить имя 19 символов");
        Account account = new Account("Алишер Моргенштерн");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertTrue(isPrintable);
    }

    @Test
    @DisplayName("Имя больше 19 символов")
    public void checkNameToEmbossMoreThanNineteenCharsNameReturnFalse() {

        step("Проверить имя больше 19 символов");
        Account account = new Account("Алишер Моргенштерн-Рэй-Фернандес");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Test
    @DisplayName("Имя без пробелов")
    public void checkNameToEmbossNameWithNoWhitespacesReturnFalse() {

        step("Проверить имя без пробелов");
        Account account = new Account("Тим");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Test
    @DisplayName("Имя с пробелом в начале")
    public void checkNameToEmbossNameStartsWithWhitespaceReturnFalse() {

        step("Проверить имя с пробелом в начале");
        Account account = new Account(" Тим");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Test
    @DisplayName("Имя с пробелом в конце")
    public void checkNameToEmbossNameEndsWithWhitespaceReturnFalse() {

        step("Проверить имя с пробелом в конце");
        Account account = new Account("Тим ");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Test
    @DisplayName("Имя с двумя пробелами")
    public void checkNameToEmbossNameWithTwoWhitespacesReturnFalse() {

        step("Проверить имя с пробелом в начале");
        Account account = new Account("Т и м");
        boolean isPrintable = account.checkNameToEmboss();
        Assert.assertFalse(isPrintable);
    }

    @Step("{0}")
    void step(String message) {}

}
