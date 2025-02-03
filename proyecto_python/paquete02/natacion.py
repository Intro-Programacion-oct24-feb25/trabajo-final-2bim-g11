def registrar_participante_natacion():
    print("Ingrese el nombre del participante: ", end="")
    nombre = input()

    print("Ingrese la edad del participante: ", end="")
    edad = int(input())

    print("Ingrese el nivel (principiante, intermedio, avanzado): ", end="")
    nivel = input()

    print("Ingrese la ciudad: ", end="")
    ciudad = input()

    print("Ingrese el estilo favorito: ", end="")
    estilo_favorito = input()

    cadena = (
        "Resumen de registro - Natación:\n"
        f"Nombre: {nombre}\n"
        f"Edad: {edad}\n"
        f"Nivel: {nivel}\n"
        f"Ciudad: {ciudad}\n"
        f"Estilo favorito: {estilo_favorito}\n"
    )

    return cadena