#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX(X, Y)	((X) > (Y) ? X : Y)

int main(void) {
	char *s1 = (char *)malloc(sizeof(char) * 1000);
	char *s2 = (char *)malloc(sizeof(char) * 1000);
	int **DP = (int **)malloc(sizeof(int *) * 1000);
	int i = 0, j = 0;

	scanf("%s", s1);
	scanf("%s", s2);

	for (i = 0; i < 1000; i++) {
		DP[i] = (int *)malloc(sizeof(int)*1000);
	}

	for (i = 0; i < strlen(s1); i++) {
		for (j = 0; j < strlen(s2); j++) {
			if (s1[i] == s2[j]) {
				if (i == 0 && j == 0) {
					DP[i][j] = 1;
				}
				else if (i == 0 && j != 0) {
					DP[i][j] = 1;
				}
				else if (i != 0 && j == 0) {
					DP[i][j] = 1;
				}
				else {
					DP[i][j] = DP[i - 1][j - 1] + 1;
				}
			}
			else {
				if (i == 0 && j == 0) {
					DP[i][j] = 0;
				}
				else if (i == 0 && j != 0) {
					DP[i][j] = DP[i][j - 1];
				}
				else if (i != 0 && j == 0) {
					DP[i][j] = DP[i - 1][j];
				}
				else {
					DP[i][j] = MAX(DP[i][j - 1], DP[i - 1][j]);
				}
			}
		}
	}
	printf("%d\n", DP[strlen(s1)-1][strlen(s2)-1]);
}