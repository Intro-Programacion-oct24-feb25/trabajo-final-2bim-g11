def obtener_informacion(total_participantes):
    if 1 <= total_participantes <= 5:
        return "Poca participación en el club, hay que mejorar."
    elif 6 <= total_participantes <= 15:
        return "Buena participación, sigan así."
    elif total_participantes >= 16:
        return "Excelente campaña en el club."
    else:
        return "Mala campaña, debemos mejorar."

def obtener_reporte(actividades, participantes_registrados):
    reporte = "Las actividades ingresadas son:\n"
    for i, actividad in enumerate(actividades):
        reporte += f"{i+1} Numero de participantes {actividad}: {participantes_registrados[i]}\n"
    return reporte