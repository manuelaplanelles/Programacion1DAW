Algoritmo bascula_feriante
	Escribir '*** BIENVENIDO AL RATÓN JUGUETÓN ***'
	Escribir 'Leyendo altura (cm)...'
	Leer altura
	Si altura<0 O altura>230 Entonces
		Escribir 'ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...'
	SiNo
		Si altura<140 Entonces
			Escribir 'LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN.'
		SiNo
			pesoMin <- (altura*2)/8
			Escribir 'Leyendo peso (kg)...'
			Leer peso
			Si peso>120 Entonces
				Escribir 'LO SIENTO. Sobrepasas el límite de la atracción'
			SiNo
				Si peso<pesoMin Entonces
					Escribir 'LO SIENTO. No llegas al peso mínimo'
				SiNo
					Escribir '¡¡SUBE A LA ATRACCIÓN!!'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
