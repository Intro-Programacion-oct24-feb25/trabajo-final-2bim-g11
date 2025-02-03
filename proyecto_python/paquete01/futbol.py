def registrar_participante_futbol():
    print("Ingrese el nombre del participante: ")
    nombre = input()

    print("Ingrese la edad del participante: ")
    edad = int(input())

    print("Ingrese la posición preferida: ")
    posicion = input()

    print("Ingrese la ciudad: ")
    ciudad = input()

    print("Ingrese el equipo favorito: ")
    equipo_favorito = input()

    cadena = (
        "Resumen de registro - Fútbol:\n"
        f"Nombre: {nombre}\n"
        f"Edad: {edad}\n"
        f"Posición: {posicion}\n"
        f"Ciudad: {ciudad}\n"
        f"Equipo favorito: {equipo_favorito}\n"
    )

    return cadena