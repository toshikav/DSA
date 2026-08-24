class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || num < max.peek()){
            max.offer(num);
        }else{
            min.offer(num);
        }

        if (max.size() > min.size() + 1){
            min.offer(max.poll());
        }
        if (min.size() > max.size() + 1){
            max.offer(min.poll());
        }

    }
    
    public double findMedian() {
        if(min.size() == max.size()){
            return (max.peek() + min.peek())/2.0;
        }

        if(max.size() > min.size()){
            return max.peek();
        }

        return min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */