public class suma {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Por favor, ingrese un número x y al menos dos números en el arreglo.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int[] array = new int[args.length - 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i + 1]);
        }

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}