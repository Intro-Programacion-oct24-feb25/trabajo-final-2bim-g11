def registrar_participante_yoga():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    nivel = input("Ingrese el nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ingrese la ciudad: ")
    estilo_yoga = input("Ingrese el estilo de yoga preferido: ")

    cadena = f"""
    Resumen de registro - Yoga:
    Nombre: {nombre}
    Edad: {edad}
    Nivel: {nivel}
    Ciudad: {ciudad}
    Estilo de yoga preferido: {estilo_yoga}
    """

    return cadena