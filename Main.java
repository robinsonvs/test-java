package secondInterview;

public class Main {



    public static void main(String[] args) {

//        Given a string S that consists of only alphanumeric characters and dashes.
//        The string is separated into N + 1 groups by N dashes.
//        Also given an integer K. We want to reformat the string S, such that each group contains exactly K characters,
//        except for the first group, which could be shorter than K but still must contain at least one character.
//        Furthermore, a dash must be inserted between two groups, and you should convert all lowercase letters to uppercase.
//        Return the reformatted string.
//        Examples:
//        Input: S = “5F3Z-2e-9-w”, K = 4
//        Output: “5F3Z-2E9W”
//        Explanation: The string S has been split into two parts, each part has 4 characters.
//                Note that two extra dashes are not needed and can be removed.
//                Input: S = “2-5g-3-J”, K = 2
//        Output: “2-5G-3J”
//        Explanation: The string s has been split into three parts,
//                each part has 2 characters except the first part
//        as it could be shorter as mentioned above


//        System.out.println(formatLicenseKey("5F3Z-2e-9-w", 4)); // 5F3Z-2E9W
//        System.out.println(formatLicenseKey("2-5g-3-J", 2));    // 2-5G-3J
//        System.out.println(formatLicenseKey("--a-a-a-a--", 2)); // AA-AA
//        System.out.println(formatLicenseKey("--", 3));

        //“5F3Z-2e-9-w”
        //



        System.out.println(formatLicenseKey("5F3Z-2e-9-w", 4)); // 5F3Z-2E9W
        System.out.println(formatLicenseKey("2-5g-3-J", 2));    // 2-5G-3J
        System.out.println(formatLicenseKey("--a-a-a-a--", 2)); // AA-AA
        System.out.println(formatLicenseKey("--", 3));

    }

    private static String formatLicenseKey(String s, int k) {
        String cleaned = s.replaceAll("-","").toUpperCase();
        int first = cleaned.length() % k;
        StringBuilder sb = new StringBuilder();

        if (first > 0) {
            sb.append(cleaned, 0, first);
            if (cleaned.length() > first) sb.append('-');
        }

        for (int i = first; i < cleaned.length(); i+=k) {
            sb.append(cleaned, i, i + k);
            if (i + k < cleaned.length()) sb.append('-');
        }

        return sb.toString();
    }
}
