static boolean stringContains(String longer, String shorter) {
    int i = 0;
    for (char c : shorter.toCharArray()) {
        i = longer.indexOf(c, i) + 1;
        if (i <= 0) { return false; }
    }
    return true;
}