
public class equilibrium {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        int leftSum = 0;
        int index = -1;

        for (int i = 0; i < n.length; i++) {
            int rightSum = sum - leftSum - n[i];

            if (leftSum == rightSum) {
                index = i;
                break;
            }

            leftSum += n[i];
        }

        if (index != -1) {
            System.out.println("Equilibrium index exists at position: " + index);
        } else {
            System.out.println("No equilibrium index exists in the array");
        }
    }
}
