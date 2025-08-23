// Last updated: 8/23/2025, 10:23:48 PM
class Spreadsheet {
    private int arr[][];
    public Spreadsheet(int rows) {
        arr=new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        arr[Integer.valueOf(cell.substring(1))-1][cell.charAt(0)-'A']=value;
    }
    
    public void resetCell(String cell) {
        arr[Integer.valueOf(cell.substring(1))-1][cell.charAt(0)-'A']=0;
    }
    
    public int getValue(String formula) {
    // Remove '=' at the beginning and split on '+'
    String[] parts = formula.substring(1).split("\\+");

    int sum = 0;
    for (String part : parts) {
        if (Character.isLetter(part.charAt(0))) {
            // It's a cell reference
            int col = part.charAt(0) - 'A';
            int row = Integer.parseInt(part.substring(1)) - 1;
            sum += arr[row][col];
        } else {
            // It's a number
            sum += Integer.parseInt(part);
        }
    }

    return sum;
}


}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */