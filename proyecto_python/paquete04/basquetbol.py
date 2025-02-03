def registrar_participante_basquetbol():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    posicion = input("Ingrese la posición preferida: ")
    estatura = input("Ingrese la estatura: ")
    ciudad = input("Ingrese la ciudad: ")

    cadena = f"""
    Resumen de registro - Básquetbol:
    Nombre: {nombre}
    Edad: {edad}
    Posición preferida: {posicion}
    Estatura: {estatura}
    Ciudad: {ciudad}
    """

    return cadena