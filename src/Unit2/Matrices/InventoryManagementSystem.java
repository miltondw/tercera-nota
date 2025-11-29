package Unit2.Matrices;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al sistema de inventarios ***");

        // Declaración del vector para los precios (5 productos)
        float[] precios = new float[5];
        int tamañoProductos = precios.length;
        int[][] sucursales = new int[4][5]; // Hay cuatro sucursales de la empresa principal.
        int tamañoVector = sucursales.length;

        // Ciclos for para inicializar los vectores
        for (int i = 0; i < tamañoProductos; i++) {
            // Guardar los precios
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = consola.nextFloat();
        }

        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < tamañoVector; i++) {
            for (int j = 0; j < sucursales[i].length; j++) {
                // Guardar las cantidades de cada producto
                System.out.print("Ingrese la cantidad del producto " + (j + 1) +
                        " en la sucursal " + (i + 1) + ": ");
                sucursales[i][j] = consola.nextInt();
            }
            System.out.println("****************************************************");
        }

        // Calculos del sistema
        int[] cantTotalProductos = new int[5];
        int cantSucursal2 = 0;
        float[] recaudacionSucursal = new float[4];
        float recaudacionEmpresa = 0;
        int cantArti3 = 0;

        for (int i = 0; i < tamañoVector; i++) {
            for (int j = 0; j < sucursales[i].length; j++) {
                // Calcular la cantidad total de cada articulo
                cantTotalProductos[j] += sucursales[i][j];
                // Calcular la cantidad de articulos en la sucursal 2
                cantSucursal2 += sucursales[1][j];
                // Calcular la recaudación total de cada sucursal
                recaudacionSucursal[i] += sucursales[i][j] * precios[j];
            }
            // Calcular la cantidad del articulo 3 en la sucursal 1.
            cantArti3 = sucursales[0][2];
            // Calcular la recaudación total de la empresa
            recaudacionEmpresa += recaudacionSucursal[i];
        }

        // Ciclo for para determinar la sucursal con mayor recaudación
        float sucursalMayor = 0;
        int numSucursalMayor = 0;
        for (int i = 0; i < tamañoVector; i++) {
            if (recaudacionSucursal[i] > sucursalMayor) {
                sucursalMayor = recaudacionSucursal[i];
                numSucursalMayor = i + 1;
            }
        }

        // Impresión de todos los calculos
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("*** Impresión de todos los cálculos realizados ***");
        for (int i = 0; i < tamañoProductos; i++) {
            System.out.println("La cantidad total del articulo " + (i + 1) + " es: " + cantTotalProductos[i]);
        }
        System.out.println("****************************************************");
        System.out.println("La cantidad de articulos disponibles en la sucursal 2 es de: " + cantSucursal2);
        System.out.println("****************************************************");
        System.out.println("La cantidad del articulo 3 en la sucursal 1 es de: " + cantArti3);
        System.out.println("****************************************************");
        for (int i = 0; i < 4; i++) {
            System.out.println("La recaudación total de la sucursal " + (i + 1) + " es de: " + recaudacionSucursal[i]);
        }
        System.out.println("La sucursal de mayor recaudación es: " + numSucursalMayor);
        System.out.println("La recaudación total de la empresa es de: " + recaudacionEmpresa);
    }
}
