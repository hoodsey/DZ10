public class Radio {
    private int currentNumber;//Номер текущей радиостанции
    private int currentVolume;//Громкость звука

    public void nextNumber() {//метод перекллючения номера по кнопке next
        if (currentNumber == 9) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    public void prevNumber() {//метод переключения номера по кнопке prev
        if (currentNumber == 0) {
            currentNumber = 9;
        } else {
            currentNumber = currentNumber - 1;
        }
    }

    public void setCurrentNumber(int newCurrentNumber) {//метод-сеттер номера
        if (newCurrentNumber < 0 || newCurrentNumber > 10) {
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

    public void setCurrentVolume(int newCurrentVolume) {//метод-сеттер звука
        if (newCurrentVolume < 0 || newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void nextVolume() {//метод перекллючения звука по кнопке next
        if (currentVolume == 9) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevVolume() {//метод переключения звука по кнопке prev
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

}
