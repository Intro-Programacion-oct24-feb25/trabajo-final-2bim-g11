try:
    from paquete01 import futbol
    from paquete02 import natacion
    from paquete03 import atletismo
    from paquete04 import basquetbol
    from paquete05 import ciclismo
    from paquete06 import tenis
    from paquete07 import yoga
    from paquete08 import Reporte
except ModuleNotFoundError as e:
    print(f"Error: {e}. Asegúrese de que todos los módulos necesarios estén instalados y disponibles.")
    exit(1)


def main():
    actividades = ["Fútbol", "Natación", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"]
    participantes_registrados = [0] * len(actividades)


    while True:
        print("Menú:\n")
        for i, actividad in enumerate(actividades, 1):
            print(f"{i}. {actividad}")

        try:
            opcion = int(input("Ingrese la actividad en la que desea registrar un nuevo participante: "))
            if opcion < 1 or opcion > 7:
                raise ValueError("Opción fuera de rango.")
        except ValueError as ve:
            print(f"Entrada inválida: {ve}. Intente nuevamente.")
            continue

        if opcion == 1:
            Futbol.registrar_participante_futbol()
        elif opcion == 2:
            Natacion.registrar_participante_natacion()
        elif opcion == 3:
            Atletismo.registrar_participante_atletismo()
        elif opcion == 4:
            Basquetbol.registrar_participante_basquetbol()
        elif opcion == 5:
            Ciclismo.registrar_participante_ciclismo()
        elif opcion == 6:
            Tenis.registrar_participante_tenis()
        elif opcion == 7:
            Yoga.registrar_participante_yoga()

        participantes_registrados[opcion - 1] += 1

        continuar = input("¿Desea ingresar otro participante? (S/N): ").strip().upper()
        if continuar != "S":
            break

    total_participantes = sum(participantes_registrados)
    informacion = Reporte.obtener_informacion(total_participantes)
    print(informacion)
    reporte = Reporte.obtener_reporte(actividades, participantes_registrados)
    print(reporte)


if __name__ == "__main__":
    main()
