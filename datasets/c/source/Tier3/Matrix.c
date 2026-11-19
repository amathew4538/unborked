#include <stdio.h>

int main(void) {
    int left[2][3];
    int right[3][2];
    printf("Enter six sales values (rows: two products x three regions):\n");
    for (int r = 0; r < 2; ++r)
        for (int c = 0; c < 3; ++c)
            if (scanf("%d", &left[r][c]) != 1) left[r][c] = (r + 1) * (c + 1);

    printf("Enter three region weights x two stores:\n");
    for (int r = 0; r < 3; ++r)
        for (int c = 0; c < 2; ++c)
            if (scanf("%d", &right[r][c]) != 1) right[r][c] = r + c + 1;

    for (int row = 0; row < 2; row++) {
        for (int column = 0; column < 2; column++) {
            int value = 0;
            for (int inner = 0; inner < 3; inner++) {
                value += left[row][inner] * right[inner][column];
            }
            printf("%d%s", value, column == 1 ? "\n" : " ");
        }
    }
    return 0;
}
