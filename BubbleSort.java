
public class BubbleSort {
	public static void main(String[] args) {
        double [] arr = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        bubbleSort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%f ", arr[i]);
        }

    }
    
    public static void bubbleSort(double [] list) {
        boolean changed = true;
        
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list [j+1]) {
                    double temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    
                    changed = true;
                }
            }
        } while (changed);
    }


}
