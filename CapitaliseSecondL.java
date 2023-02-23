public class CapitaliseSecondL {

    public static void main(String[] args) {
        String str = "bvrit college";
        int l1index = str.indexOf('l');
        if (l1index != -1) {
            int l2index = str.indexOf('l', l1index + 1);
            if (l2index != -1) {
                String beforeL = str.substring(0, l2index);
                String afterL = str.substring(l2index + 1);
                char secondL = Character.toUpperCase(str.charAt(l2index));
                System.out.println("The result is: " + beforeL + secondL + afterL);
            }
        }
    }
}
