// Last updated: 10/12/2025, 5:36:07 PM
class ProductOfNumbers {
    List<Integer> pm;
    public ProductOfNumbers() {
        pm=new ArrayList<>();
        pm.add(1);
    }
    
    public void add(int num) {
        if(num==0)
        {
            pm.clear();
            pm.add(1);
            return;
        }
        pm.add(pm.get(pm.size()-1)*num);
    }
    
    public int getProduct(int k) {
        if(pm.size()<=k)
        {
            return 0;
        }
        return pm.get(pm.size()-1)/pm.get(pm.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */