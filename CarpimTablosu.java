public class CarpimTablosu {
    public static void main(String[] args) {
        // Çarpım tablosunun boyutunu belirleme
        int tabloBoyutu = 10;

        // İç içe for döngüsü kullanarak çarpım tablosunu oluşturma
        for (int i = 1; i <= tabloBoyutu; i++) {
            for (int j = 1; j <= tabloBoyutu; j++) {
                System.out.print(i * j + "\t"); // \t ile boşluk bırakma
            }
            System.out.println(); // Her satırın sonunda bir alt satıra geç
        }
    }
}
