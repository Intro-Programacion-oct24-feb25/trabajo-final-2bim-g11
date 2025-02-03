def registrar_participante_ciclismo():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    tipo_ciclismo = input("Ingrese el tipo de ciclismo (montaña, ruta, urbano): ")
    ciudad = input("Ingrese la ciudad: ")
    marca_bicicleta = input("Ingrese la marca de bicicleta preferida: ")

    cadena = f"""
    Resumen de registro - Ciclismo:
    Nombre: {nombre}
    Edad: {edad}
    Tipo de ciclismo: {tipo_ciclismo}
    Ciudad: {ciudad}
    Marca de bicicleta preferida: {marca_bicicleta}
    """

    return cadena