class Solution {
    public int solution(int n, int[] stations, int w) {
     

                int answer = 0;
        int start = 1;

        for (int i : stations){

            if (start < i-w) {
                int end = i-w;
                int length = end - start;
                int count = length / (w *2 +1) ;

                if (length % (w * 2 + 1) != 0) {
                    count++;
                }
                answer += count;
            }

            start = i + w+1 ;
        }

        if (stations[stations.length -1] +w+1 <= n) {
            start = stations[stations.length -1] + w +1;
            int end = n+1;
            int length = end - start;

            int count = length/(w *2 +1);

            if (length % (w *2 +1) != 0) {
                count++;
            }
            answer += count;

        }
        return answer;
    }
}