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

}
