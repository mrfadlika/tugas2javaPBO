//@author: Raffi Fadlika
//@nim: 42623002

public class DeretBilanganGenap {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            if (i % 6 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
