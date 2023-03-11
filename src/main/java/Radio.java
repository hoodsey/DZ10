public class Radio {
    public int currentNumber;//Номер текущей радиостанции
    public int currentVolume;//Громкость звука

    public void increaseNumber() { //метод увеличения номера на 1
        if (currentNumber < 10) {
            currentNumber = currentNumber + 1;
        }
    }

    public void reduceNumber() { //метод уменьшения номера на 1
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
    }

    public void nextNumber() {//метод перекллючения номера по кнопке next
        if (currentNumber == 9) {
            currentNumber = 0;
        } else {
            increaseNumber();
        }
    }

    public void prevNumber() {//метод переключения номера по кнопке prev
        if (currentNumber == 0) {
            currentNumber = 9;
        } else {
            reduceNumber();
        }
    }

    public void setCurrentNumber(int newCurrentNumber) {//метод-сеттер номера
        if (newCurrentNumber < 0 || newCurrentNumber > 10) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void increaseVolume() {  //метод увеличения звука на 1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {  //метод уменьшения звука на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextVolume() {//метод перекллючения звука по кнопке next
        if (currentVolume == 9) {
            return;
        } else {
            increaseVolume();
        }
    }

    public void prevVolume() {//метод переключения звука по кнопке prev
        if (currentVolume == 0) {
            return;
        } else {
            reduceVolume();
        }
    }

}
