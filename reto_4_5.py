''' 
def generar_reporte_resultados(marcadores) -> reporte
def el_mas_ganador(marcadores) -> diccionario {"mas_ganador": "equipoX"}
def el_menos_ganador(marcadores) -> diccionario {"menos_ganador": "equipoX"}
 '''


matriz = [ 
  [ (0,0), (3,0), (3,2), (3,0), (3,1) ],
       
  [ (1,3), (0,0), (3,2), (3,0), (2,3) ],
     
  [ (1,3), (1,3), (0,0), (2,3), (2,3) ],

  [ (2,3), (3,0), (3,2), (0,0), (3,1) ],

  [ (3,2), (3,0), (3,2), (3,0), (0,0) ] 

]
''' 
for i in range(0, len(matriz)):
        print(len(matriz[i]))
        for j in range(0,len(matriz[i])):
            print(matriz[i][j], end = '\t')
    print('\t')  '''


def generar_reporte_resultados(marcadores):
    resultados = []

    for fil in range(0, len(marcadores)):
        for col in range(0, len(marcadores[fil])):
            if marcadores[fil][col][0] == marcadores[fil][col][1]:
                valor = 0
                resultados.append(valor)
            elif marcadores[fil][col][0] > marcadores[fil][col][1]:
                valor = 1
                resultados.append(valor)
            else:
                valor = 0
                resultados.append(valor)
        print(resultados)
    reporte = [resultados[n:n+5] for n in range(0,len(resultados),5)]
    #return reporte
    print(reporte)

    for i in range(0,len(reporte)):
        for j in range(0,len(reporte[i])):
            print(reporte[i][j], end = '\t')
        print('\t')
    
generar_reporte_resultados(matriz)

def el_mas_ganador(marcadores):
    diferencias = []
    diferencia = 0 
    for fil in range(0,len(marcadores)):
        for col in range(0,len(marcadores[fil])):
            if marcadores[fil][col][0] > marcadores[fil][col][1]:
                dif = abs(marcadores[fil][col][0] - marcadores[fil][col][1])
                diferencia = diferencia + dif
        diferencias.append((diferencia,"equipo"+str(fil+1)))
        diferencia = 0
    print(diferencias)
    ganador = max(diferencias)
    #print(ganador[1])
    resultado_equipos={}
    resultado_equipos["mas_ganador"]=ganador[1]
    print(resultado_equipos)
    #return resultado_equipos

el_mas_ganador(matriz)

def el_menos_ganador(marcadores):
    diferencias = []
    diferencia = 0
    for fil in range(len(marcadores)):
        for col in range(len(marcadores[fil])):
            if marcadores[fil][col][0] < marcadores[fil][col][1]:
                dif = abs(marcadores[fil][col][0] - marcadores[fil][col][1])
                diferencia = diferencia + dif
        diferencias.append((diferencia,"equipo"+str(fil+1)))
        diferencia = 0
    print(diferencias)
    perdedor = max(diferencias)
    resultado_equipos = {}
    resultado_equipos["menos_ganador"] = perdedor[1]
    #return resultado_equipos
    print(resultado_equipos)


el_menos_ganador(matriz)