class execption_handing_finally_keyword {
    public static void main(String[] args) {
        int i = 0; // change it to see the differencs
        int j = 0;
        try {
            j = 10 / i;
        } catch (Exception e) {
            System.out.println("Something went worng : " + e);
        } finally {
            System.out.println("See you soon ");
        }
    }
}