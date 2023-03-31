import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack <String> jurusan = new Stack <String>();
        jurusan.push("Teknik Industri");
        jurusan.push("Teknik Informatika");
        jurusan.push("Ilmu Politik");
        
        System.out.println("\t Elemen dalam stack : \t" + jurusan);
        // jurusan.pop();
        // System.out.println("\t Elemen Setelah pop: \t" + jurusan);
        System.out.println("\t Nilai Elemen Teratas pada stack: \t" + jurusan.peek());

        System.out.println("\t Check Apakah Kosong? \t" + jurusan.empty());
        System.out.println("\t Check Apakah Kosong? \t" + jurusan.isEmpty());

        System.out.println("\t Lihat Index ke-2: \t" + jurusan.get(1));
        System.out.println("\n");
        System.out.println("\t Lihat Index Pertama: \t" + jurusan.firstElement());
        System.out.println("\t Lihat Index Terakhir: \t" + jurusan.lastElement());
        System.out.println("\n");
        // jurusan.remove(1);
        // System.out.println("\t Elemen Items Sebelum Clear: \t" + jurusan);
        // jurusan.clear();
        // System.out.println("\t Elemen Items Setelah Clear: \t" + jurusan);
        
        for (String j : jurusan){
        System.out.println("\t Elemen: \t" + j);
        }
    }
}
