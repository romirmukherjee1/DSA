class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length; 

        // Iterate over all combinations of three distinct points (i, j, k)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // FIX: Corrected loop condition from k > n to k < n
                for (int k = j + 1; k < n; k++) {
                    
                    // Use Shoelace Formula for area calculation:
                    // Area = 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
                    
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    
                    // Calculate the cross-product term
                    double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                    
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    
    // The getDist method is no longer needed with the Shoelace Formula approach.
}