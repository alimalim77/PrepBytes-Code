#include <stdio.h>

#define M 10
#define N 10

int main()
{
    int m, n, c, d, one[M][N], two[M][N], three[M][N];
    printf("Enter the number of rows and columns of matrix: ");
    scanf("%d%d", &m, &n);
    printf("Enter the elements of first matrix: ");
    for (c = 0; c < m; c++)
        for (d = 0; d < n; d++) scanf("%d", &one[c][d]);
    printf("Enter the elements of second matrix: ");
    for (c = 0; c < m; c++)
        for (d = 0; d < n; d++) scanf("%d", &two[c][d]);
    printf("Sum of entered matrices:\n");
    for (c = 0; c < m; c++)
    {
        for (d = 0; d < n; d++)
        {
            three[c][d] = one[c][d] + two[c][d];
            printf("%d\t", three[c][d]);
        }
        printf("\n");
    }
    return 0;
}
