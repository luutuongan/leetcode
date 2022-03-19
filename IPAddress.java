package leetcode.easy;

public class IPAddress {

    public static String defangIPaddr(String address) {
        String defang = "";
        for (int i = 0; i < address.length(); i++) {

            if ('.' == address.charAt(i)) {
                defang += "[.]";
            } else
                defang = defang + address.charAt(i);
        }
        return defang;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("192.168.1.1"));
    }
}
