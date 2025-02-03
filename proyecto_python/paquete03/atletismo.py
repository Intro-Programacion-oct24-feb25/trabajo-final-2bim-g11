def registrar_participante_atletismo():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    especialidad = input("Ingrese la especialidad (carreras, salto, lanzamiento): ")
    ciudad = input("Ingrese la ciudad: ")
    record_personal = input("Ingrese el récord personal: ")

    cadena = f"""
    Resumen de registro - Atletismo:
    Nombre: {nombre}
    Edad: {edad}
    Especialidad: {especialidad}
    Ciudad: {ciudad}
    Record Personal: {record_personal}
    """

    return cadena