class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long o1 = (long) need1 * cost1 + (long) need2 * cost2;

        long common = Math.min(need1, need2);

        long o2 = common * costBoth + (long) (need1 - common) * cost1 + (long) (need2 - common) * cost2;

        long o3 = (long) Math.max(need1, need2) * costBoth;

        return  Math.min(Math.min(o2, o3), o1);

    }
}