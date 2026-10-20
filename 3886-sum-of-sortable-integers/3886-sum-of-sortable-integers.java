class Solution {
    public int sortableIntegers(int[] nums) {
        int ans = 0;
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        List<Integer> div = new ArrayList<>();

        for (int i=1; i * i <=nums.length; i++){
            if (nums.length % i == 0){
                div.add(i);

                if (i != nums.length / i){
                    div.add(nums.length/i);
                }
            }      
        }

        for (int k : div){
            boolean sortable = true;

            for (int i=0; i<nums.length && sortable; i+=k){
                int des = 0;
                int pos = -1;

                for (int j=0; j<k; j++){
                    int a = nums[i + j];
                    int b = nums[i + (j+1) % k];

                    if (a > b){
                        des++;
                        pos = j;
                        if (des > 1){
                            break;
                        }
                    }
                }
                if (des > 1){
                    sortable = false;
                    break;
                }

                int rotate = (des == 0) ? 0 : (pos + 1) % k;

                for (int j=0; j<k; j++){
                    if (nums[i + (rotate + j) % k] != sorted[i + j]){
                        sortable = false;
                        break;
                    }
                }
            }
            if (sortable){
                ans += k;
            }
        }
        return ans;
    }
}