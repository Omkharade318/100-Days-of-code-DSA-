class Solution {
    public void rotate(int[][]matrix)
    {
        //Find the length of the matrix
        int n = matrix.length;

        // Step1:
        // Convert the matrix to transpose matrix.

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step2:
        // Reverse all the rows of the matrix

        for(int i = 0; i < n; i++)
        {
            int l = 0;
            int h = n-1;
            while(l < h)
            {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][h];
                matrix[i][h] = temp;
                l++;
                h--;
            }
        }
        
    }
}
