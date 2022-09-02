public class Praktikum {

    public static void main(String[] args) {
        Account account = new Account("Тимоти Шаламе");
        boolean isPrintable = account.checkNameToEmboss();
        System.out.println(isPrintable);
    }
}
