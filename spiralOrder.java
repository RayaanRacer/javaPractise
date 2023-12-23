class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int left=0;
        int top=0;
        int right = matrix[0].length-1;
        int bottom = matrix.length -1;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right;i++){
                ll.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ll.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                ll.add(matrix[bottom][i]);
            
            }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                ll.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return ll;
    }
}