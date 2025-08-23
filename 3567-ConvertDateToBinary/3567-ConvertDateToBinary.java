// Last updated: 8/23/2025, 10:24:10 PM
class Solution {
    public String convertDateToBinary(String date) {
        String year=Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
            String month=Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
            String dates=Integer.toBinaryString(Integer.parseInt(date.substring(8)));
            return (year+"-"+month+"-"+dates);
    }
}