"""
Ejemplo de paso por valor en Python
Demuestra cómo encontrar el número mayor entre tres valores
"""

def encontrar_mayor(a, b, c):
    """
    Encuentra el mayor de tres números usando la función max()
    
    Args:
        a: Primer número
        b: Segundo número
        c: Tercer número
    
    Returns:
        El mayor de los tres números
    """
    return max(a, b, c)

# Ejecutar y mostrar el resultado
print("El número mayor es:", encontrar_mayor(10, 20, 5))
