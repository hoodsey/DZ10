public class Radio {
    private int minNumber = 0; // минимальный номер радиостанции

    private int defaultCountNumber = 10; // кол-во радиостанций по умолчанию
    private int currentNumber = minNumber;//Номер текущей радиостанции
    private int maxVolume = 100; // максимальная громкость звука
    private int minVolume = 0; // минимальная громкость звука
    private int currentVolume = minVolume;//Громкость звука

    public Radio(int maxNumber) { // констурктор с парметром количесвта радиостанций
        this.defaultCountNumber = maxNumber;
        this.currentVolume = minVolume;
        this.currentNumber = minNumber;

    }

    public Radio() { // конструктор без парметра
        this.defaultCountNumber = 10;
        this.currentVolume = minVolume;
        this.currentNumber = minNumber;

    }

    public void nextNumber() {//метод перекллючения номера по кнопке next
        if (currentNumber == defaultCountNumber - 1) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    public void prevNumber() {//метод переключения номера по кнопке prev
        if (currentNumber == minNumber) {
            currentNumber = defaultCountNumber - 1;
        } else {
            currentNumber = currentNumber - 1;
        }
    }

    public void setCurrentNumber(int newCurrentNumber) {//метод-сеттер номера
        if (newCurrentNumber < minNumber || newCurrentNumber > defaultCountNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public int GetCurrentNumber() {//метод-геттер номера
        return currentNumber;
    }

    public int GetCurrentVolume() {//метод-геттер звука
        return currentVolume;
    }

    public int GetDefaultNumber() {//метод-геттер звука
        return defaultCountNumber;
    }

    public int GetMinNumber() {//метод-геттер звука
        return minNumber;
    }

    public int GetMaxVolume() {//метод-геттер звука
        return maxVolume;
    }

    public int GetMinVolume() {//метод-геттер звука
        return minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {//метод-сеттер звука
        if (newCurrentVolume < minVolume || newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextVolume() {//метод перекллючения звука по кнопке next
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevVolume() {//метод переключения звука по кнопке prev
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

}
