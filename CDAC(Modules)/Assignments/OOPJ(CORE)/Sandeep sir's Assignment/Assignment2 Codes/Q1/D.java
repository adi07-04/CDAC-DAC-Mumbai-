 class D {
    public static void main(String[] args) {
        String strStatus = "0";
        if (strStatus.equals("0")){
            strStatus = "false";
        } else if (strStatus.equals("1")) {
            strStatus = "true";
        }
        boolean value = Boolean.parseBoolean(strStatus);
        System.out.println(value);
    }
}
