//@author: Raffi Fadlika
//@nim: 42623002

public class TugasArray {
    public static void main(String[] args) {
        String[][] mahasiswaSemesterAkhir = {
                {"1", "Ahmad", "81", "90", "62"},
                {"2", "Adang", "50", "83", "87"},
                {"3", "Dani", "89", "55", "65"},
                {"4", "Edi", "77", "70", "92"}
        };

        System.out.println("NRP\tRata-rata");
        System.out.println("-----------------------");

        for (int i = 0; i < mahasiswaSemesterAkhir.length; i++) {
            int MataKuliahRPL = Integer.parseInt(mahasiswaSemesterAkhir[i][2]);
            int MataKuliahBasisData = Integer.parseInt(mahasiswaSemesterAkhir[i][3]);
            int MataKuliahPBO = Integer.parseInt(mahasiswaSemesterAkhir[i][4]);

            double rataRata = (MataKuliahRPL + MataKuliahBasisData + MataKuliahPBO) / 3.0;

            System.out.printf("%s\t%.2f\n", mahasiswaSemesterAkhir[i][0], rataRata);
        }
        System.out.println("-----------------------");
    }
}
