def registrar_participante_tenis():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    nivel = input("Ingrese el nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ingrese la ciudad: ")
    mano_habil = input("Ingrese la mano hábil (derecha/izquierda): ")

    cadena = f"""
    Resumen de registro - Tenis:
    Nombre: {nombre}
    Edad: {edad}
    Nivel: {nivel}
    Ciudad: {ciudad}
    Mano hábil: {mano_habil}
    """