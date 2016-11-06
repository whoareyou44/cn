import java.util.*;
class DVR {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total no. of Nodes : ");
        int v = sc.nextInt();
        int cost[][] = new int[v + 1][v + 1];
        System.out.println("Enter the initial Routing Table \nEnter 99 if there is no connection ");
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                cost[i][j] = sc.nextInt();
                cost[j][i] = cost[i][j];
            }
        }
    System.out.println("\nInitial Routing Table : ");
    for (int i = 1; i <= v; i++) {
        System.out.println();
        for (int j = 1; j <= v; j++) {
            System.out.print(" " + cost[i][j]);
        }
    }
    for (int k = 1; k <= v; k++) {
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                if (cost[i][j] > cost[i][k] + cost[k][j])
                    cost[i][j] = cost[i][k] + cost[k][j];
            }
        }
    }
    System.out.println("\nFinal Routing Table is : ");
    for (int i = 1; i <= v; i++) {
        System.out.println();
        for (int j = 1; j <= v; j++) {
            System.out.print(" " + cost[i][j]);
        }
    }
    System.out.println();
}
}
