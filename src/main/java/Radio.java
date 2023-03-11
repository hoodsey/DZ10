public class Radio {
    public int currentNumber;//Номер текущей радиостанции
    public int currentVolume;//Громкость звука

    public void increaseVolume() { //метод увеличения звука на 1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void nextVolume() {//метод перекллючения звука по кнопке next
        if (currentVolume == 9) {
            currentVolume = 0;
        } else {
            increaseVolume();
        }
    }

}
