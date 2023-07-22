
// This is the finding of minimum cost of spanning tree by prims methody

import java.util.Scanner;

public class Prims {
    public static void main(String[] args) {
        int i, j, n, source, vertex = 0;
        int weight[][] = new int[10][10];
        int u = 0, v = 0;
        int sum = 0;
        int min;
        int value[] = new int[10];
        System.out.println("Enter the number of vertecice: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            value[i] = 0;
        System.out.println("Enter the weighted graph: ");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                weight[i][j] = sc.nextInt();
        System.out.println("Enter the source vertex: ");
        source = sc.nextInt();
        value[source] = 1;
        vertex = 1;
        while (vertex <= n - 1) {
            min = 99;
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)
                    if (value[i] == 1 && value[j] == 0)
                        if (i != j && min > weight[i][j]) {
                            min = weight[i][j];
                            u = i;
                            v = j;
                        }
            value[v] = 1;
            sum = sum + min;
            vertex++;
            System.out.println(u + " -> " + v + " = " + min);
        }
        System.out.println("minimum cost of spanning tree is: " + sum);
    }
}

