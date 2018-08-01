public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazinelist = Arrays.asList(magazine);
        List<String> notelist = Arrays.asList(magazine);
        List<String> comparelist = notelist;

        for (int i = 0; i < magazine.length; i++) {
            if (notelist.contains(magazine[i])) {
                comparelist.remove(magazine[i]);
            }
        }
        if (comparelist.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
